package model;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String idProdi; 


    // memasukkan prodi sebagai atribut mahasiswa
    public Mahasiswa(String nim, String nama, String idProdi) {
        this.nim = nim;
        this.nama = nama;
        this.idProdi = idProdi;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getIdProdi() {
        return idProdi;
    }
}
