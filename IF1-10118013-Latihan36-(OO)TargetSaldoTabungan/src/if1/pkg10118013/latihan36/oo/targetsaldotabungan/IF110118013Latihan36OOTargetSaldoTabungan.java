/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118013.latihan36.oo.targetsaldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author Rifian
 * Nama : Rifian Joe Premilenio
 * Nim : 10118013
 * Kelas : IF-01
 * Deskripsi Program : Menghitung Target Saldo Tabungan
 */
public class IF110118013Latihan36OOTargetSaldoTabungan {
    public static double saldoAwal = 3500000; 
    public static double bunga =  0.08; 
    public static double saldoTarget = 6000000;
    public static double saldoAkhir = 3500000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();

        formatRp.setCurrencySymbol(" Rp. ");
        formatRp.setGroupingSeparator('.');

        kursIndonesia.setDecimalFormatSymbols(formatRp);
        
        for (int i = 1; i<=8; i++){
            saldoAkhir = saldoAwal * bunga;
            saldoAwal += saldoAkhir;
            if(saldoAwal <= 6500000){
                System.out.println("Saldo di bulan ke-" + i + kursIndonesia.format(saldoAwal));
            }
        }
        System.out.println("(Developed by : Rifian Joe Premilenio)");
    }
    
}
