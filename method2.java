/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package method;

import java.util.Scanner;

/**
 *
 * @author Lusi Febi Ristiawan
 */
public class method2 {
    static void Nilai(){
        int batasAwal;
        int batasAkhir;
        int i;
        
        Scanner data = new Scanner(System.in);
        
        System.out.println("Masukkan Batas Awal: ");        
        batasAwal = data.nextInt();
        System.out.println("Masukkan Batas Akhir: ");        
        batasAkhir = data.nextInt();
        
        if(batasAwal >= 1 && batasAkhir <= 100){
            System.out.println("Bilangan Prima:");
            for(i = batasAwal; i <= batasAkhir; i++){
                if((i == 2) || (i == 3) || (i == 5) || (i == 7)){
                    System.out.println(i);
                }
                
                if((i != 1) && (i%2 != 0) && (i%3 != 0) && (i%5 != 0) && (i%7 != 0)){
                    System.out.println(i);
                }
            }
            
            System.out.println("Bilangan Komposit:");
            for(i = batasAwal; i<= batasAkhir; i++){
                if(((i != 2) && (i != 3) && (i != 5) && (i != 7)) && ((i%2 == 0) || (i%3 == 0) || (i%5 == 0) || i%7 == 0)){
                    System.out.println(i);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Nilai();
    }
    
}

