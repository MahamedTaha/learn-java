/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn.java;

import java.util.Scanner;

/**
 *
 * @author khale
 */
public class AvgProblem {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);

        System.out.print("Enter the number of numbers you want to average : ");
        int count = M.nextInt();

        int sum = 0;
        for (int a = 1; a <= count; a++) {

            System.out.print("enter num " + a + " : ");
            int num = M.nextInt();

            sum += num;

        }
        System.out.println("The Avarge : " + sum / count);
    }
}
