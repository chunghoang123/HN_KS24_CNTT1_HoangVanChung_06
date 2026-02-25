package Cau1;

import java.util.Scanner;
public class P2 {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String input = sc.nextLine().toLowerCase().trim();
        String[] words = input.split("\\s+");  
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += Character.toUpperCase(words[i].charAt(0))
                      + words[i].substring(1);

            if (i != words.length - 1) {
                result += " ";   
            }
        }
        System.out.println("Ket qua: ");
        System.out.println(result);
    }
}

