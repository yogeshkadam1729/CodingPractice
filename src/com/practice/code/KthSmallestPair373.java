package com.practice.code;

import java.util.*;

public class KthSmallestPair373 {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums1.length == 0 || nums2.length == 0 || k == 0) return result;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> (nums1[a[0]] + nums2[a[1]])));

        // Push the first k pairs (nums1[i], nums2[0]) into heap
        for (int i = 0; i < Math.min(k, nums1.length); i++) {
            minHeap.offer(new int[]{i, 0});
        }

        while (k-- > 0 && !minHeap.isEmpty()) {
            int[] pair = minHeap.poll();
            int i = pair[0], j = pair[1];
            result.add(Arrays.asList(nums1[i], nums2[j]));

            // Move to the next pair (i, j+1) in nums2
            if (j + 1 < nums2.length) {
                minHeap.offer(new int[]{i, j + 1});
            }
        }

        return result;
    }

    private record Triple(int sum, int p1, int p2) implements Comparable<Triple> {
        @Override
        public int compareTo(Triple other) {
            return Integer.compare(sum, other.sum);
        }
    };
    public List<List<Integer>> kSmallestPairs1(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        PriorityQueue<Triple> pq = new PriorityQueue<>();

        for (int i = 0; i < Math.min(nums1.length, k); i++) {
            pq.add(new Triple(nums1[i] + nums2[0], i, 0));
        }

        while (ans.size() < k) {
            Triple ele = pq.poll();
            ans.add(List.of(nums1[ele.p1], nums2[ele.p2]));
            int p2_new = ele.p2 + 1;
            if (p2_new < nums2.length) {
                pq.offer(new Triple(nums1[ele.p1] + nums2[p2_new], ele.p1, p2_new));
            }
        }
        return ans;
    }
    public List<List<Integer>> kSmallestPairsMostOptimal(int[] nums1, int[] nums2, int k) {
        return new AbstractList<List<Integer>>() {

            private List<List<Integer>> pairs;

            @Override
            public List<Integer> get(int index) {
                init();
                return pairs.get(index);
            }

            @Override
            public int size() {
                init();
                return pairs.size();
            }

            private void load() {
                int n = nums1.length, m = nums2.length;
                int left = nums1[0] + nums2[0];
                int right = nums1[n - 1] + nums2[m - 1];
                int middle;

                while (left <= right) {

                    middle = (left + right) / 2;

                    long count = getCount(nums1, nums2, middle, k);

                    if (count < k) {
                        left = middle + 1;
                    } else if (count > k) {
                        right = middle - 1;
                    } else {
                        left = middle;
                        break;
                    }
                }
                getPairs(nums1, nums2, left, k);
            }

            private long getCount(int[] nums1, int[] nums2, int goal, int k) {
                int prevRight = nums2.length - 1, count = 0;

                for (int i = 0; i < nums1.length && nums1[i] + nums2[0] <= goal; i++) {
                    int left = 0, right = prevRight, position = -1;

                    while (left <= right) {
                        int middle = (right + left) / 2;
                        int sum = nums1[i] + nums2[middle];

                        if (sum <= goal) {
                            position = middle;
                            left = middle + 1;
                        } else {
                            right = middle - 1;
                        }
                    }
                    if (position >= 0) {
                        count += position + 1;
                        prevRight = position;
                    }
                    if (count > k) {
                        return count;
                    }
                }
                return count;
            }

            private List<List<Integer>> getPairs(int[] nums1, int[] nums2, int sum, int k) {
                pairs = new ArrayList<>();

                for (int i = 0; i < nums1.length; i++) {
                    for (int j = 0; j < nums2.length && nums1[i] + nums2[j] < sum; j++) {
                        pairs.add(Arrays.asList(nums1[i], nums2[j]));
                    }
                }

                for (int i = 0; i < nums1.length; i++) {
                    for (int j = 0; j < nums2.length && nums1[i] + nums2[j] <= sum && pairs.size() < k; j++) {
                        if (nums1[i] + nums2[j] == sum) {
                            pairs.add(Arrays.asList(nums1[i], nums2[j]));
                        }
                    }
                }
                return pairs;
            }

            public void init() {
                if (null == pairs) {
                    load();
                    System.gc();
                }
            }
        };
    }
}
