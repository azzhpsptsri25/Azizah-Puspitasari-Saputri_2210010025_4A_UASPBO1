# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `MenuCafe`, `MenuCafeBeraksi`, `Minuman` dan, `Pemesanan` adalah contoh dari class.

```bash
public class MenuCafe {
    ...
}

public class MenuCafeBeraksi {
    ...
}

public class Minuman {
    ...
}
public class Pemesanan {
    ...
}
```

2. **Object** adalah instance dari class. 

```bash
menu.add(new MenuCafe("Espresso", 25000));
        menu.add(new MenuCafe("Cappuccino", 30000));
        menu.add(new Minuman("Latte", 35000, true));
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nama` dan `harga` adalah contoh atribut.

```bash
String nama;
String harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `MenuCafe` `Pemesanan` dan `MenuCafeBeraksi`.

```bash
public MenuCafe(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNama` dan `setHarga` adalah contoh method mutator.

```bash
public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNama`, dan `getHarga` adalah contoh method accessor.

```bash
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
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `harga` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
private String nama;
private double harga;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain.

```bash
public class Minuman extends MenuCafe {
    private boolean dingin;
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding.

```bash
@Override
    public String toString(){
        return super.toString() + (dingin ? " (Dingin)" : "(Hangat)");
        
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getPilihan` dan seleksi `switch` dalam method `getPilihan`.

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
//Perulangan
        while (true) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i));
            }

            System.out.println("Masukkan nomor menu untuk menambah ke pesanan (atau ketik '0' untuk selesai):");
            int pilihan;
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);

        //Perulangan
        while (true) {
            System.out.println("Menu:");
            for (int i = 0; i < menu.size(); i++) {
                System.out.println((i + 1) + ". " + menu.get(i));
            }

            System.out.println("Masukkan nomor menu untuk menambah ke pesanan (atau ketik '0' untuk selesai):");
            int pilihan;
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `List<MenuCafe> menu = new ArrayList<>();` adalah contoh penggunaan array.

```bash
List<MenuCafe> menu = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
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
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Azizah Pupsitasari Saputri,
NPM: 2210010025,
Kelas: 4A NR BJM
