package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Car {

    private String model;
    private int yearOfManufacture;

    private int mileage;
    private double price;

    public Car(String model, int yearOfManufacture, int mileage, double price) {
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.mileage = mileage;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    public boolean equalTo(Car c) {
        return this.model.equals(c.model) && this.yearOfManufacture == c.yearOfManufacture
                && this.mileage == c.mileage && this.price == c.price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("model : ").append(model).append("\n");
        sb.append("yearOfManufacture : ").append(yearOfManufacture).append("\n");
        sb.append("mileage : ").append(mileage).append("\n");
        sb.append("price : ").append(price);

        return sb.toString();
    }


    public static Car read(BufferedReader br) throws IOException {
        String s = br.readLine();
        if (s == null) {
            return null;
        } else {
            return new Car(s, Integer.parseInt(br.readLine()), Integer.parseInt(br.readLine()),
                    Double.parseDouble(br.readLine()));
        }
    }
}
