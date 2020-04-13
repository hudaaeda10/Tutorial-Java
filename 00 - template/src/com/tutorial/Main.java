package com.tutorial;

// Membuat class template
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;
    double IPK;
    int umur;
}

public class Main {
    public static void main(String[] args) {

        // Instansiasi / membuat objek
        Mahasiswa mahasiswa1 = new Mahasiswa();

        mahasiswa1.nama = "Aeda";
        mahasiswa1.NIM = "0110217069";
        mahasiswa1.jurusan = "Teknik Informatika";
        mahasiswa1.IPK = 4.0;
        mahasiswa1.umur = 20;

        System.out.println(mahasiswa1.nama);
        System.out.println(mahasiswa1.NIM);
        System.out.println(mahasiswa1.jurusan);
        System.out.println(mahasiswa1.IPK);
        System.out.println(mahasiswa1.umur);

        // Instansiasi / membuat objek
        Mahasiswa mahasiswa2 = new Mahasiswa();

        mahasiswa2.nama = "Ulrich";
        mahasiswa2.NIM = "0110217070";
        mahasiswa2.jurusan = "Teknik Informatika";
        mahasiswa2.IPK = 3.6;
        mahasiswa2.umur = 19;

        System.out.println(mahasiswa2.nama);
        System.out.println(mahasiswa2.NIM);
        System.out.println(mahasiswa2.jurusan);
        System.out.println(mahasiswa2.IPK);
        System.out.println(mahasiswa2.umur);

    }
}