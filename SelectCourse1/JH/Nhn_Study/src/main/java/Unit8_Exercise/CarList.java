package Unit8_Exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class CarList {

    private String filename;

    public CarList(String filename) {
        this.filename = filename;
    }

    int countNewCars() throws IOException {

        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);

        int count = 0;
        Car c = Car.read(br);

        while (c != null) {
            if (c.getMileage() == 0) {
                count++;
            }
            c = Car.read(br);
        }
        br.close();
        return count;
    }

    public Car mostExpensiveCar() throws IOException {

        FileInputStream fis = new FileInputStream(filename);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);


        double max = 0;
        Car cmax = null;

        Car c = Car.read(br);

        while (c != null) {
            if (c.getPrice() > max) {
                max = c.getPrice();
                cmax = c;
            }
            c = Car.read(br);
        }
        br.close();
        return cmax;
    }

    public void addCar(Car c) throws IOException {
        FileWriter fw = new FileWriter(filename, true);
        PrintWriter pw = new PrintWriter(fw);

        pw.println(c.getModel());
        pw.println(c.getYearOfManufacture());
        pw.println(c.getMileage());
        pw.println(c.getPrice());
        pw.close();

    }

    public void removeCar(Car c) throws IOException {
        File f = new File(filename);
        FileInputStream fis = new FileInputStream(f);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        File ftemp = new File("cars-temporary.txt");
        FileOutputStream fos = new FileOutputStream(ftemp);
        PrintWriter pw = new PrintWriter(fos);

        Car curr = Car.read(br);

        while (curr != null) {
            if (!curr.equalTo(c)) {
                pw.println(curr.getModel());
                pw.println(curr.getYearOfManufacture());
                pw.println(curr.getMileage());
                pw.println(curr.getPrice());
            }
            curr = Car.read(br);
        }
        br.close();
        pw.close();

        ftemp.renameTo(f);
    }

    public static void main(String[] args) {
        // Provide the filename for your CarList
        String filename = "carList.txt";

        // Create a CarList object
        CarList carList = new CarList(filename);

        try {
            // Add a car to the list
            Car car1 = new Car("sports", 2023, 0, 50000);
            carList.addCar(car1);

            // Add more cars to the list
            Car car2 = new Car("sedan", 2022, 2000, 30000);
            carList.addCar(car2);

            Car car3 = new Car("SUV", 2021, 5000, 40000);
            carList.addCar(car3);

            // Count the number of new cars
            int newCarCount = carList.countNewCars();
            System.out.println("Number of new cars: " + newCarCount);

            // Find the most expensive car
            Car mostExpensive = carList.mostExpensiveCar();
            if (mostExpensive != null) {
                System.out.println("Most expensive car:\n" + mostExpensive);
            } else {
                System.out.println("No cars in the list.");
            }

            // Remove a car from the list (assuming you have a Car object to remove)
            // Car carToRemove = ...; // Create a Car object to remove
            // carList.Remove(carToRemove);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

