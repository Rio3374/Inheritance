package inheritance;
public class Ketua extends Dosen {
public int tahunMulai;
public int jabatanKe;

public Ketua (String nidn, String nama, String jenisKelamin, int tahunMulai, int jabatanKe){
super(nidn, nama, jenisKelamin);
this.tahunMulai=tahunMulai;
this.jabatanKe=jabatanKe;
}    

public void viewKetua(){
    System.out.println("Tahun Mulai Jabatan : "+tahunMulai);
    System.out.println("Jabatan Ke- : "+jabatanKe);
}
}
