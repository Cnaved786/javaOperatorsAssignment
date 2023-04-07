import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type any Integer number");
        int x=sc.nextInt();
        int result=((((x+8)/3)%5)*5);
        System.out.println(result);
    }
}
