package com.mycompany.studi_kasus_a;
import java.util.Scanner;

public class App{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
         System.out.println("Selamat Datang di Program Kalkulator Sederhana");
        
         int pilihan;
         
         System.out.print("Masukkan angka Pertama : ");
         double angka1 =input.nextInt();
         System.out.print("Masukkan angka Kedua   : ");
         double angka2 = input.nextInt();
         
         System.out.println("Pilih operasi Matematika : ");
         System.out.println("1. Penjumlahan");
         System.out.println("2. Pengurangan");
         System.out.println("3. Perkalian");
         System.out.println("4. Pembagian");
         System.out.print("Masukkan Pilihan Anda : ");
         pilihan = input.nextInt();
         
         double hasil = 0;
         switch(pilihan){
             case 1 :
                hasil = angka1 + angka2;
                 break;
             case 2 :
                 hasil = angka1-angka2;
                 break;
             case 3 :
                 hasil = angka1 * angka2;
                 break;
             case 4 :
                 hasil = angka1 / angka2;
                 break;
             default :
                 System.out.println("Operasi Matematika Tidak Tersedia");
         }
             System.out.println("Hasil : "+hasil);
       
    }
}