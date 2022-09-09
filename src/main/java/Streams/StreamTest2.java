package Streams;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

public class StreamTest2 {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("manzana", 10, new BigDecimal("99.99")),
                new Item("platano", 20, new BigDecimal("19.99")),
                new Item("naranja", 10, new BigDecimal("29.99")),
                new Item("sandia", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("manzana", 10, new BigDecimal("9.99")),
                new Item("platano", 10, new BigDecimal("19.99")),
                new Item("manzana", 20, new BigDecimal("9.99"))
        );

        //agrupando por nombre y sumando las cantidades
        Map<String, Long> counting = items.stream().collect(
                Collectors.groupingBy(Item::getNombre, Collectors.counting()));

        //System.out.println(counting);

        Map<String, Integer> sum = items.stream().collect(
                Collectors.groupingBy(Item::getNombre, Collectors.summingInt(Item::getCantidad)));

        //System.out.println(sum);


        //Agrupando por precio
        Map<BigDecimal, List<Item>> groupByPriceMap =
                items.stream().collect(Collectors.groupingBy(Item::getPrice));

        System.out.println(groupByPriceMap);
/*
        Set<Map.Entry<BigDecimal, List<Item>>> mapentry = groupByPriceMap.entrySet();

        for (Map.Entry<BigDecimal, List<Item>> e: mapentry) {
           //System.out.println("llave: "+ e.getKey()+" valor: "+e.getValue());
        }
        Collection<List<Item>> values = groupByPriceMap.values();

        for(List<Item> li: values){
            //System.out.println(li);
        }

        Set<BigDecimal> llaves = groupByPriceMap.keySet();
        for(BigDecimal bi: llaves){
            System.out.println(bi);
        }
 */
        groupByPriceMap.keySet().forEach(c-> System.out.println(c));
        groupByPriceMap.values().forEach(System.out::println);
        /*
        System.out.println("keys");
        groupByPriceMap.keySet().forEach(c-> System.out.println(c));
        System.out.println("valores");
        groupByPriceMap.values().forEach(System.out::println);
        System.out.println("keys y values");

        groupByPriceMap.entrySet().forEach(entry -> System.out.println("key: "+entry.getKey() +" - valor: "+entry.getValue()));

         */
        // agrupando por precio, usando 'mapping' to convertir List<Item> a Set<String>
        Map<BigDecimal, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getPrice,
                                Collectors.mapping(Item::getNombre, Collectors.toSet())
                        )
                );

        System.out.println(result);
    }
}
