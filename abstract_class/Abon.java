public class Abon extends Baseproduk {

    public String kadaluarsa;

    public Abon(String nama, double harga, String kadaluarsa){
        this.nama = nama;
        this.harga = harga;
        this.kadaluarsa = kadaluarsa;
    }

    @Override
    public void infoProduk() {
        System.out.println("Nama produk : "+ nama);
        System.out.println("Harga produk : "+ harga);
        System.err.println("Tanggal kadaluarsa :"+ kadaluarsa);
    }

    @Override
    double totalHarga(int jumlah) {
        return harga * jumlah;
    }

}
