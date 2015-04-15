/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat2.Mahasiswa;

/**
 *
 * @author Agus
 */
public class TestLatihan2 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa(12345, "Jono");
        System.out.println("NRP : "+ mhs.getNrp());
        System.out.println("Nama : "+ mhs.getNama());
    }
}
