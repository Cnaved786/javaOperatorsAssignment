import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b= sc.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping the number are:" +a+ " "+b);
    }
    //create method for swap two number without third variable


}
