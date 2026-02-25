package Cau3;

import java.util.Scanner;

public class C3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong phan tu: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Nhap phan tu (chi 0, 1, 2):");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                count0++;
            } else if(arr[i] == 1){
                count1++;
            } else if(arr[i] == 2){
                count2++;
            }
        }
        int index = 0;

        for(int i = 0; i < count0; i++){
            arr[index++] = 0;
        }
        for(int i = 0; i < count1; i++){
            arr[index++] = 1;
        }
        for(int i = 0; i < count2; i++){
            arr[index++] = 2;
        }
        System.out.println("Mang sau khi sap xep:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}