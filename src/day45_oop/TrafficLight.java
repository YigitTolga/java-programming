package day45_oop;

public class TrafficLight {

    String color;

    public void showColor() {
        System.out.println("Current color  " + color);
    }
    public void changeColor(String newColor){
        System.out.println("Changing color to "+ newColor);
        color = newColor;

    }

}