/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2.Truk;

/**
 *
 * @author Agus
 */
public class TestTugas2 {
    public static void main(String[] args) {
        Truk truk = new Truk(900);
        boolean status;
        System.out.println("Muatan maksimal : "+ truk.getMuatanmaks());
        status=truk.tambahMuatan(500);
        System.out.print("Tambah muatan : 500");
        if (status)
            System.out.println("   OK");
        else
            System.out.println("   gagal");
        status=truk.tambahMuatan(300);
        System.out.print("Tambah muatan : 300");
        if (status)
            System.out.println("   OK");
        else
            System.out.println("   gagal");
        status=truk.tambahMuatan(150);
        System.out.print("Tambah muatan : 150");
        if (status)
            System.out.println("   OK");
        else
            System.out.println("   gagal");
        status=truk.tambahMuatan(50);
        System.out.print("Tambah muatan : 50");
        if (status)
            System.out.println("   OK");
        else
            System.out.println("   gagal");
        System.out.println("Muatan sekarang = "+ truk.getMuatan());
    }
}
