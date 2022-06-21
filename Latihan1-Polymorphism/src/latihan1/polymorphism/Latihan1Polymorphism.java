/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan1.polymorphism;

import java.util.Scanner;
/**
 *
 * @author SUYUD SETIAWAN
 */
public class Latihan1Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // import scanner
        Scanner input = new Scanner(System.in);
        
        // import class Karyawan Dan Manager
        Karyawan pegawai1 = new Manager();
        Manager hitungGaji = new Manager();
        
        
        System.out.print("Masukkan NIK: ");
        String nik = input.next();
        System.out.print("Masukkan Nama: ");
        String nama = input.next();
        System.out.print("Masukkan Golongan (1/2/3): ");
        int golongan = input.nextInt();
        System.out.print("Masukkan Jabatan (Manager/Kabag): ");
        String jabatan = input.next();
        System.out.print("Masukkan Jumlah Kehadiran: ");
        int jmlHadir = input.nextInt();
        
        // setter pegawai
        pegawai1.setNik(nik);
        pegawai1.setNama(nama);
        pegawai1.setGolongan(golongan);
        pegawai1.setJabatan(jabatan);
        hitungGaji.setKehadiran(jmlHadir);
        
        // getter pegawai
        System.out.println("");
        System.out.println("==== Hasil Perhitungan ====");
        System.out.println("NIK: "+ pegawai1.getNik());
        System.out.println("Nama: "+ pegawai1.getNama());
        System.out.println("Golongan: "+ pegawai1.getGolongan());
        System.out.println("Jabatan: "+ pegawai1.getJabatan());
        System.out.println("Kehadiran: "+ hitungGaji.getKehadiran());
        System.out.println("");
        
        // hitung gaji pegawai
        System.out.println("Tunjangan Golongan: " + hitungGaji.tunjanganGolongan(golongan));
        System.out.println("Tunjangan Jabatan: "+ hitungGaji.tunjanganJabatan(jabatan));
        System.out.println("Tunjangan Kehadiran: "+ hitungGaji.tunjanganKehadiran(jmlHadir));
        System.out.println("Gaji Total: "+ hitungGaji.gajiTotal());
        
    }
    
}
