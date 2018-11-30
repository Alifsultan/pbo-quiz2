/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transaksi;

/**
 *
 * @author Administrator
 */
public class Item {
    private String Nama;
    private int Harga;
    private int Jumlah;

    public Item(String Nama, int Harga, int Jumlah) {
        this.Nama = Nama;
        this.Harga = Harga;
        this.Jumlah = Jumlah;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getHarga() {
        return Harga;
    }

    public void setHarga(int Harga) {
        this.Harga = Harga;
    }

    public int getJumlah() {
        return Jumlah;
    }

    public void setJumlah(int jumlah) {
        this.Jumlah = jumlah;
    }
    
    public float getTotal(){
        return (this.Harga * this.Jumlah);
    }
}
