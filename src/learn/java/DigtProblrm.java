/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learn.java;

/**
 *
 * @author khale
 */
import java.util.Scanner;

public class DigtProblrm {

    public static void main(String[] args) {

        Scanner M = new Scanner(System.in);

        int num = M.nextInt();
        int k = M.nextInt();

        for (int i = 1; i < k; i++) {

            num /= 10;

        }
        System.out.println(num % 10);

    }

}
