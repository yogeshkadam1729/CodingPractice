package com.practice.code;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class JavaRefferenceTest {

    public static void main(String args[]) throws InterruptedException {
        MyObject obj = new MyObject();
        WeakReference<MyObject> weakRef = new WeakReference<>(obj);

        // obj is still strongly referenced here
        System.out.println("Object before nullifying strong reference: " + weakRef.get());

        obj = null; // Now obj is only weakly referenced

        // Suggest GC to run
        System.gc();

        // After GC, weakly referenced object might be collected
        System.out.println("Object after GC: " + weakRef.get()); // May print null

        /* phantom refference*/

        ReferenceQueue<MyResource> referenceQueue = new ReferenceQueue<>();
        MyResource resource = new MyResource();
        PhantomReference<MyResource> phantomRef = new PhantomReference<>(resource, referenceQueue);

        // Clear strong reference, making the object eligible for GC
        resource = null;

        // Suggest garbage collection
        System.gc();

        // Poll the reference queue to check if the phantom reference has been enqueued
        PhantomReference<?> refFromQueue = (PhantomReference<?>) referenceQueue.remove(); // Blocks until object is ready for collection

        if (refFromQueue != null) {
            System.out.println("Phantom reference enqueued, ready for cleanup.");
            // Perform any necessary cleanup or post-finalization work
        }



    }
}
class MyObject {
    @Override
    public String toString() {
        return "I am MyObject!";
    }
}
class MyResource {
    void cleanup() {
        System.out.println("Resource cleaned up.");
    }
}