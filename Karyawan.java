
class Karyawan{
  
  String nama;
  String alamat;
  String hobi;
  String agama;
  String profesi;
  int gaji;
  int umur;
  int NRP;
}

public class Data {
  
   public static void main(String[] args) throws Exception{
     
      Karyawan karyawan1 = new Karyawan();
      karyawan1.nama = "Ishak Pasolle";
      karyawan1.alamat = "Imabara1";
      karyawan1.hobi = "Main Sepak bola";
      karyawan1.agama = "Islam";
      karyawan1.profesi = "Marketing";
      karyawan1.gaji = 2000_000;
      karyawan1.umur = 20;
      karyawan1.NRP = 344_24_26;
      
      // cetak hasil outputnya
      System.out.println(karyawan1.nama);
      System.out.println(karyawan1.alamat);
      System.out.println(karyawan1.hobi);
      System.out.println(karyawan1.agama);
      System.out.println(karyawan1.profesi);
      System.out.println(karyawan1.gaji);
      System.out.println(karyawan1.umur);
      System.out.println(karyawan1.NRP);
      
      System.out.println("======================");
      
      // mencetak data kedua
      Karyawan karyawan2 = new Karyawan();
      karyawan2.nama = "Tegar Sabila";
      karyawan2.alamat = "Sunda";
      karyawan2.hobi = "Main Monopoly";
      karyawan2.agama = "Islam";
      karyawan2.profesi = "Teknik Mesin";
      karyawan2.gaji = 1_5;
      karyawan2.umur = 16;
      karyawan2.NRP = 34_26_27_89;
      
      // cetak hasilnya
      System.out.println(karyawan2.nama);
      System.out.println(karyawan2.alamat);
      System.out.println(karyawan2.hobi);
      System.out.println(karyawan2.agama);
      System.out.println(karyawan2.profesi);
      System.out.println(karyawan2.gaji);
      System.out.println(karyawan2.umur);
      System.out.println(karyawan2.NRP);
      
      
   }
}