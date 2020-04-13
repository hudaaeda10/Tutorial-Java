package com.tutorial;

import javax.xml.namespace.QName;

// Membuat class 
class Mahasiswa {
    String nama;
    String NIM;
    String jurusan;

    // Membuat constructor (fungsi pertamam kali dijalankan)
    // Mahasiswa() {
    // System.out.println("Ini adalah constructor");
    // }

    // Membuat constructor dengan parameter
    Mahasiswa(String inputNama, String inputNIM, String inputJurusan) {
        nama = inputNama;
        NIM = inputNIM;
        jurusan = inputJurusan;

        System.out.println(nama);
        System.out.println(NIM);
        System.out.println(jurusan);
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        // Membuat object baru
        Mahasiswa mahasiswa1 = new Mahasiswa("Aeda", "0110217089", "Teknik Informatika");
        Mahasiswa mahasiswa2 = new Mahasiswa("Ulrich", "0110217066", "Teknik Penerbanagan");

    }
}