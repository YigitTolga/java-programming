package day56_abstraction.driveable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("Tesla is transport people people on the road");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla cost "+ (mile*0.10) + " to drive "+ mile + " miles");
    }

    @Override
    public void autoPiloting() {
        System.out.println("Tesla transporting  ");
    }

    @Override
    public void hi() {
        System.out.println("saying hello beep beep");
    }

    @Override
    public void bye() {
        System.out.println("saying bye bye charge me charge me");
    }
}
