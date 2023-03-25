/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.altriaa.praktikum4_4;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Praktikum4_4 {
    public static void main(String[] args) {
        // Tugas No 4 (Perulangan bertingkat)
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Height: ");
        int n = input.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}
