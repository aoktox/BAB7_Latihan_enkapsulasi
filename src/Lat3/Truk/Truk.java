/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lat3.Truk;

/**
 *
 * @author Agus
 */
public class Truk {
    private double muatan;
    private double muatanmaks;

    public Truk(double beratmaks) {
        this.muatanmaks=beratmaks;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanmaks() {
        return muatanmaks;
    }

    public void tambahMuatan(double berat) {
        if ((this.muatan+berat)<=this.muatanmaks)
            this.muatan += berat;
    }
    
}
