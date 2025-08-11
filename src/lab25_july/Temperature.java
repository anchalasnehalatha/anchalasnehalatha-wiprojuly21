package lab25_july;

public class Temperature {
    private double celsius;
    //settermethod
    public void setCelsius(double celsius) {
        if (celsius >= -273.15) {
            this.celsius = celsius;
        } else {
            System.out.println("Temperature can't be below absolute zero (-273.15°C). Setting to -273.15.");
            this.celsius = -273.15;
        }
    }

    // getter method
    public double getCelsius() {
        return celsius;
    }

    // Convert to Fahrenheit
    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    // Convert to Kelvin
    public double toKelvin() {
        return celsius + 273.15;
    }

    // Displaying all details
    public void displayDetails() {
        System.out.println("Temperature in Celsius: " + celsius + "°C");
        System.out.println("Temperature in Fahrenheit: " + toFahrenheit() + "F");
        System.out.println("Temperature in Kelvin: " + toKelvin() + "K");
        System.out.println("------------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        t1.setCelsius(25);  
        t1.displayDetails();

        Temperature t2 = new Temperature();
        t2.setCelsius(-300); 
        t2.displayDetails();
    }
}
