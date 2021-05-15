/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkap;

/**
 *
 * @author ACER
 */
public class KTP {
    private String Nama;
    private String TempatLahir;
    private String Alamat;
    private int NoInduk;

    
    public String getNama() {
        return Nama;
    }
    public int getNoInduk() {
        return NoInduk;
    }
    public String getTempatLahir()  {
        return TempatLahir;
    }
    public String getAlamat() {
        return Alamat;
    }
    
    public void setNama(String newNama) {
        Nama = newNama;
    }
    public void setNoInduk(int newNoInduk) {
        NoInduk = newNoInduk;
    }
    public void setTempatLahir (String newTempatLahir)  {
        TempatLahir = newTempatLahir;
    }    
    public void setAlamat(String newAlamat) {
        Alamat = newAlamat;
    }

}

