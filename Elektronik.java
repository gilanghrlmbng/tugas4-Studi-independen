public class Elektronik {
    private String brand, warna;
    private double harga, berat;
    private int jumlah;

    Elektronik(){

    }
    Elektronik(String brand, String warna, double harga, double berat, int jumlah){
    this.brand=brand;
    this.warna=warna;
    this.harga=harga;
    this.jumlah=jumlah;
    this.berat=berat;
    }
    public void setBrand(String brand){
    this.brand=brand;
    }
    public void setWarna(String warna){
    this.warna=warna;
    }
    public void setHarga(double harga){
    this.harga=harga;
    }
    public void setBerat(double berat){
        this.berat=berat;
    }
    public void setJumlah(int jumlah){
        this.jumlah=jumlah;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getWarna(){
        return this.warna;
    }
    public double getHarga(){
        return this.harga;
    }
    public double getBerat(){
        return this.berat;
    }
    public int getJumlah() {
        return this.jumlah;
    }
}