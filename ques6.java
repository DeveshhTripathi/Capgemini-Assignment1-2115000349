import java.util.Scanner;
public class ques6{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Amount of Principal");
	float Principal = sc.nextFloat();
	System.out.println("Enter the amount of Rate");
	float Rate = sc.nextFloat();
	System.out.println("Enter the amount of Time");
	float Time = sc.nextFloat();
	float Simple_Interest = (Principal * Rate * Time) / 100;
	System.out.println("Simple Interest on it is"+ Simple_Interest);

}
}
