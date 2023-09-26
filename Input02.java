/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author MSI
 */

import java.util.Scanner;

public class Input02 {
    public static void main(String[] args) {
        Scanner Perkenalan = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = Perkenalan.nextLine();
        
        System.out.print("Nim  : ");
        String nim = Perkenalan.nextLine();
        
        System.out.println("Hallo " + nama + "("+ nim + ")" + "\nSalam Kenal");
        
    }
}
