/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat1.Tabungan;

/**
 *
 * @author Agus
 */
public class TestLatihan1 {
    public static void main(String[] args) {
        Tabungan tabungan = new Tabungan(5000);
        System.out.println("Saldo awal :" + tabungan.saldo);
        tabungan.ambilUang(2300);
        System.out.println("Jumlah uang yang diambil : 2300");
        System.out.println("Saldo sekarang : "+ tabungan.saldo);
    }
}
