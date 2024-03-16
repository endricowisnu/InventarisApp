package Tugas_kelompok3;

public abstract class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected JenisBarang JenisBarang;

    public Barang(String kodeBarang, String namaBarang, JenisBarang JenisBarang){
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.JenisBarang = JenisBarang;
    }

    public abstract double hitungNilai() throws ArithmeticException;

    public String getKodeBarang(){
        return this.kodeBarang;
    }

    public JenisBarang getJenisBarang(){
        return this.JenisBarang;
    }

    public String getNamaBarang(){
        return this.namaBarang;
    }
}
