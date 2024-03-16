package Tugas_kelompok3;

import java.util.ArrayList;
import java.util.List;

public class InventarisApp<T extends Barang> {
    private List<T> inventaris = new ArrayList<>();

    public void addBarang(T barang){
        if (barang == null) {
            throw new IllegalArgumentException("Barang tidak boleh null!");
        }
        inventaris.add(barang);
    }

    public void displayBarang(){
        for(Barang barang : inventaris){
            System.out.println("Kode Barang = "+ barang.getKodeBarang());
            System.out.println("Nama Barang = "+ barang.getNamaBarang());
            System.out.println("Jenis Barang = "+ barang.getJenisBarang());
            System.out.println("Nilai Barang = "+ barang.hitungNilai());
        }
    }

    public double hitungTotalNilaiInventaris(){
        double total = 0;
        for(Barang barang : inventaris){
            total += barang.hitungNilai();
        }
        return total;
    }

   
}
