import java.util.Scanner;
public class ques10
 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometers:");
        double kilometers = sc.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("The distance in miles is: " + miles);
    }
}
