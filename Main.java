import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int pilih;
        String [] data_microwave = new String[0];
        String [] data_kipas = new String[0];
        Microwave beli=new Microwave("","",0.0,0.0,0,0.0);
        Kipas_Angin tumbas=new Kipas_Angin("","",0.0,0.0,0,0);
        while(true){
        System.out.println("======MENU=====");
        System.out.println("1. Input Data Microwave");
        System.out.println("2. Input Data Kipas Angin");
        System.out.println("3. Lihat Data Microwave dan Kipas Angin");
        System.out.println("4. Keluar");
        System.out.print("Masukkan pilihan anda : ");pilih=Integer.parseInt(rd.readLine());


            switch (pilih) {
                case 1 -> {
                    System.out.println("<<<<<<Lihat Data Microwave>>>>>>");
                    System.out.print("Masukan Brand Microwave : ");
                    String brandM = rd.readLine();
                    System.out.print("Masukan Warna Microwave : ");
                    String warnaM = rd.readLine();
                    System.out.print("Masukan Berat Microwave : ");
                    double beratM = Double.parseDouble(rd.readLine());
                    System.out.print("Masukan Kapasitas Microwave : ");
                    double kapasitast = Double.parseDouble(rd.readLine());
                    System.out.print("Masukan Harga Microwave : ");
                    double hargaM = Double.parseDouble(rd.readLine());
                    System.out.print("Masukan Jumlah Microwave : ");
                    int jumlahM = Integer.parseInt(rd.readLine());
                    beli = new Microwave(brandM, warnaM, hargaM, beratM, jumlahM, kapasitast);
                    data_microwave = new String[]{brandM, warnaM, String.valueOf(hargaM), String.valueOf(beratM), String.valueOf(jumlahM), String.valueOf(kapasitast)};
                    System.out.println("\nData Microwave berhasil disimpan");
                }
                case 2 -> {
                    System.out.println(">>>>>>>Input data Kipas Angin<<<<<<<");
                    System.out.print("Masukan Brand Kipas Angin : ");
                    String brandK = rd.readLine();
                    System.out.print("Masukan Warna Kipas Angin : ");
                    String warnaK = rd.readLine();
                    System.out.print("Masukan Berat Kipas Angin : ");
                    double beratK = Double.parseDouble(rd.readLine());
                    System.out.print("Masukan Kecepatan Kipas Angin : ");
                    int fast = Integer.parseInt(rd.readLine());
                    System.out.print("Masukan harga Kipas Angin : ");
                    double hargaK = Double.parseDouble(rd.readLine());
                    System.out.print("Masukan jumlah Kipas Angin : ");
                    int jumlahK = Integer.parseInt(rd.readLine());
                    tumbas = new Kipas_Angin(brandK, warnaK, hargaK, beratK, jumlahK, fast);
                    data_kipas = new String[] {brandK,warnaK,String.valueOf(beratK),String.valueOf(beratK),String.valueOf(jumlahK),String.valueOf(fast)};
                    System.out.println("\nData kipas angin berhasil disimpan");
                }
                case 3 -> {
                    System.out.println("DATA TRANSAKSI MICROWAVE");
                    System.out.println("MICROWAVE");
                    for (int i = 0 ;i<=5;i++){
                        System.out.println(data_microwave[i]);
                    }
                    System.out.println("Total bayar  : " + beli.Bayar() + " mendapatkan diskon : " + beli.Diskon() + " setelah diskon " + beli.SetelahDiskon());
                    System.out.println("KIPAS ANGIN");
                    for (int i = 0 ;i<=5;i++){
                        System.out.println(data_kipas[i]);
                    }

                    System.out.println("Total bayar : " + tumbas.Bayar() + " mendapatkan diskon : " + tumbas.Diskon() + " setelah diskon " + tumbas.SetelahDiskon());
                }
                default -> System.exit(0);
            }
        }
    }
}
