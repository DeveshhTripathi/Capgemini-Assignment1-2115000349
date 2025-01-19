import java.util.Scanner;
public class ques5{
	public static void main(String Args[]){
	float pie = 22f/7;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of radius");
	float radius = sc.nextFloat();
	System.out.println("Enter the height");
	float height = sc.nextFloat();
	float volume = pie  * (radius*radius) * height;
	System.out.println("Volume of Cylinder is" + volume);
}
}
