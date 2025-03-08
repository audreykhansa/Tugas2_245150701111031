package TugasPraktikum2;

public class MainP2 {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        
        pegawai1.setNama("Budi");
        pegawai1.setJabatan("Manager");
        pegawai1.setGajiPokok(5000000);
        pegawai1.setTunjangan(1000000);
        pegawai1.setPotongan(500000);
        pegawai1.setBonusAwal(200000);

        System.out.println("------------------------------------");
        System.out.println("PEGAWAI 1");
        System.out.println("------------------------------------");
        pegawai1.displayInfo();

        pegawai1.tambahBonus(300000);

        pegawai1.displayInfoAfterBonus();

        Pegawai pegawai2 = new Pegawai("Siti", "Supervisor", 4000000, 800000, 300000, 150000);

        System.out.println("\n------------------------------------");
        System.out.println("PEGAWAI 2");
        System.out.println("------------------------------------");
        pegawai2.displayInfo();

        pegawai2.tambahBonus(200000);

        pegawai2.displayInfoAfterBonus();
    }
}
