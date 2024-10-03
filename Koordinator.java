/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package event_management;

/**
 *
 * @author ASUS
 */
public class Koordinator extends Kegiatan implements PelaksanaKegiatan,PengelolaKegiatan{
    private String[] anggotaKegiatan;

    // Constructor untuk kelas Koordinator
    public Koordinator(String namaKegiatan, String tanggalKegiatan, String lokasiKegiatan, String[] anggotaKegiatan) {
        super(namaKegiatan, tanggalKegiatan, lokasiKegiatan); // memanggil constructor kelas induk
        this.anggotaKegiatan = anggotaKegiatan;
    }

    @Override
    public void tampilkanDetailKegiatan() {
if (anggotaKegiatan.length == 0) {
            System.out.println("Tidak ada kegiatan yang tersedia.");
        } else {
            System.out.println("Detail Kegiatan:");
            System.out.println("Nama Kegiatan: " + getNamaKegiatan());
            System.out.println("Tanggal: " + getTanggalKegiatan());
            System.out.println("Lokasi: " + getLokasiKegiatan());
            System.out.println("Anggota yang berpartisipasi:");
            for (String anggota : anggotaKegiatan) {
                System.out.println("- " + anggota);
            }
        }    }

    @Override
    public void melaksanakanKegiatan() {
        System.out.println(getNamaKegiatan() + " sedang dilaksanakan oleh para anggota.");
    }

    @Override
    public void mengelolaKegiatan() {
        System.out.println(getNamaKegiatan() + " sedang dikelola oleh Koordinator.");
    }
    
}
