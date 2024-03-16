package Tugas_kelompok3;

public class BarangPakaian extends Barang {
        private String jenisPakaian;
        private Ukuran size;

    @SuppressWarnings("static-access")
    public BarangPakaian(String kodeBarang, String namaBarang, String jenisPakaian, JenisBarang JenisBarang, Ukuran size) {
        super(kodeBarang, namaBarang, JenisBarang.Pakaian);
        this.jenisPakaian = jenisPakaian;
        this.size = size;
    }

    @Override
    public double hitungNilai() {
        if(size == Ukuran.S){
            return 50000;
        }else if(size == Ukuran.M){
            return 60000;
        }else{
            return 70000;
        }
    }
}
