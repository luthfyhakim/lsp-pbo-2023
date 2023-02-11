public abstract class BangunRuang {
  abstract double luasPermukaan();
  abstract double volume();
  abstract void getName();

  void hasil() {
    this.getName();
    System.out.println("Luas      : " + this.luasPermukaan());
    System.out.println("Volume    : " + this.volume());
    System.out.println("Terima Kasih Telah Menggunakan Aplikasi Ini");
  }
}