package day46_encapsulation;

public class Car {
    // encapsulated/hidden  instance variables
    private String model;
    private int year;
    private int mileage;

    // setter method
    public void setModel(String carModel) {
        model = carModel;
    }

    // getter method
    public String getModel() {
        return model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getMileage() {
        return mileage;
    }

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }


}