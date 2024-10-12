class Mamalia {
    private String jenis;

    // Constructor
    public Mamalia(String jenis) {
        this.jenis = jenis;
    }

    // Getter
    public String getJenis() {
        return jenis;
    }

    // Setter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    // Metode untuk menjelaskan mamalia
    public void info() {
        System.out.println("Ini adalah mamalia.");
    }
}