import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Abon abon = new Abon("Abon Raos jaya",5000,"19/12/2022");
        Detergen detergen = new Detergen("Rinso",50000,"1 Liter",50);

        System.out.println("Selamat datang di Toko Kecil-Kecilan");
        System.out.println("Kami Menjual :");
        System.out.println("1. Abon");
        System.out.println("2. Detergen");
        System.out.print("Pilih Produk yang ingin anda beli (1/2) : ");
        String inputmenu = scanner.nextLine();

        if ( inputmenu.equals("1")){
            abon.infoProduk();
            System.out.print("Masukkan jumlah abon yang ingin dibeli : ");
            int jumlah = scanner.nextInt();
            System.out.println();
            System.err.println("Anda Membeli");
            abon.infoProduk();
            System.out.println("Total Harga : " + abon.totalHarga(jumlah));
            System.err.println("Segera lakukan pembayaran di kasir");
            
        }else if (inputmenu.equals("2")){
            detergen.infoProduk();
            System.out.print("Masukkan jumlah detergen yang ingin dibeli : ");
            int jumlah = scanner.nextInt();
            System.out.println();
            System.err.println("Anda Membeli");
            detergen.infoProduk();
            System.out.println("Total Harga : " + detergen.totalHarga(jumlah));
            System.err.println("Segera lakukan pembayaran di kasir");

        }else{
            System.out.println("Produk yang anda cari kosong");
            System.exit(0);
        }

    }
    
}
