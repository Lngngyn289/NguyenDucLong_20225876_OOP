
import java.util.Scanner;


public class LinearEqtOneVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a");
        double a = sc.nextDouble();
        System.out.println("Input b");
        double b = sc.nextDouble();
        if(a == 0){
            if(b == 0){
                System.out.println("Vo so nghiem");
            }
            else{
                System.out.println("Vo nghiem");
            }
        }else{
            double result = -b/a;
            System.out.println("Result is " + result);
        }
    }
}
