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
public final class Truk {
    private double muatan;
    private final double muatanmaks;
    
    double newtsToKilo(double asal){
        return asal/9.8;
    }
    double kiloToNewts(double asal){
        return asal*9.8;
    }

    public Truk(double beratmaks) {
        this.muatanmaks= kiloToNewts(beratmaks);
    }

    public double getMuatan() {
        return newtsToKilo(muatan);
    }

    public double getMuatanmaks() {
        return newtsToKilo(muatanmaks);
    }
    
    public boolean tambahMuatan(double berat){
        boolean status = this.muatanmaks>=this.muatan+kiloToNewts(berat);
        if (status){
            this.muatan+=kiloToNewts(berat);
            return status;
        }
        else return status;
    }
    // Tanpa konversi ke newton
    /*
    double newtsToKilo(double asal){
        return asal/9.8;
    }
    double kiloToNewts(double asal){
        return asal*9.8;
    }

    public Truk(double beratmaks) {
        double tmp = beratmaks;
        this.muatanmaks= tmp;
    }

    public double getMuatan() {
        return muatan;
    }

    public double getMuatanmaks() {
        return muatanmaks;
    }
    
    public boolean tambahMuatan(double berat){
        boolean status = this.muatanmaks>=(this.muatan+berat);
        if (status){
            this.muatan+=berat;
            return status;
        }
        else return status;
    }
    */
}
