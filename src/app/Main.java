package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("Converter-temperature");

        double fahrenheit = 80;
        double cel = 40;
        double celsius = fahrenheitToCelsius(fahrenheit);
        double fahr = celsiusToFahrenheit(cel);
        System.out.println("Result is: " + fahrenheit + " F is " + celsius +
                " C.");
        System.out.println("Result is: " + cel + " C is " + fahr +
                " F.");
    }

    public static double fahrenheitToCelsius (double fahrenheit) {
        return (fahrenheit - 32)* 5/9;
    }
    public static double celsiusToFahrenheit (double cel) {
        return (cel *9/5) + 32;
    }
}
