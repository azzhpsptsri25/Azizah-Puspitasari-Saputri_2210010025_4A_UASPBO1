package PBO;

/**
 *
 * @author Administrator
 */

    

import java.util.ArrayList;
import java.util.List;

public class Pemesanan {
    private List<MenuCafe> daftarPesanan;

    // Constructor
    public Pemesanan() {
        this.daftarPesanan = new ArrayList<>();
    }

    // Method untuk menambah item ke dalam pesanan
    public void tambahItem(MenuCafe item) {
        daftarPesanan.add(item);
    }

    // Method untuk menampilkan pesanan
    public void tampilkanPesanan() {
        if (daftarPesanan.isEmpty()) {
            System.out.println("Pesanan kosong.");
        } else {
            System.out.println("Pesanan:");
            for (MenuCafe item : daftarPesanan) {
                System.out.println(item);
            }
        }
    }

    // Accessor (getter) untuk daftarPesanan
    public List<MenuCafe> getDaftarPesanan() {
        return daftarPesanan;
    }
}


