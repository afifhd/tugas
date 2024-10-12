class Hewan {
    private String nama;

    // Constructor
    public Hewan(String nama) {
        this.nama = nama;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Metode untuk suara
    public void suara() {
        System.out.println("Hewan bersuara");
    }
}