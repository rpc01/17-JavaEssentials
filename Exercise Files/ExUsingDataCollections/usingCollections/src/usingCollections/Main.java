package usingCollections;


import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.*;



public class Main {

    public static void main(String[] args) {

        System.out.println("Array of primitives");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array of strings");
        String[] strings = {"Red", "Green", "Blue"};
        Arrays.sort(strings);
        for (String color : strings) {
            System.out.println(color);
        }

        System.out.println("Setting an initial size");
        int[] sized = new int[10];
        for (int i = 0; i < sized.length; i++) {
            sized[i] = i * 20;
        }
        for (int value : sized) {
            System.out.println(value);
        }

        System.out.println("Copying an array");
        int[] copied = new int[5];
        System.arraycopy(sized, 5, copied, 0, 5);
        for (int value : copied) {
            System.out.println(value);
        }
        
        //lists
        
        List<String> list = new ArrayList<>();

        list.add("California");
        list.add("Oregon");
        list.add("Washington");
        list.add("2");

        System.out.println(list);

        list.add("Alaska");
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        String state = list.get(1);
        System.out.println("The second state is " + state);

        int pos = list.indexOf("Alaska");
        System.out.println("Alaska is at position " + pos);
        
        
        //Hashmaps
        

        Map<String, String> map = new HashMap<>();
        map.put("California", "Sacramento");
        map.put("Oregon", "Salem");
        map.put("Washington", "Olympia");
        System.out.println(map);

        map.put("Alaska", "Juneau");
        System.out.println(map);

        String cap = map.get("Oregon");
        System.out.println("The capitol of Oregon is " + cap);

        map.remove("California");
        System.out.println(map);
        

    	//Iterations
    
    System.out.println("Ordered data");
    List<String> list1 = new ArrayList<String>();
    list1.add("California");
    list1.add("Oregon");
    list1.add("Washington");

    System.out.println("toString() output");
    System.out.println(list1);
    System.out.println("");

    System.out.println("ArrayList iterator");
    Iterator<String> iterator = list1.iterator();
    while (iterator.hasNext()) {
        String value = iterator.next();
        System.out.println(value);
    }
    System.out.println("");

    System.out.println("ArrayList ForEach");
    for (String value : list1) {
        System.out.println(value);
    }
    System.out.println("");

    System.out.println("Java 8 method reference");
    list1.forEach(System.out::println);
    System.out.println("");

    System.out.println("Unordered data");
    Map<String, String> map1 = new HashMap<String, String>();
    map1.put("California", "Sacramento");
    map1.put("Oregon", "Salem");
    map1.put("Washington", "Olympia");
    System.out.println(map1);
    System.out.println("");

    System.out.println("HashMap Iterator");
    Set<String> keys = map1.keySet();
    Iterator<String> iterator1 = keys.iterator();
    while (iterator1.hasNext()) {
        String key = iterator1.next();
        System.out.println("The capitol of " + key + " is " + map1.get(key));
    }
    System.out.println("");

    System.out.println("HashMap ForEach");
    for (String key : keys) {
        System.out.println("The capitol of " + key + " is " + map1.get(key));
    }
    System.out.println("");
    
    }
}

