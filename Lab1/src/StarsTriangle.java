
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author longn
 */
public class StarsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = n-i; j >= 1; j--) System.out.print(" ");
            for(int k = 0; k < i*2+1; k++) System.out.print("*"); 
            System.out.print("\n");
        }
    }
}
