
import java.util.Scanner;


public class SecondDegEquation {
    public static void main(String[] args) {
        // ax^2 + bx + c = 0;
        //a always != 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a");
        double a = sc.nextDouble();
        System.out.println("Nhap b");
        double b = sc.nextDouble();
        System.out.println("Nhap c");
        double c = sc.nextDouble();
        double delta = b*b - 4*a*c;
        if(delta < 0){
            System.out.println("Vo nghiem");
        }
        else if(delta == 0){
            
            System.out.println("X1 = X2 = " + -b/(2*a));
        }
        else{
            System.out.println("X1 = " + (-b + Math.sqrt(delta))/(2*a) + " X2 = " + (-b - Math.sqrt(delta))/(2*a));
        }
    }
}
