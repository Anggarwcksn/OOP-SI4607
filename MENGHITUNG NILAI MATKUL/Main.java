import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Input Statement
        Scanner input = new Scanner(System.in);

        System.out.print("Nama: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        int nim = input.nextInt();

        System.out.print("Nilai Tubes: ");
        double nilaiTubes = input.nextDouble();

        System.out.print("Nilai Quiz: ");
        double nilaiQuis = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        //Operation
        double total = (0.3 * nilaiTubes) + (0.1 * nilaiQuis) + (0.1 * nilaiTugas) + (0.25 * nilaiUTS) + (0.25 * nilaiUAS);

        //Display Output
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("Nilai Matakuliah Pemrograman Berorientasi Objek : " + total);
    }
}