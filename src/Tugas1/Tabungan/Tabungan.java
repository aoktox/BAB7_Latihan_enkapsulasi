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
public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }
    
    public void simpanUang(int jumlah){
        this.saldo+=jumlah;
    }
    
    public boolean ambilUang(int jumlah){
        boolean status = this.saldo>=jumlah;
        if(status){
            this.saldo-=jumlah;
            return status;
        }
        else return status;
    }
}