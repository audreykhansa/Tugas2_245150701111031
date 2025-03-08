package TugasPraktikum2;

public class MainP2 {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        
        pegawai1.setNama("Jackson Wang");
        pegawai1.setJabatan("Product Manager");
        pegawai1.setGajiPokok(14500000);
        pegawai1.setTunjangan(7000000);
        pegawai1.setPotongan(750000);
        pegawai1.setBonusAwal(2000000);

        System.out.println("------------------------------------");
        System.out.println("PEGAWAI 1");
        System.out.println("------------------------------------");
        pegawai1.displayInfo();

        pegawai1.tambahBonus(1800000);

        pegawai1.displayInfoAfterBonus();

        Pegawai pegawai2 = new Pegawai("Sharon Myoui", "UX Researcher", 15000000, 8000000, 1500000, 2500000);

        System.out.println("\n------------------------------------");
        System.out.println("PEGAWAI 2");
        System.out.println("------------------------------------");
        pegawai2.displayInfo();

        pegawai2.tambahBonus(2000000);

        pegawai2.displayInfoAfterBonus();
    }
}
