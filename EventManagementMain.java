package event_management;
public class EventManagementMain {
    public static void main(String[] args) {
        // TODO code application logic here
        // Daftar anggota yang berpartisipasi dalam kegiatan
        String[] anggota = {"Ani", "Budi", "Citra", "Doni"};

        // Membuat objek Koordinator
        Koordinator koordinator1 = new Koordinator("Lomba Teknologi", "20 Oktober 2024", "Gedung Serba Guna", anggota);

        // Menampilkan detail kegiatan
        koordinator1.tampilkanDetailKegiatan();

        // Mengelola dan melaksanakan kegiatan
        koordinator1.mengelolaKegiatan();
        koordinator1.melaksanakanKegiatan();
    }
    
}
