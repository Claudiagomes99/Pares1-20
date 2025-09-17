/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pares1a20;

/**
 *
 * @author Gomes
 */
 import java.util.Scanner;
public class Pares1a20 {

  public static void main(String[] args) {
        int i = 1;

        System.out.println("Números pares entre 1 e 20:");
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 20);
    }
}