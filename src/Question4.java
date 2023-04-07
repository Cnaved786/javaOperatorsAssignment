import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=50;
        int b=70;
        if(a<50 && a<b){
            System.out.println("true");
        }
        if(a<50 ||a<b){
            System.out.println("true");
        }
    }
}
