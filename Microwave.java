public class Microwave extends Elektronik{


    private double kapasitas;

    Microwave(String brand, String warna, double harga, double berat, int jumlah){
    super(brand,warna,harga,berat,jumlah);
    }
    Microwave(String brand, String warna, double harga, double berat, int jumlah, double kapasitas){
        super(brand,warna,harga,berat,jumlah);
        this.kapasitas=kapasitas;
    }


    public void setKapasitas(double capacities){
        this.kapasitas=capacities;
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

    public double getKapasitas(){
        return this.kapasitas;
    }

    public double Bayar(){
        double total;
        if (super.getJumlah()>2){
            total= SetelahDiskon();
        }else{
            total=super.getHarga()*super.getJumlah();
        }
        return total;
    }
    public double Diskon(){
        double diskon=  (0.45 * super.getHarga())*super.getJumlah();
        return diskon;
    }
    public double SetelahDiskon(){
        double harga_setelah_diskon;
        harga_setelah_diskon =(super.getHarga()-Diskon())*super.getJumlah();
        return harga_setelah_diskon;
    }
}
