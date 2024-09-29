
import java.util.Scanner;


public class LinearEqtTwoVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a11 ");
        double a11 = sc.nextDouble();
        System.out.println("Nhap a12 ");
        double a12 = sc.nextDouble();
        System.out.println("Nhap b1 ");
        double b1 = sc.nextDouble();
        System.out.println("Nhap a21 ");
        double a21 = sc.nextDouble();
        System.out.println("Nhap a22 ");
        double a22 = sc.nextDouble();
        System.out.println("Nhap b2 ");
        double b2 = sc.nextDouble();
        double D = a11*a22 - a21*a12;
        double D1 = b1*a22 - b2*a12;
        double D2 = b2*a11 - b1*a21;
        if(D == 0){
            if(D1 == 0 && D2 == 0){
                System.out.println("Vo so nghiem");
                return;
            }
            else{
                System.out.println("Vo nghiem");
                return;
            }
        }
        System.out.println("X1 = " + D1/D + " and X2 = " + D2/D);
    }
}
