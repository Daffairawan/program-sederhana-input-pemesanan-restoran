public class Menu {
    // Atribut class sesuai kriteria
    String namaMenu;
    String kategori; // Isinya "Makanan" atau "Minuman"
    double harga;

    // Constructor untuk inisialisasi atribut
    public Menu(String namaMenu, String kategori, double harga) {
        this.namaMenu = namaMenu;
        this.kategori = kategori;
        this.harga = harga;
    }
}
