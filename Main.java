import java.util.Scanner;

public class Main {
  private final static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    mainMenu();
  }

  public static void mainMenu() {
    System.out.println("Selamat Datang di Aplikasi Kalkulator Bangun Ruang");
    System.out.println("==================================================");
    System.out.println("Pilihan Bangun Ruang");
    System.out.println("1. Kubus");
    System.out.println("2. Balok");
    System.out.println("3. Bola");
    System.out.println("4. Exit Program");

    System.out.print("Pilih Kode Bangun Ruang : ");
    int kode = input.nextInt();

    switch (kode) {
      case 1:
        kubus();
        break;
      case 2:
        balok();
        break;
      case 3:
        bola();
        break;
      case 4:
        System.out.println("================");
        System.out.println("Exit Program ...");
        System.out.println("================");
        System.exit(0);
        break;
      default:
        System.out.println("Maaf, Bangun Ruang Belum Tersedia");
        mainMenu();
    }
  }

  public static void kubus() {
    Kubus kubus = new Kubus();
    
    System.out.print("Masukkan jumlah sisi : ");
    int sisi = input.nextInt();
    System.out.println("Sisi kubus = " + sisi);
    kubus.setSisi(sisi);

    System.out.println("Luas Permukaan Kubus = 6 x " + sisi + " x " + sisi);
    System.out.println("Luas Permukaan Kubus = " + kubus.luasPermukaan());
    System.out.println("=======================");

    System.out.println("Volume Kubus = " + sisi + " x " + sisi + " x " + sisi);
    System.out.println("Volume Kubus = " + kubus.volume());
    System.out.println("===============");

    kubus.hasil();
  }

  public static void balok() {
    Balok balok = new Balok();

    System.out.println("=======================");
    System.out.print("Masukkan panjang balok = ");
    int panjang = input.nextInt();
    System.out.print("Masukkan lebar balok = ");
    int lebar = input.nextInt();
    System.out.print("Masukkan tinggi balok = ");
    int tinggi = input.nextInt();
    System.out.println("=======================");

    // set value from input
    balok.setPanjang(panjang);
    balok.setLebar(lebar);
    balok.setTinggi(tinggi);

    System.out.println("Luas Permukaan Balok = 2 x ((" + panjang + " x " + lebar + ") + (" + panjang + " x " + tinggi + ") + (" + lebar + " x " + tinggi + "))");
    System.out.println("Luas Permukaan Balok = " + balok.luasPermukaan());
    System.out.println("======================");

    System.out.println("Volume Balok = " + panjang + " x " + lebar + " x " + tinggi);
    System.out.println("Volume Balok = " + balok.volume());
    System.out.println("==============");
  
    balok.hasil();
  }

  public static void bola() {
    Bola bola = new Bola();

    System.out.print("Masukkan Jari - jari Bola = ");
    int jari_jari = input.nextInt();
    System.out.println("=========================");
    System.out.println("Jari - jari Bola = " + jari_jari);
    System.out.println("=========================");

    bola.setJariJari(jari_jari);

    System.out.println("Luas Permukaan Bola = " + "4 x " + Math.PI + " x " + jari_jari + " x " + jari_jari);
    System.out.println("Luas Permukaan Bola = " + bola.luasPermukaan());
    System.out.println("=========================");

    System.out.println("Volume Bola = " + "(4/3) x " + Math.PI + " x " + jari_jari + " x " + jari_jari + " x " + jari_jari);
    System.out.println("Volume Bola = " + bola.volume());
    System.out.println("=========================");

    bola.hasil();
  }
}
