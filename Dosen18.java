public class Dosen18 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen18(String kd, String name, boolean jk, int age) {
        this.kode = kd;
        this.nama = name;
        this.jenisKelamin = jk;
        this.usia = age;
    }

    public void tampil() {
        System.out.println(kode + "  " + nama + "  " + (jenisKelamin ? "Laki-laki" : "Perempuan") + "  " + usia);
    }
}
