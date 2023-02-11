public class Kubus extends BangunRuang {
  private final String name = "Kubus";
  private int sisi;
  
  public int setSisi(int sisi) {
    return this.sisi = sisi;
  }

  @Override
  public void getName() {
    System.out.println("Nama Bangun Ruang " + this.name);
  }

  @Override
  public double luasPermukaan() {
    // 6 x sisi x sisi
    return 6 * this.sisi * this.sisi;
  }

  @Override
  public double volume() {
    // sisi x sisi x sisi
    return this.sisi * this.sisi * this.sisi;
  }
}
