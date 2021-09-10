public class Kipas_Angin extends Elektronik{

    private int kecepatan;

    Kipas_Angin(String brand, String warna, double harga, double berat, int jumlah){
        super(brand,warna,harga,berat,jumlah);
    }
    Kipas_Angin(String brand, String warna, double harga, double berat, int jumlah, int kecepatan){
        super.setBrand(brand);
        super.setWarna(warna);
        super.setBerat(berat);
        super.setHarga(harga);
        super.setJumlah(jumlah);
        this.kecepatan=kecepatan;
    }

    public void setKecepatan(int speed){
        this.kecepatan=speed;
    }
    public String getBrand(){
        return super.getBrand();
    }
    public String getWarna(){
        return super.getWarna();
    }
    public double getHarga(){
        return super.getHarga();
    }
    public double getBerat(){
        return super.getBerat();
    }
    public int getJumlah(){
        return super.getJumlah();
    }


    public int getKecepatan(){
        return this.kecepatan;
    }
    public double Bayar(){
        double total;
        if (super.getJumlah()>5){
          total= SetelahDiskon();
       }else{
        total=super.getHarga()*super.getJumlah();
       }
       return total;
    }
    public double Diskon(){
      double diskon=  (0.65  * super.getHarga()*super.getJumlah());
    return diskon;
    }
    public double SetelahDiskon(){
    double harga_setelah_diskon;
     harga_setelah_diskon =(super.getHarga()-Diskon())*super.getJumlah();
return harga_setelah_diskon;
    }
}
