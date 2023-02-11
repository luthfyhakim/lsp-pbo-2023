public class Bola extends BangunRuang {
  private final String name = "Bola";
  private int jari_jari;
  
  public int setJariJari(int jari_jari) {
    return this.jari_jari = jari_jari;
  }

  @Override
  public void getName() {
    System.out.println("Nama Bangun Ruang " + this.name);
  }

  @Override
  public double luasPermukaan() {
    // 4 π r2
    return 4 * Math.PI * this.jari_jari * this.jari_jari;
  }

  @Override
  public double volume() {
    // (4/3) x  π  x  r3
    return (4/3) * Math.PI * this.jari_jari * this.jari_jari * this.jari_jari;    
  }
}
