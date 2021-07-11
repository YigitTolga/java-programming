package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {
    @Override
    public void autoPiloting() {
        System.out.println("Flying on aouto-pilot mode");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying people one city to another");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost "+ (mile*25) + " to fly "+ mile + " miles");    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard ");
    }

    @Override
    public void bye() {
        System.out.println("Thanks flying wth us");

    }

    public void land() {
        System.out.println("Plane is landing please buckle up");
    }
}
