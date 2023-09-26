/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Input01;

/**
 *
 * @author MSI
 */
import java.util.Scanner;

public class Input06 {
    public static void main(String[] args) {
        Scanner Login = new Scanner(System.in);
        String Username,Password,Status;
        
        System.out.print("Username : ");
        Username = Login.nextLine();
        
        System.out.print("Password : ");
        Password = Login.nextLine();
        
        if(Username.equals("apa") && Password.equals("rahasia")){
            System.out.println("Login Berhasil");
        } else {
            System.err.println("Login Gagal");
        }
    }
}

