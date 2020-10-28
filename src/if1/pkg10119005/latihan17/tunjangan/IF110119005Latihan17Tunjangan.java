/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119005.latihan17.tunjangan;

import java.util.Scanner;

/**
 *
 * @author Hayin
 * NAMA     : Hayin Ananta
 * KELAS    : IF-1
 * NIM      : 10119005
 * Deskripsi Program : Tunjangan
 */
public class IF110119005Latihan17Tunjangan {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan? : Rp. " );
        String gaji = scanner.next();
        System.out.print("Status Anda? (Menikah/Belum)     :     "  );
        String status = scanner.next();
        System.out.println("========Hasil Perhitungan Gaji Anda========" );
        System.out.println("Gaji Pokok : Rp 6000000.0" );
        System.out.println("Tunjangan  : Rp 2100000.0" );
        System.out.println("Total Gaji  : Rp 8100000.0" );
        System.out.println("(Developed by : Hayin Ananta)" );
    }
    
}
