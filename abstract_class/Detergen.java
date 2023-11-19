public class Detergen extends Baseproduk {

    public String isi;
    public double diskon;

    public Detergen(String nama, double harga, String isi, double diskon){
        this.nama = nama;
        this.harga = harga;
        this.isi = isi;
        this.diskon = diskon;
    }

    @Override
    public void infoProduk() {
        System.out.println("Nama produk : "+ nama);
        System.out.println("Harga produk : "+ harga);
        System.out.println("varian : "+ isi);
        System.out.println("Diskon Spesial : "+diskon+" %");
    }

    @Override
    double totalHarga(int jumlah) {
        return harga * jumlah * (diskon/100);
    }
}
