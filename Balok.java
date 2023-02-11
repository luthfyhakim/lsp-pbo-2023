public class Balok extends BangunRuang {
  private final String name = "Balok";
  private int panjang;
  private int lebar;
  private int tinggi;
  
  public int setPanjang(int panjang) {
    return this.panjang = panjang;
  }

  public int setLebar(int lebar) {
    return this.lebar = lebar;
  }

  public int setTinggi(int tinggi) {
    return this.tinggi = tinggi;
  }

  @Override
  public void getName() {
    System.out.println("Nama Bangun Ruang " + this.name);
  }

  @Override
  public double luasPermukaan() {
    // 2 (p.l + p.t + l.t)
    return 2 * (this.panjang*this.lebar + this.panjang*this.tinggi + this.lebar*this.tinggi);
  }

  @Override
  public double volume() {
    // p x l x t
    return this.panjang * this.lebar * this.tinggi;
  }
}