/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan1.polymorphism;

/**
 *
 * @author SUYUD SETIAWAN
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;
    
    public int getKehadiran(){
        return this.kehadiran;
    }
    
    public void setKehadiran(int kehadiran){
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganGolongan(int golongan){
        switch (golongan) {
            case 1:
                this.tunjanganGolongan = 500000;
                break;
            case 2:
                this.tunjanganGolongan = 1000000;
                break;
            case 3:
                this.tunjanganGolongan = 1500000;
                break;
            default:
                System.out.println("Maaf, Golongan Tidak Dikenali!");
                break;
        }
        
      return this.tunjanganGolongan;
    }
    
    public float tunjanganJabatan(String jabatan){
            switch (jabatan.toLowerCase()) {
            case "manager":
                this.tunjanganJabatan = 2000000;
                break;
            case "kabag":
                this.tunjanganJabatan = 1000000;
                break;
            default:
                  System.out.println("Maaf, Jabatan Tidak Dikenal!");
                break;
        }

        return this.tunjanganJabatan;
    }
    
    public float tunjanganKehadiran(int jmlHadir){
        return this.tunjanganKehadiran = jmlHadir * 1000;
    }
    
    public float gajiTotal(){
        return this.tunjanganJabatan + this.tunjanganGolongan + this.tunjanganKehadiran;
    }
}
