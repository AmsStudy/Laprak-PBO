package com.mycompany.studikasus_b;
import java.util.Scanner;
import java.util.ArrayList;

public class App{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        ArrayList <String> mahasiswa = new ArrayList<>();
        
        int pilihan = 0;
        
        do{
            System.out.println("1. Tambah Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar dari program");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();
            
            switch(pilihan){
                case 1 :
                    System.out.print("Masukkan Nama Mahasiswa : ");
                    String mhs = input.nextLine();
                    
                    mahasiswa.add(mhs);
                    System.out.println("Mahasiswa telah ditambahkan!");
                    break;
                case 2 : 
                    System.out.println("Daftar seluruh mahasiswa :");
                        for (var value : mahasiswa) {
                            System.out.println("Nama : " + value);
                        }
                    break;
                case 0 : 
                    break;
                 default :
                     System.out.println("Pilihan tidak tersedia!");
                }
                    System.out.println();
            }while(pilihan != 0);
        }
        
    }
