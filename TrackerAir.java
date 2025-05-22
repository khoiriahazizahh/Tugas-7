import java.util.Scanner; // mengimpor kelas Scanner untuk membaca input dari pengguna

class AirKurangException extends Exception { 
    public AirKurangException(String pesan) {
        super(pesan); // mengirim pesan ke constructor superclass Exception
    }
}

class AirKebanyakanException extends Exception { // mendefinisikan kelas exception khusus jika air berlebihan
    public AirKebanyakanException(String pesan) {
        super(pesan); // mengirim pesan ke constructor superclass Exception
    }
}

public class TrackerAir {

    public static void cekKonsumsiAir(double liter)
        throws AirKurangException, AirKebanyakanException { // metode ini dapat menghasilkan dua jenis exception

        if (liter < 1.5) { // jika jumlah air kurang dari 1.5 liter
            // menghasilkan exception AirKurangException dengan pesan tertentu
            throw new AirKurangException("kamu kurang minum! minimal 1.5L sehari.");
        }

        if (liter > 5.0) { // jika jumlah air melebihi 5 liter
            // menghasilkan exception AirKebanyakanException dengan pesan tertentu
            throw new AirKebanyakanException("kamu kebanyakan minum air! max 5L sehari.");
        }

        System.out.println("konsumsi air normal: " + liter + "L"); // menampilkan pesan jika konsumsi sesuai batas normal
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // membuat objek Scanner untuk menerima input dari pengguna

        try {
            System.out.print("masukkan jumlah air yang diminum hari ini (dalam liter): "); // meminta input pengguna
            double konsumsiHariIni = scanner.nextDouble(); // membaca input sebagai angka desimal

            cekKonsumsiAir(konsumsiHariIni); // memanggil metode validasi dengan input tersebut

        } catch (AirKurangException | AirKebanyakanException e) { // menangani exception khusus dari validasi
            System.out.println("warning: " + e.getMessage()); // menampilkan pesan kesalahan dari exception yang terjadi
        } catch (Exception e) { // menangani kemungkinan input tidak valid (bukan angka)
            System.out.println("input tidak valid. harap masukkan angka desimal, contoh: 2.5");
        }

        scanner.close(); 
    }
}

