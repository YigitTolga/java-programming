package day56_abstraction.driveable;

public class DriveableTest {
    public static void main(String[] args) {
        Tesla model3 = new Tesla();
        model3.hi();
        model3.transportPeople();
        model3.autoPiloting();model3.cost(25);
        model3.stop();
        model3.bye();
        Plane plane =new Plane();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(250);
        plane.land();
        plane.stop();
        plane.bye();
    }
}
