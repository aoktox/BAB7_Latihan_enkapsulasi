/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1.Tabungan;

/**
 *
 * @author Agus
 */
public class TestTugas1 {
    public static void main(String[] args) {
        boolean status;
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal : "+tabungan.getSaldo());
        tabungan.simpanUang(3000);
        System.out.println("Uang yang disimpan : 3000");
        status=tabungan.ambilUang(6000);
        System.out.print("Jumlah yang diambil : 6000");
        if (status)
            System.out.println("   OK");
        else
            System.out.println("   gagal");
        tabungan.simpanUang(3500);
        System.out.println("Uang yang disimpan : 3500");
        status=tabungan.ambilUang(4000);
        System.out.print("Jumlah yang diambil : 4000");
        if (status)
            System.out.println("   OK");
        else
            System.out.println("   gagal");
        status=tabungan.ambilUang(1600);
        System.out.print("Jumlah yang diambil : 1600");
        if (status)
            System.out.println("   OK");
        else
            System.out.println("   gagal");
        tabungan.simpanUang(2000);
        System.out.println("Uang yang disimpan : 2000");
        System.out.println("Saldo sekarang = "+tabungan.getSaldo());
    }
}
