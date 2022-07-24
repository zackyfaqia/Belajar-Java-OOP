//mengaplikasikan pelajaran OOP ke file ini 

//import jdk.dynalink.beans.StaticClass;

class Mahasiswa {
    // Data Member
    String nama;
    String NIM;

    // Constructor
    Mahasiswa(String nama, String NIM) {
        this.nama = nama;
        this.NIM = NIM;
    }

    // Method tanpa return dan tanpa parameter
    void show() {
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.NIM + "\n");
    }

    // Method tanpa return dengan parameter
    void setNama(String nama) {
        this.nama = nama;

    }

    // Method dengan return tanpa parameter
    String getNama() {
        return this.nama;
    }

    String getNIM() {
        return this.NIM;
    }

    // Method dengan return dan parameter
    String sayHi(String message) {
        return message + " juga, nama saya adalah " + this.nama;
    }

}

public class MahasiswaApp {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa("Hobs", "1111");
        Mahasiswa mahasiswa2 = new Mahasiswa("Shaw", "1122");

        // Manggil Method
        mahasiswa1.show();
        mahasiswa2.show();
        mahasiswa1.setNama("Lisa");
        mahasiswa1.show();

        System.out.println(mahasiswa1.getNama());
        System.out.println(mahasiswa1.getNIM());

        String data = mahasiswa1.sayHi("lumayan");
        System.out.println(data);

    }
}
