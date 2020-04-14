package com.tutorial;

class Mahasiswa {
    // Data member
    String nama;
    String NIM;

    // contructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // Method yang terhubung dengan objek
    // Method tanpa return dan parameter
    void show() {
        System.out.println("Nama : " + this.nama);
        System.out.println("NIM : " + this.NIM);
    }

    // Method tanpa return dan menggunakan parameter
    void setNama(String nama) {
        this.nama = nama;
    }

    // Method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // Method dengan return dan parameter
    String sayHi(String message) {
        return message + "juga, nama saya adalah " + this.nama;
    }

}

public class Main {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Aeda", "0110217069");

        // method
        mahasiswa1.show();
        mahasiswa1.setNama("ulrich");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("Keren");
        System.out.println(data);
    }
}