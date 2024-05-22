package activity1;
import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("Enter a temperature in Fahrenheit.");
		
		Scanner temperature = new Scanner (System.in);
		
		int tempFahr = temperature.nextInt();
		
		double tempCel = ((double)tempFahr-32)*5/9;
		
		System.out.println("The temperature in Fahrenheit you enterd is " + tempFahr);
		System.out.println("The equivalent Celsius temperature is " + tempCel);
		

	}

}
