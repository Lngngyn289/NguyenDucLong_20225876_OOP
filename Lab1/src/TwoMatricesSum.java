
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author longn
 */
public class TwoMatricesSum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A[][] = new int[n][m];
        int B[][] = new int[n][m];
        int sum[][] = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) A[i][j] = sc.nextInt();
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++) B[i][j] = sc.nextInt();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum[i][j] = A[i][j] + B[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
