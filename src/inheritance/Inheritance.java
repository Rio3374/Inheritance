package inheritance;
public class Inheritance {
    public static void main(String[] args) {
Ketua ketua = new Ketua ("00120018","Dudung Saprudung","Laki-Laki",2017,2);
Kaprodi kaprodi = new Kaprodi ("12300011","Yuyun Sapruyun","Laki-Laki","Teknik Informatika");

ketua.viewDosen();
ketua.viewKetua();

kaprodi.viewDosen();
kaprodi.viewKaprodi();
}
    
}
