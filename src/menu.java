package TugasPBO;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    String nama;
    double harga;
    int id;
    public menu (int id, String nama, double harga){
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }
    //kelass makanan
    public void menuMakanan(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void menuMinuman(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String toString() {
        return "Menu : " +
                nama + " || Rp." + harga;
    }
}