package com.mycompany.evaluasipraktikum;
import java.util.Scanner;
import java.util.ArrayList;


public class App{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        ArrayList<String> belanjaan = new ArrayList<>();
        ArrayList<Integer> harga = new ArrayList<>();
        int pilihan;
        
        do {
            System.out.println("Menu : ");
            System.out.println("1. Tambah Item Belanjaan");
            System.out.println("2. Hapus Item Belanjaan");
            System.out.println("3. Tampilkan Seluruh Item Belanjaan");
            System.out.println("4. Cari Item Belanjaan");
            System.out.println("0. Keluar dari program");
            System.out.print("Pilih menu : ");
            pilihan = input.nextInt();
            input.nextLine();
            
            switch(pilihan){
                case 1 : 
                    System.out.print("Masukkan Nama Item Belanjaan : ");
                    String belanja = input.nextLine();
                    System.out.print("Masukkan Harga Item Belanjaan : ");
                    int hargaa = input.nextInt();
         
                    belanjaan.add(belanja);
                    harga.add(hargaa);
                    System.out.println("Item belanjaan Telah Ditambahkan!");
                    break;
                case 2 :
                    System.out.print("Masukkan Nama Item Belanjaan yang akan dihapus Akan Dihapus : ");
                    belanja = input.nextLine();
                    
                    
                    if(belanjaan.contains(belanja)){
                        int index = belanjaan.indexOf(belanja);
                        belanjaan.remove(index);
                        harga.remove(index);
                        System.out.println("Item Belanjaan Dihapus");
                    } else{
                        System.out.println("");
                    }
                case 3 : 
                    float total = 0;
                    System.out.println("Seluruh Item");
                    System.out.println("==============");
                    
                    for (int i = 0; i < belanjaan.size(); i++) {
                        System.out.println(belanjaan.get(i) + " - " + harga.get(i));
                        total += harga.get(i);
                    }
                    System.out.println("Total harga : Rp."+total);
                    break;
                case 4 : 
                    System.out.println("Masukkan nama item belanjaan yang dicari : ");
                    belanja = input.nextLine();
                    
                    if (belanjaan.contains(belanja)) {
                        int index = belanjaan.indexOf(belanja);
                        System.out.println(belanja + " - Rp." + harga.get(index));
                    }else{
                        System.out.println("Item belanjaan tidak ditemukan");
                    }
                    break;
                case 0 :
                    System.out.println("Program selesai");
                    return;
                    
                default :
                    System.out.println("Pilihan tidak valid");
                }
            
        } while (pilihan != 0);
    }
}