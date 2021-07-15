package day62_collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> cities = new LinkedList<>();
        List<String> schools = new LinkedList<>();
        cities.add("Mclean");
        cities.add("Vienna");
        cities.add("New York");
        cities.add("New York");
        System.out.println(cities);
        System.out.println(cities.get(1));
        cities.add(5,"Fairfax");
        System.out.println(cities);
    }
}
