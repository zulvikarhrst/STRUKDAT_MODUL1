package Praktikum;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Zulvikar Harist
 */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===HITUNG LUAS SEGITIGA===");
        System.out.println("\n Ingin menampilkan hasil luas dalam bentuk apa? :");
        System.out.println("1. Integer\n2. Double\n3. Keluar\n");
        System.out.print("Masukkan menu pilihan anda 1 / 2 / 3: ");

        try {
            int pilihMenu = input.nextInt();
            System.out.println("Masukkan Nilai Alas Dan Tinggi Secara Berurutan: ");
            switch (pilihMenu){
                case 1:
                    Segitiga<Integer, Integer> luasTipeInt = new Segitiga<>(input.nextInt(), input.nextInt());
                    System.out.println("Modul1.Segitiga Dalam Integer : " + luasTipeInt.getResultAsInt());
                    break;
                case 2:
                    Segitiga<Double, Double> luasTipeDouble = new Segitiga<>(input.nextDouble(), input.nextDouble());
                    System.out.println("Modul1.Segitiga Dalam Double : " + luasTipeDouble.getResultAsDouble());
                    break;
                case 3:
                    System.out.println("\nKeluar ");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nMohon Maaf, Pilihan Anda Salah!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("\nMohon Maaf, Inputan Anda Tidak Valid!");
        } catch (Exception e) {
            System.out.println("\nTerjadi Kesalahan: " + e.getMessage());
        }
    }
}