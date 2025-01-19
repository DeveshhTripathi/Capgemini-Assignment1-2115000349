import java.util.Scanner;
public class ques3{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the temperature in Celsius");
	float Celsius = sc.nextFloat();
	float Fahrenheit = (Celsius * 9/5) + 32;
	System.out.println("The temperature in Fahrenheit will be" + Fahrenheit );
}	
}
