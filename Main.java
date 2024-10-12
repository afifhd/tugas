public class Main {
    public static void main(String[] args) {
        // Menginstansiasi objek dari kelas Kucing
        Kucing kucing = new Kucing("Kitty");
        kucing.suara(); // Output: Kitty berkata: Meow!

        // Menginstansiasi objek dari kelas Anjing
        Anjing anjing = new Anjing("Buddy");
        anjing.suara(); // Output: Buddy berkata: Woof!

        // Menginstansiasi objek dari kelas Kelinci
        Kelinci kelinci = new Kelinci("Lincah");
        kelinci.info(); // Output: Kelinci adalah mamalia kecil.

        // Demonstrasi setter dan getter
        kucing.setNama("Luna");
        System.out.println("Nama kucing baru: " + kucing.getNama()); // Output: Nama kucing baru: Luna
    }
}