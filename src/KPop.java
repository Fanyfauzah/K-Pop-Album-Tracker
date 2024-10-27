/**
 * Kelas ini merepresentasikan grup K-Pop dengan nama dan jumlah album yang dimiliki.
 */
class GrupKPop {
    private String nama;
    private int jumlahAlbum;

    /**
     * Konstruktor untuk membuat objek GrupKPop.
     *
     * @param nama        Nama grup K-Pop.
     * @param jumlahAlbum Jumlah album yang dimiliki grup.
     */
    public GrupKPop(String nama, int jumlahAlbum) {
        this.nama = nama;
        this.jumlahAlbum = jumlahAlbum;
    }

    /**
     * Mengambil nama grup K-Pop.
     *
     * @return Nama grup K-Pop.
     */
    public String getNama() {
        return nama;
    }

    /**
     * Mengambil jumlah album yang dimiliki grup K-Pop.
     *
     * @return Jumlah album.
     */
    public int getJumlahAlbum() {
        return jumlahAlbum;
    }
}