package com.practice.code;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class TestJavaStream {

    private static List<TaxEntry> list = new ArrayList<>();
    static {
        list.add(new TaxEntry("Maharashtra","Mumbai",47,223.32));
        list.add(new TaxEntry("Maharashtra","Mumbai",51,253.32));
        list.add(new TaxEntry("Maharashtra","Mumbai",65,423.32));
        list.add(new TaxEntry("Maharashtra","Pune",5,12.32));
        list.add(new TaxEntry("Karnataka","Bengluru",24,146.21));
        list.add(new TaxEntry("Karnataka","Bengluru",34,201.41));
        list.add(new TaxEntry("Karnataka","Bengluru",44,246.81));
        list.add(new TaxEntry("Karnataka","Mysore",2,11.12));
        list.add(new TaxEntry("TamilNadu","Chennai",14,130.42));
        list.add(new TaxEntry("Kerala","Kochi",6,56.31));
        list.add(new TaxEntry("Delhi","Delhi",12,123.32));
        list.add(new TaxEntry("Telnagana","Hyderabad",20,135.32));
        list.add(new TaxEntry("Maharashtra","NewMumbai",9,14.67));
    }
    public static void main(String a[])
    {
        Map<String,Integer> numberOfEntriesByCity = list.stream().collect(
                        groupingBy(TaxEntry::getCity,Collectors.summingInt(TaxEntry::getNumEntries))).entrySet().stream()
                .sorted(Map.Entry.<String,Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(numberOfEntriesByCity);

        Map<String,Map<String,Object>> aggregationByStateCity = list.stream().collect(Collectors.groupingBy(
                p -> p.getState()+"||"+p.getCity(),Collectors.collectingAndThen(Collectors.toList(),
                            list1 -> {
                                int numEntries = list1.stream().collect(summingInt(TaxEntry::getNumEntries));
                                double prices = list1.stream().collect(summingDouble(TaxEntry::getPrice));
                                Map<String,Object> resultMap = new HashMap<>();
                                resultMap.put("numOfEntries",numEntries);

                                resultMap.put("Totalprice",prices);
                                return resultMap;
                            }
                        ))).entrySet().stream().sorted(Map.Entry.<String,Map<String,Object>>comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue) -> oldValue, LinkedHashMap::new));
        Set<String> keys = aggregationByStateCity.entrySet().stream().flatMap(
                e -> e.getValue().entrySet().stream().map(innerEntry -> innerEntry.getKey()))
                        .collect(Collectors.toSet());
        System.out.println(keys);
        System.out.println(aggregationByStateCity);

        /*Map<StateCityGroup, TaxEntryAggregation> aggregationByStateCity = list.stream().collect(
                groupingBy(p -> new StateCityGroup(p.getState(),p.getCity()),Collectors.collectingAndThen(Collectors.toList(),
                        list1 -> {int entriers = list1.stream().collect(summingInt(TaxEntry::getNumEntries));
                            double priceAverage = list1.stream().collect(summingDouble(TaxEntry::getPrice));
                            return new TaxEntryAggregation(entriers,priceAverage, BigDecimal.ZERO,1);
                        }
                )));

        BigDecimal.valueOf(2);

        Map<String, TaxEntryAggregation> weightedAverageByState = list.stream().collect(
                groupingBy(TaxEntry::getState,
                        mapping(p -> new TaxEntryAggregation(p.getNumEntries(),p.getPrice(),BigDecimal.ZERO,1),
                                collectingAndThen(reducing(new TaxEntryAggregation(0,0,BigDecimal.ZERO,0),
                                                (u1,u2) -> new TaxEntryAggregation(u1.getNumEntries()+u2.getNumEntries(),
                                                        u1.getPrice()+u2.getPrice(),
                                                        u1.getWightedAverage().add(u2.getWightedAverage()),
                                                        u1.getCount()+u2.getCount()
                                                )),
                                        u -> new TaxEntryAggregation(u.getNumEntries(),u.getPrice(),BigDecimal.valueOf(u.getPrice()/u.getCount()).round(MathContext.DECIMAL32),u.getCount())
                                ))));

        System.out.println(weightedAverageByState);*/

    }
}

