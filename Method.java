/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package method;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class Method {
    
    static int bilangan (int a){
        if (a > 999){
            System.out.println("Ribuan");
        }
        else {
            System.out.println("Bukan Ribuan");
        }
        return a;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bil;
        Scanner data = new Scanner(System.in);
        bil = data.nextInt();
        
//        bilangan(90);
        System.out.println(bilangan(bil));
        
        // TODO code application logic here
    }
    
}
