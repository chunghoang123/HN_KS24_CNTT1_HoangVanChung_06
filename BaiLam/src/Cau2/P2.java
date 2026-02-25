package Cau2;

import java.util.Scanner;

public class P2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        System.out.println("Nhap phan tu:");
        for (int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        B[0] = 1;
        for (int i = 1; i < n; i++){
            B[i] = B[i - 1] * A[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--){
            B[i] = B[i] * rightProduct;
            rightProduct = rightProduct * A[i];
        }
        System.out.println("Mang B:");
        for (int i = 0; i < n; i++){
            System.out.print(B[i] + " ");
        }
    }
}