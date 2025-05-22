import java.util.Scanner; // mengimpor kelas Scanner untuk input pengguna

/**
 * TrackerAir.java
 * Program ini digunakan untuk mengecek apakah konsumsi air harian seseorang normal
 * Jika kurang dari 1.5L atau lebih dari 5L, maka program akan menghentikan proses
 * dan menampilkan pesan kesalahan menggunakan IllegalArgumentException
 *
 * Tujuan: meningkatkan kesadaran akan pentingnya konsumsi air yang cukup setiap hari
 * Exception yang digunakan: java.lang.IllegalArgumentException
 */

public class TrackerAir {

    // metode untuk mengecek apakah jumlah air yang diminum sudah sesuai standar
    public static void cekKonsumsiAir(double liter) {
        if (liter < 1.5) { // jika kurang dari 1.5L
            throw new IllegalArgumentException("kamu kurang minum! minimal 1.5L sehari.");
        }

        if (liter > 5.0) { // jika lebih dari 5L
            throw new IllegalArgumentException("kamu kebanyakan minum air! maksimal 5L sehari.");
        }

        System.out.println("konsumsi air normal: " + liter + "L");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // membuat objek scanner

        try {
            System.out.print("masukkan jumlah air yang diminum hari ini (dalam liter): "); // input user
            double konsumsiHariIni = scanner.nextDouble(); // membaca input

            cekKonsumsiAir(konsumsiHariIni); // memvalidasi input

        } catch (IllegalArgumentException e) { // menangkap exception jika jumlah tidak sesuai
            System.out.println("Gagal memproses:");
            e.printStackTrace(); // mencetak jejak error (stack trace) agar detail seperti pada contoh gambar
        } catch (Exception e) { // menangkap jika input bukan angka
            System.out.println("input tidak valid. harap masukkan angka desimal (contoh: 2.5)");
        }

        scanner.close(); // menutup scanner
    }
}
