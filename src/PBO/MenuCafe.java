package PBO;

//Class
public class MenuCafe {
    //Atribut dan Encapsulation
    private String nama;
    private double harga;

    //Constructor
    public MenuCafe(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    //Mutator (Setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    //Accessor (Getter)
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
    
    @Override
    public String toString() {
        return nama + ": Rp " + harga;
    }

}
