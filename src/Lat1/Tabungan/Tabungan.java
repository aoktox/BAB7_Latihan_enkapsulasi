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
public class Tabungan {
    public int saldo;
    Tabungan (int saldo){
        this.saldo=saldo;
    }
    
    public void ambilUang (int jumlah){
        this.saldo-=jumlah;
    }
}
