package com.minr;

import java.util.ArrayList;
import java.util.Scanner;

public class Penilaian {
    private int banyakMhs;
    private String namaPetugas;
    private int max = 0;
    private int min = 100;

    private ArrayList nilaiMhs = new ArrayList();
    private Scanner userInput = new Scanner(System.in);

    public void setInitialisasi() {
        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        this.namaPetugas = userInput.next();

        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        this.banyakMhs = userInput.nextInt();

        this.getNilai();
    }

    private void setMax(int nilai){
        if (nilai > this.max) this.max = nilai;
    }

    private void setMin(int nilai){
        if (nilai < this.min) this.min = nilai;
    }

    private void getNilai() {
        int nilai = 0, // variabel bantuan untuk masukkan nilai
                j = 1; // variabel bantuan untuk penomoran
        for (int i = 0; i < banyakMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + j + " = ");
            nilai = userInput.nextInt();

            // add nilai mahasiswa to array nilaiMhs
            this.nilaiMhs.add(nilai);

            this.setMax(nilai);
            this.setMin(nilai);

            j++;
        }
    }

    private int getMax(){
        return this.max;
    }

    private int getMin(){
        return this.min;
    }

    public void getResult() {
        int j = 1; // variabel bantuan untuk penomoran
        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakMhs; i++) {
            System.out.println("Nilai mahasiswa ke-" + j + " = " + nilaiMhs.get(i));
            j++;
        }

        System.out.println("\nNilai Terbesar adalah " + this.getMax());
        System.out.println("Nilai Terkecil adalah " + this.getMin());
        System.out.println("\nPetugas : " + this.namaPetugas);
    }
}
