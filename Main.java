import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // --- 1. INSTANSIASI ARRAY DAN INISIALISASI MANUAL ---
        // Membuat array dari object Menu dengan ukuran 8
        Menu[] daftarMenu = new Menu[8];
        
        // Inisialisasi indeks 0-3 dengan Makanan
        daftarMenu[0] = new Menu("Nasi Goreng", "Makanan", 25000);
        daftarMenu[1] = new Menu("Mie Goreng", "Makanan", 20000);
        daftarMenu[2] = new Menu("Ayam Bakar", "Makanan", 30000);
        daftarMenu[3] = new Menu("Sate Ayam", "Makanan", 25000);
        
        // Inisialisasi indeks 4-7 dengan Minuman
        daftarMenu[4] = new Menu("Es Teh", "Minuman", 5000);
        daftarMenu[5] = new Menu("Es Jeruk", "Minuman", 8000);
        daftarMenu[6] = new Menu("Kopi Hitam", "Minuman", 10000);
        daftarMenu[7] = new Menu("Jus Alpukat", "Minuman", 15000);

        // --- 2. TAMPILKAN MENU SECARA MANUAL ---
        System.out.println("=================================");
        System.out.println("      MENU RESTORAN KAMI         ");
        System.out.println("=================================");
        System.out.println("--- Kategori: Makanan ---");
        System.out.println("1. " + daftarMenu[0].namaMenu + " - Rp " + daftarMenu[0].harga);
        System.out.println("2. " + daftarMenu[1].namaMenu + " - Rp " + daftarMenu[1].harga);
        System.out.println("3. " + daftarMenu[2].namaMenu + " - Rp " + daftarMenu[2].harga);
        System.out.println("4. " + daftarMenu[3].namaMenu + " - Rp " + daftarMenu[3].harga);
        
        System.out.println("\n--- Kategori: Minuman ---");
        System.out.println("5. " + daftarMenu[4].namaMenu + " - Rp " + daftarMenu[4].harga);
        System.out.println("6. " + daftarMenu[5].namaMenu + " - Rp " + daftarMenu[5].harga);
        System.out.println("7. " + daftarMenu[6].namaMenu + " - Rp " + daftarMenu[6].harga);
        System.out.println("8. " + daftarMenu[7].namaMenu + " - Rp " + daftarMenu[7].harga);
        System.out.println("=================================");

        // --- 3. FITUR PEMESANAN ---
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nAnda dapat memesan maksimal 4 item.");
        System.out.println("Ketik '-' jika tidak ingin menambah pesanan pada slot tersebut.");
        
        // Variabel untuk menyimpan data pesanan (tanpa array untuk input pesanan)
        String pesanan1 = "-", pesanan2 = "-", pesanan3 = "-", pesanan4 = "-";
        int qty1 = 0, qty2 = 0, qty3 = 0, qty4 = 0;
        double hargaSatuan1 = 0, hargaSatuan2 = 0, hargaSatuan3 = 0, hargaSatuan4 = 0;
        double subtotal1 = 0, subtotal2 = 0, subtotal3 = 0, subtotal4 = 0;
        
        // Flag boolean untuk deteksi pesanan minuman (untuk syarat promo)
        boolean adaMinuman = false;

        // BLOK PESANAN 1
        System.out.print("\nMasukkan pesanan 1 (Nama Menu / '-'): ");
        String input1 = scanner.nextLine();
        
        // Struktur keputusan If untuk memastikan user tidak menginput "-"
        if (!input1.equals("-")) {
            System.out.print("Jumlah pesanan 1: ");
            qty1 = scanner.nextInt();
            scanner.nextLine(); // Membersihkan sisa baris baru (newline) dari nextInt()
            pesanan1 = input1;
            
            // Switch case dengan toLowerCase untuk pencocokan harga
            switch (input1.toLowerCase()) {
                case "nasi goreng": hargaSatuan1 = daftarMenu[0].harga; break;
                case "mie goreng": hargaSatuan1 = daftarMenu[1].harga; break;
                case "ayam bakar": hargaSatuan1 = daftarMenu[2].harga; break;
                case "sate ayam": hargaSatuan1 = daftarMenu[3].harga; break;
                case "es teh": hargaSatuan1 = daftarMenu[4].harga; adaMinuman = true; break;
                case "es jeruk": hargaSatuan1 = daftarMenu[5].harga; adaMinuman = true; break;
                case "kopi hitam": hargaSatuan1 = daftarMenu[6].harga; adaMinuman = true; break;
                case "jus alpukat": hargaSatuan1 = daftarMenu[7].harga; adaMinuman = true; break;
                default: 
                    System.out.println("Maaf, menu tidak ditemukan!");
                    pesanan1 = "-"; // Reset pesanan jika tidak valid
                    qty1 = 0;
                    break;
            }
            subtotal1 = hargaSatuan1 * qty1;
        }

        // BLOK PESANAN 2
        System.out.print("Masukkan pesanan 2 (Nama Menu / '-'): ");
        String input2 = scanner.nextLine();
        if (!input2.equals("-")) {
            System.out.print("Jumlah pesanan 2: ");
            qty2 = scanner.nextInt();
            scanner.nextLine();
            pesanan2 = input2;
            
            switch (input2.toLowerCase()) {
                case "nasi goreng": hargaSatuan2 = daftarMenu[0].harga; break;
                case "mie goreng": hargaSatuan2 = daftarMenu[1].harga; break;
                case "ayam bakar": hargaSatuan2 = daftarMenu[2].harga; break;
                case "sate ayam": hargaSatuan2 = daftarMenu[3].harga; break;
                case "es teh": hargaSatuan2 = daftarMenu[4].harga; adaMinuman = true; break;
                case "es jeruk": hargaSatuan2 = daftarMenu[5].harga; adaMinuman = true; break;
                case "kopi hitam": hargaSatuan2 = daftarMenu[6].harga; adaMinuman = true; break;
                case "jus alpukat": hargaSatuan2 = daftarMenu[7].harga; adaMinuman = true; break;
                default: 
                    System.out.println("Maaf, menu tidak ditemukan!");
                    pesanan2 = "-";
                    qty2 = 0;
                    break;
            }
            subtotal2 = hargaSatuan2 * qty2;
        }

        // BLOK PESANAN 3
        System.out.print("Masukkan pesanan 3 (Nama Menu / '-'): ");
        String input3 = scanner.nextLine();
        if (!input3.equals("-")) {
            System.out.print("Jumlah pesanan 3: ");
            qty3 = scanner.nextInt();
            scanner.nextLine();
            pesanan3 = input3;
            
            switch (input3.toLowerCase()) {
                case "nasi goreng": hargaSatuan3 = daftarMenu[0].harga; break;
                case "mie goreng": hargaSatuan3 = daftarMenu[1].harga; break;
                case "ayam bakar": hargaSatuan3 = daftarMenu[2].harga; break;
                case "sate ayam": hargaSatuan3 = daftarMenu[3].harga; break;
                case "es teh": hargaSatuan3 = daftarMenu[4].harga; adaMinuman = true; break;
                case "es jeruk": hargaSatuan3 = daftarMenu[5].harga; adaMinuman = true; break;
                case "kopi hitam": hargaSatuan3 = daftarMenu[6].harga; adaMinuman = true; break;
                case "jus alpukat": hargaSatuan3 = daftarMenu[7].harga; adaMinuman = true; break;
                default: 
                    System.out.println("Maaf, menu tidak ditemukan!");
                    pesanan3 = "-";
                    qty3 = 0;
                    break;
            }
            subtotal3 = hargaSatuan3 * qty3;
        }

        // BLOK PESANAN 4
        System.out.print("Masukkan pesanan 4 (Nama Menu / '-'): ");
        String input4 = scanner.nextLine();
        if (!input4.equals("-")) {
            System.out.print("Jumlah pesanan 4: ");
            qty4 = scanner.nextInt();
            scanner.nextLine();
            pesanan4 = input4;
            
            switch (input4.toLowerCase()) {
                case "nasi goreng": hargaSatuan4 = daftarMenu[0].harga; break;
                case "mie goreng": hargaSatuan4 = daftarMenu[1].harga; break;
                case "ayam bakar": hargaSatuan4 = daftarMenu[2].harga; break;
                case "sate ayam": hargaSatuan4 = daftarMenu[3].harga; break;
                case "es teh": hargaSatuan4 = daftarMenu[4].harga; adaMinuman = true; break;
                case "es jeruk": hargaSatuan4 = daftarMenu[5].harga; adaMinuman = true; break;
                case "kopi hitam": hargaSatuan4 = daftarMenu[6].harga; adaMinuman = true; break;
                case "jus alpukat": hargaSatuan4 = daftarMenu[7].harga; adaMinuman = true; break;
                default: 
                    System.out.println("Maaf, menu tidak ditemukan!");
                    pesanan4 = "-";
                    qty4 = 0;
                    break;
            }
            subtotal4 = hargaSatuan4 * qty4;
        }

        // --- 4. LOGIKA PERHITUNGAN ---
        
        // 1. Total Biaya Pesanan
        double totalBiayaPesanan = subtotal1 + subtotal2 + subtotal3 + subtotal4;
        
        // 2. Promo Beli 1 Gratis 1 Minuman (Nested If)
        String infoPromo = "";
        if (totalBiayaPesanan > 50000) {
            if (adaMinuman == true) {
                // Info promo tersimpan untuk struk, sesuai instruksi ini tidak memotong harga
                infoPromo = "Promo Aktif: Beli 1 Gratis 1 Minuman";
            }
        }
        
        // 3. Diskon 10% (If-Else)
        double diskon = 0;
        if (totalBiayaPesanan > 100000) {
            diskon = 0.10 * totalBiayaPesanan;
        } else {
            diskon = 0;
        }
        
        // 4. Pajak 10%
        double totalSetelahDiskon = totalBiayaPesanan - diskon;
        double pajak = 0.10 * totalSetelahDiskon;
        
        // 5. Biaya Layanan
        double biayaLayanan = 20000;
        
        // 6. Total Bayar Akhir
        double totalBayarAkhir = totalSetelahDiskon + pajak + biayaLayanan;

        // --- 5. MENCETAK STRUK ---
        System.out.println("\n==============================================");
        System.out.println("               STRUK PESANAN                  ");
        System.out.println("==============================================");
        
        // Struktur If agar hanya pesanan valid yang dicetak
        if (!pesanan1.equals("-")) {
            System.out.println(pesanan1 + " (x" + qty1 + ")");
            System.out.println("  @ Rp " + hargaSatuan1 + " \t\t = Rp " + subtotal1);
        }
        if (!pesanan2.equals("-")) {
            System.out.println(pesanan2 + " (x" + qty2 + ")");
            System.out.println("  @ Rp " + hargaSatuan2 + " \t\t = Rp " + subtotal2);
        }
        if (!pesanan3.equals("-")) {
            System.out.println(pesanan3 + " (x" + qty3 + ")");
            System.out.println("  @ Rp " + hargaSatuan3 + " \t\t = Rp " + subtotal3);
        }
        if (!pesanan4.equals("-")) {
            System.out.println(pesanan4 + " (x" + qty4 + ")");
            System.out.println("  @ Rp " + hargaSatuan4 + " \t\t = Rp " + subtotal4);
        }
        
        System.out.println("----------------------------------------------");
        System.out.println("Total Biaya Pesanan     : Rp " + totalBiayaPesanan);
        
        // Hanya cetak diskon jika ada diskon
        if (diskon > 0) {
            System.out.println("Diskon 10%              : Rp " + diskon);
        }
        
        // Hanya cetak promo jika mendapatkan promo
        if (!infoPromo.equals("")) {
            System.out.println("Promo Menarik           : " + infoPromo);
        }
        
        System.out.println("Pajak 10%               : Rp " + pajak);
        System.out.println("Biaya Layanan           : Rp " + biayaLayanan);
        System.out.println("----------------------------------------------");
        System.out.println("TOTAL BAYAR AKHIR       : Rp " + totalBayarAkhir);
        System.out.println("==============================================");
        System.out.println("       Terima Kasih Atas Kunjungan Anda       ");
        System.out.println("==============================================");
        
        scanner.close();
    }
}
