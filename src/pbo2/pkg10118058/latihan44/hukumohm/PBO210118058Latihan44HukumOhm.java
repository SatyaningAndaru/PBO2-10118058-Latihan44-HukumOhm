/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan44.hukumohm;

/**
 *
 * @author user
 */
public class PBO210118058Latihan44HukumOhm {

    /**
     * @param args the command line arguments
     * Nama : Satyaning Andaru BAwalaksana
     * Nim : 10118058
     * Kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai bt =new Baterai();
        bt.equals(bt);
        Baterai bt2 =new Baterai(3,12);
        
        System.out.println("Kuat arus : " +bt2.getKuatArus() + " ampere");
        System.out.println("Hambatan : " +bt2.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan : " +bt2.hitungTegangan()+ " volt ");
    }
    
}
