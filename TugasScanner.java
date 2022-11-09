import java.util.Scanner;

public class TugasScanner {
    public static void main(String[] args) {
        // deklarasi
        // int nilai1, nilai2, hasil;
        // String operator;

        // input
        Scanner keyboard = new Scanner(System.in);

        // proses
        // System.out.println("=== Kalkulator Sederhana ===");
        // System.out.print("Masukan nilai pertama: ");
        // nilai1 = keyboard.nextInt();
        // System.out.print("pilih operator +, -, x, / : ");
        // operator = keyboard.next();
        // System.out.print("Masukan nilai kedua: ");
        // nilai2 = keyboard.nextInt();

        // menghitung nilai sesuai operator aritmatika
        // if ( operator.equalsIgnoreCase("+") ) {
        // hasil = (nilai1 + nilai2);
        // } else if ( operator.equalsIgnoreCase("-") ) {
        // hasil = (nilai1 - nilai2);
        // } else if ( operator.equalsIgnoreCase("*") ) {
        // hasil = (nilai1 * nilai2);
        // } else if ( operator.equalsIgnoreCase("/") ) {
        // hasil = (nilai1 / nilai2);
        // } else {
        // hasil = nilai1 % nilai2;
        // }

        // System.out.println("Hasil: " + hasil);
        int soal = 1;
        int Volume;
        int P;
        int L;
        int T;
        int x;
        int y;
        int r;
        int π = 22 / 7;
        int all = 1;
        do {
            System.out.println("=> Pilih Soal Dibawah Ini: \n 1.Soal 1 \n 2.Soal 2 \n 3.Soal 3 \n 4.Exit");

            System.out.print("Masukan Nomor Yang Akan Anda Pilih : ");
            soal = keyboard.nextInt();
            switch (soal) {
                // Soal 1
                case 1:
                    do {
                        System.out.println(
                                "=> Pilih Soal Dibawah Ini: \n 1.Penjumlahan \n 2.Pengurangan  \n 3.Perkalian \n 4.Pembagian \n 5.Exit");

                        System.out.print("Masukan Nomor Yang Akan Anda Pilih : ");
                        all = keyboard.nextInt();

                        switch (all) {
                            case 1:
                                System.err.print("Masukkan Nilai 1 ");
                                x = keyboard.nextInt();
                                System.err.print("Masukkan Nilai 2 ");
                                y = keyboard.nextInt();
                                System.out.println("Hasil = " + (x + y));
                                break;
                            case 2:
                                System.err.print("Masukkan Nilai 1 ");
                                x = keyboard.nextInt();
                                System.err.print("Masukkan Nilai 2 ");
                                y = keyboard.nextInt();
                                System.out.println("Hasil = " + (x - y));
                                break;
                            case 3:
                                System.err.print("Masukkan Nilai 1 ");
                                x = keyboard.nextInt();
                                System.err.print("Masukkan Nilai 2 ");
                                y = keyboard.nextInt();
                                System.out.println("Hasil = " + (x * y));
                                break;
                            case 4:
                                System.err.print("Masukkan Nilai 1 ");
                                x = keyboard.nextInt();
                                System.err.print("Masukkan Nilai 2 ");
                                y = keyboard.nextInt();
                                System.out.println("Hasil = " + (x / y));
                                break;
                            default:
                                System.out.println("Exit");
                        }
                        break;
                    } while (all < 5);

                    // Soal 2
                case 2:
                    do {
                        System.out.println(" 1.Balok \n 2.Tabung");

                        System.out.println("Silahkan Memilih :");
                        Volume = keyboard.nextInt();

                        switch (Volume) {
                            case 1:
                                System.out.print("Panjang Balok :");
                                P = keyboard.nextInt();
                                System.out.print("Lebar Balok : ");
                                L = keyboard.nextInt();
                                System.out.print("Tinggi Balok :");
                                T = keyboard.nextInt();
                                System.out.println("Hasil : " + (P * L * T));
                                if ((P * L * T) >= 1000) {
                                    System.out.println("Balok ");
                                } else {
                                    System.out.println("Balok Tidak Mencukupi ");
                                }
                                break;

                            case 2:
                                System.out.print("jari-jari lingkaran : ");
                                r = keyboard.nextInt();
                                System.out.print("Tinggi Tabung :");
                                T = keyboard.nextInt();
                                System.out.println("Hasil : " + (π * r * r * T));
                                if ((π * r * r * T) >= 2000) {
                                    System.out.println("Tabung " + Volume);
                                } else {
                                    System.out.println("Tabung Tidak Mencukupi ");
                                }
                                break;
                            default:
                                System.out.println("Not Found");
                                break;
                        }
                    } while (Volume < 3);

                    // Soal No 3
                case 3:
                    String Akses;
                    String Akses2;
                    System.out.println("Masukan Akses Keamanan Ke 1 : ");
                    Akses = keyboard.next();

                    System.out.println("Masukan Akses Keamanan Ke 2 :");
                    Akses2 = keyboard.next();

                    if ((Akses.length() + Akses2.length()) == 25) {
                        System.out.println("Akses Diterima");
                    } else {
                        System.out.println("Akses Ditolak");
                    }
            }while (soal < 4);
            System.out.println("Berhasil Exit, Silahkan Run Kembali Jika Ingin Mengulang");
        } while (soal < 4);
    }
}