import java.util.Scanner;
class KilometerToMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter distance in kilometers:");
        double km = sc.nextDouble();
		double m = km * 0.621371;
        System.out.println(km + " kilometers is equal to " + m + " miles.");
    }
}
