package Cau1;

import java.util.Scanner;
public class P1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap chuoi:");
        String input = sc.nextLine();
        
        char result = '_';

        for (int i = 0; i<input.length();i++){
            int count = 0;
            for(int j =0;j<input.length();j++){
                if(input.charAt(i)==input.charAt(j)){
                    count++;
                }
            }
            if(count==1){
                result = input.charAt(i);
                break;
            }
        }
        System.out.println("Ket qua: ");
        System.out.println(result);
    }
}
