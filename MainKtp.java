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
public class MainKtp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KTP siswa = new KTP();
        siswa.setNama("Sherena Maulidya Eka Arifianti");
        siswa.setNoInduk(18604);
        siswa.setTempatLahir("Bondowoso");
        siswa.setAlamat("Ds.Cakruk Banjaranyar, Kras, Kediri");

        System.out.print("Nama            : "+ siswa.getNama());
        System.out.print (" ");
        System.out.print("NoInduk         : "+ siswa.getNoInduk());
        System.out.print (" ");
        System.out.print("TempatLahir     : "+ siswa.getTempatLahir());
        System.out.print (" ");
        System.out.print("Alamat          : "+ siswa.getAlamat());
        
    }
    
}
