package event_management;
public abstract class Kegiatan {
    private String namaKegiatan;
    private String tanggalKegiatan;
    private String lokasiKegiatan;

    // Constructor untuk kelas Kegiatan
    public Kegiatan(String namaKegiatan, String tanggalKegiatan, String lokasiKegiatan) {
        this.namaKegiatan = namaKegiatan;
        this.tanggalKegiatan = tanggalKegiatan;
        this.lokasiKegiatan = lokasiKegiatan;
    }

    // Getter dan Setter dengan konsep Enkapsulasi
    public String getNamaKegiatan() {
        return namaKegiatan;
    }

    public void setNamaKegiatan(String namaKegiatan) {
        this.namaKegiatan = namaKegiatan;
    }

    public String getTanggalKegiatan() {
        return tanggalKegiatan;
    }

    public void setTanggalKegiatan(String tanggalKegiatan) {
        this.tanggalKegiatan = tanggalKegiatan;
    }

    public String getLokasiKegiatan() {
        return lokasiKegiatan;
    }

    public void setLokasiKegiatan(String lokasiKegiatan) {
        this.lokasiKegiatan = lokasiKegiatan;
    }

    // Abstract method untuk menampilkan detail kegiatan
    public abstract void tampilkanDetailKegiatan();
}
