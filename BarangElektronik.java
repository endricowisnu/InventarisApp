package Tugas_kelompok3;

public class BarangElektronik extends Barang {
    private Double daya;
    @SuppressWarnings("static-access")
    public BarangElektronik(String kodeBarang, String namaBarang,JenisBarang JenisBarang, Double daya){
        super(kodeBarang, namaBarang, JenisBarang.Elektronik);
        this.daya = daya;
    }

    @Override
    public double hitungNilai(){
        return 1000*daya;
    }
}
