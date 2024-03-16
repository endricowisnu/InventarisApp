package Tugas_kelompok3;

public class Main {
    public static void main(String[] args) throws Exception {
        InventarisApp<Barang> app = new InventarisApp<>();
        
        app.addBarang(new BarangElektronik("B001", "TV LED", JenisBarang.Elektronik, 55.0));
        app.addBarang(new BarangElektronik("B002", "Kulkas", JenisBarang.Elektronik, 200.0));
        app.addBarang(new BarangPakaian("P001", "Kaos", "kaos oblong", JenisBarang.Pakaian, Ukuran.M));
        app.addBarang(new BarangPakaian("P002", "Celana", "celana jeans", JenisBarang.Pakaian, Ukuran.L));

        app.displayBarang();

        double totalNilai = app.hitungTotalNilaiInventaris();
        System.out.println("Total Nilai Inventaris: " + totalNilai);
    }
}
