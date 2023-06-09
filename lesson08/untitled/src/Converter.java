public class Converter {
    //Ceate a class named ‘Converter’ with methods to convert different values: 1) centimeters to inches and vice versa  2) meters to yards and vice versa 3) Celsius to Fahrenheit and vice versa
    
    public static void main(String[] args) {
        System.out.println("1 inch = " + centimetersToInches(1) + " cm");
        System.out.println("1 cm = " + inchesToCentimeters(1) + " inches");
        System.out.println("1 meter = " + metersToYards(1) + " yards");
        System.out.println("1 yard = " + yardsToMeters(1) + " meters");
        System.out.println("1 Celsius = " + celsiusToFahrenheit(1) + " Fahrenheit");
        System.out.println("1 Fahrenheit = " + fahrenheitToCelsius(1) + " Celsius");
    }

    public static double centimetersToInches(double centimeters) {
        return centimeters / 2.54;
    }

    public static double inchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double metersToYards(double meters) {
        return meters * 1.09361;
    }

    public static double yardsToMeters(double yards) {
        return yards / 1.09361;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 1.8 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }
}




