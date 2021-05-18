import GiftTreats.Treat;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Stream;
import java.util.TreeMap;
import java.util.stream.Collectors;



public class Task6 {
    public static void main(String[] args) throws IOException {


        List <String> listtry = Files.readAllLines(Paths.get("abc.txt"))
                .stream()
                .map(l -> l.split(" "))
                .flatMap(Arrays::stream)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listtry);

        Map<String,Integer> counter = new HashMap<>();
        int maxValue = 0;

        for (String x : listtry) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            if (newValue>maxValue) maxValue=newValue;
            counter.put(x, newValue);
        }

        System.out.println(counter);
        System.out.println("Max"+maxValue);

    }}
