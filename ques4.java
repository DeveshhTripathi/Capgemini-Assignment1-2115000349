import java.util.Scanner;
public class ques4{
	public static void main(String Args[]){
	float pie = 22f/7;
	Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of radius");
	float radius = sc.nextFloat();
	float Area =  pie  * radius*radius;
	System.out.println("The area of circle is" + Area );
}
}
