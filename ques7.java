import java.util.Scanner;
public class ques7{
	public static void main(String Args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter length");
	float length = sc.nextFloat();
	System.out.println("Enter width");
	float width = sc.nextFloat();
	float Perimeter = 2 * (length + width);
	System.out.println("Perimeter of ractangle" + Perimeter);
}
}
