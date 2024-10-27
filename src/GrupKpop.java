import java.util.ArrayList;
import java.util.List;

/**
 * Kelas utama untuk menjalankan aplikasi K-Pop.
 */
public class GrupKpop {

    /**
     * Metode utama yang dijalankan saat aplikasi dimulai.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        List<GrupKPop> grups = new ArrayList<>();
        grups.add(new GrupKPop("BTS", 20));
        grups.add(new GrupKPop("Blackpink", 10));
        grups.add(new GrupKPop("EXO", 15));

        int totalAlbum = hitungTotalAlbum(grups);
        tampilkanInformasi(grups, totalAlbum);
    }

    /**
     * Menghitung total jumlah album dari semua grup K-Pop yang diberikan.
     *
     * @param grups Daftar grup K-Pop.
     * @return Total jumlah album.
     */
    private static int hitungTotalAlbum(List<GrupKPop> grups) {
        int total = 0;
        for (GrupKPop grup : grups) {
            total += grup.getJumlahAlbum();
        }
        return total;
    }

    /**
     * Menampilkan informasi tentang grup K-Pop dan total album yang dimiliki.
     *
     * @param grups     Daftar grup K-Pop.
     * @param totalAlbum Total jumlah album dari semua grup.
     */
    private static void tampilkanInformasi(List<GrupKPop> grups, int totalAlbum) {
        System.out.println("Total album yang dimiliki oleh grup K-Pop:");
        for (GrupKPop grup : grups) {
            System.out.println(grup.getNama() + ": " + grup.getJumlahAlbum() + " album");
        }
        System.out.println("Total album: " + totalAlbum);
    }
}