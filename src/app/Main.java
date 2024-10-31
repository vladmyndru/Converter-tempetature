package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter-temperature");

        double fahrenheit = 80;
        double celsius = fahrenheitToCelsius(fahrenheit);
        System.out.println("Result is: " + fahrenheit + " F is " + celsius +
                " C.");
    }

    public static double fahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32)* 5/9;
    }
}
