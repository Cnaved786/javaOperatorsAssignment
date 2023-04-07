import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y= sc.nextInt();
        int count=0;
        int z=x^y;
        while (z!=0){
            z=z & z-1;
            count++;
        }
        System.out.println(count);
    }
}
