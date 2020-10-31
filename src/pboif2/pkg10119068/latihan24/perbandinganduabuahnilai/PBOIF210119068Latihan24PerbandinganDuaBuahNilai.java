/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119068.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan perbandingan dua buah nilai
 */
public class PBOIF210119068Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void nPembanding(double nilaiPertama, double nilaiKedua){
        if (nilaiPertama == nilaiKedua){
            System.out.println("Hasil : " + nilaiPertama + " Sama Dengan " + nilaiKedua);
        }else if (nilaiPertama > nilaiKedua){
            System.out.println("Hasil : " + nilaiPertama + " Lebih Besar Dari " + nilaiKedua);
        }else {
            System.out.println("Hasil : " + nilaiPertama + " Lebih Kecil Dari " + nilaiKedua);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        int nilaiPertama = 0 ;
        int nilaiKedua = 0 ;
        String ulangiLagi ;
        boolean kondisi  ;
        
        System.out.println("----------program Perbandingan Nilai----------");
        do {
            System.out.print("Masukan Nilai Pertama : ");
            nilaiPertama = keyboard.nextInt();
            
            System.out.print("Masukan Nilai kedua : ");
            nilaiKedua = keyboard.nextInt();
            
            nPembanding(nilaiPertama,nilaiKedua);
            
            System.out.println();
            System.out.print("Ulangi Aktivitas? (Ya/Tidak) : ");
            ulangiLagi = keyboard.next();
            kondisi = "Ya".equals(ulangiLagi);
            System.out.println();
        }while (kondisi == true);
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
    
}
