
package com.mycompany.ayu_siregar;

import java.util.Scanner;

 
public class Ayu_Siregar {
    public static void main(String[] args) {
       System.out.println("ayu astuti siregar");
        System.out.println("2209010077");
        System.out.println(" ** Operator Penugasan **");
        System.out.println("===========");
        Scanner userInput = new Scanner (System.in);
        System.out.println("Gunakan angka untuk memilih opsi");
        System.out.println("1. Penambahan +=");
        System.out.println("2. Pengurangan -=");
        System.out.println("3. Pengkalian *=");
        System.out.println("4. Pembagian /=");
        System.out.println("5. Sisa bagi %=");
        
        System.out.print("input:");
        int input = userInput.nextInt();
        
    if (input == 1){
        System.out.println("Penambahan +=");
        System.out.println("Masukan angka pertama");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka kedua");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1+nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    }   else{
        System.out.println("Tolong masukan nilai yang benar");
    }
    
    
    if (input == 2){
        System.out.println("Pengurangan -=");
        System.out.println("Masukan angka pertama");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka kedua");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1-nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
        
    if (input == 3){
        System.out.println("Perkalian *=");
        System.out.println("Masukan angka pertama");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka kedua");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1*nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
    
    if (input == 4){
        System.out.println("Pembagian /=");
        System.out.println("Masukan angka pertama");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka kedua");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1/nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    
        
    }
    if (input == 5){
        System.out.println("Sisa bagi %=");
        System.out.println("Masukan angka pertama");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka kedua");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1%nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
    
    
    
    
    
        System.out.println(" ** Operator Pembanding **");
        System.out.println("===========");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();

        
        boolean Lebih_besar = (angka1 > angka2);
        boolean Lebih_kecil = (angka1 < angka2);
        boolean Sama_dengan = (angka1 == angka2);
        boolean Tidak_sama_dengan = (angka1 != angka2);
        boolean Lebih_besar_sama_dengan = (angka1 >= angka2);
        boolean LEbih_kecil_sama_dengan = (angka1 <= angka2);
        

        
        System.out.println(angka1 + " > " + angka2 + " adalah " + Lebih_besar);
        System.out.println(angka1 + " < " + angka2 + " adalah " + Lebih_kecil);
        System.out.println(angka1 + " == " + angka2 + " adalah " + Sama_dengan);
        System.out.println(angka1 + " != " + angka2 + " adalah " + Tidak_sama_dengan);
        System.out.println(angka1 + " >= " + angka2 + " adalah " + Lebih_besar_sama_dengan);
        System.out.println(angka1 + " <= " + angka2 + " adalah " + LEbih_kecil_sama_dengan);

        
        
 
        System.out.println(" ** Operator Bitwise **");
        System.out.println("===========");
        
        
        Scanner baru = new Scanner(System.in);

        System.out.print("Masukkan angka pertama (bilangan bulat): ");
        int angka3 = scanner.nextInt();

        System.out.print("Masukkan angka kedua (bilangan bulat): ");
        int angka4 = scanner.nextInt();

        
        int And = angka3 & angka4;
        int Or = angka3 | angka4;
        int Xor = angka3 ^ angka4;
        int Negatif_kembali = ~angka3;
        int Negatif_kembali2 = ~angka4;
        int Left_shift = angka3 << angka4;
        int Right_shift = angka3 >> angka4;
        int Right_shift_unsigned = angka3 >>> angka4;


        
        System.out.println(angka3 + " & " + angka4 + " = " + And);
        System.out.println(angka3 + " | " + angka4 + " = " + Or);
        System.out.println(angka3 + " ^ " + angka4 + " = " + Xor);
        System.out.println("~" + angka1 + " = " + Negatif_kembali);
        System.out.println("~" + angka2 + " = " + Negatif_kembali2);
        System.out.println(angka3 + " << " + angka4 + " = " + Left_shift);
        System.out.println(angka3 + " >> " + angka4 + " = " + Right_shift);
        System.out.println(angka3 + " >>> " + angka4 + " = " + Right_shift_unsigned);



        
        scanner.close();
    }
}
