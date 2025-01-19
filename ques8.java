import java.util.Scanner;
public class ques8{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.println("Enter both numbers");
	int base = sc.nextInt();
        int exponent = sc.nextInt();

    	double result = Math.pow(base, exponent);
        System.out.println("Result is " + result);
}
}
