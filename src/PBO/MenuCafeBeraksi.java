package PBO;


/**
 *
 * @author Administrator
 */

    import java.util.ArrayList;
    import java.util.List;
    import java.util.Scanner;

    public class MenuCafeBeraksi {
    public static void main(String[] args) {
        //Array
        List<MenuCafe> menu = new ArrayList<>();
        menu.add(new MenuCafe("Espresso", 25000));
        menu.add(new MenuCafe("Cappuccino", 30000));
        menu.add(new Minuman("Latte", 35000, true));

        Pemesanan pesanan = new Pemesanan();
        //IO Sederhana
        Scanner scanner = new Scanner(System.in);

        //Perulangan
        while (true) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i));
            }

            System.out.println("Masukkan nomor menu untuk menambah ke pesanan (atau ketik '0' untuk selesai):");
            int pilihan;
            //Error Handling
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
                //Seleksi
                if (pilihan == 0) {
                    break;
                } else if (pilihan > 0 && pilihan <= menu.size()) {
                    pesanan.tambahItem(menu.get(pilihan - 1));
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid, masukkan angka.");
            }
        }

        pesanan.tampilkanPesanan();
    }
}