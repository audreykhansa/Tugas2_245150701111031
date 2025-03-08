package TugasPraktikum2;

import java.text.DecimalFormat;

class Pegawai {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double tunjangan;
    private double potongan;
    private double bonusAwal;
    private double tambahanBonus;

    public Pegawai() {
        this("", "", 0, 0, 0, 0);
    }

    public Pegawai(String nama, String jabatan, double gajiPokok, double tunjangan, double potongan, double bonusAwal) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.potongan = potongan;
        this.bonusAwal = bonusAwal;
        this.tambahanBonus = 0;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setPotongan(double potongan) {
        this.potongan = potongan;
    }

    public void setBonusAwal(double bonusAwal) {
        this.bonusAwal = bonusAwal;
    }

    public double hitungGajiTotalSebelumBonus() {
        return gajiPokok + tunjangan + bonusAwal - potongan;
    }

    public double hitungGajiTotalUpdated() {
        return gajiPokok + tunjangan + bonusAwal + tambahanBonus - potongan;
    }

    public void displayInfo() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.printf("%-20s : %s%n", "Nama", nama);
        System.out.printf("%-20s : %s%n", "Jabatan", jabatan);
        System.out.printf("%-20s : Rp%s%n", "Gaji Pokok", df.format(gajiPokok));
        System.out.printf("%-20s : Rp%s%n", "Tunjangan", df.format(tunjangan));
        System.out.printf("%-20s : Rp%s%n", "Potongan", df.format(potongan));
        System.out.printf("%-20s : Rp%s%n", "Bonus Awal", df.format(bonusAwal));
        System.out.printf("%-20s : Rp%s%n", "Total Gaji", df.format(hitungGajiTotalSebelumBonus()));
    }

    public void displayInfoAfterBonus() {
        DecimalFormat df = new DecimalFormat("#,###");
        System.out.printf("\n%-20s : Rp%s%n", "Tambahan Bonus", df.format(tambahanBonus));
        System.out.printf("%-20s : Rp%s%n", "Total Bonus", df.format(bonusAwal + tambahanBonus));
        System.out.printf("%-20s : Rp%s%n", "Total Gaji (updated)", df.format(hitungGajiTotalUpdated()));
    }

    public void tambahBonus(double tambahanBonus) {
        this.tambahanBonus += tambahanBonus;
    }
}
