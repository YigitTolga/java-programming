package day48_constructors_static;

import java.util.ArrayList;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1 = new Customer();
        System.out.println(cs1);
        cs1.setId(1);
        cs1.setName("Bob");
        System.out.println(cs1);
        Customer cs2 = new Customer("Mike", 2);
        Customer cs3 = new Customer("Cabbar", 3);

        System.out.println(cs1);
        System.out.println(cs2);
        System.out.println(cs3);
        Customer[] todaysCustomers = {cs1, cs2, cs3, new Customer("Bashir", 449)};
        ArrayList<Customer> newList = new ArrayList<>();
        newList.add(cs1);
        newList.add(cs2);
        newList.add(cs3);
        newList.add(new Customer("cengiz", 25));
        newList.add(0, new Customer("Mahmut",35));
        System.out.println(newList);

    }
}
