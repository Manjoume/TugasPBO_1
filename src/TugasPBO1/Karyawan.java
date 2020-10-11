package TugasPBO1;

public class Karyawan {
    private static String nama = "Yoshino";
    private static int setUmur(){
        int umur = 18;
        return umur;
    }
    private static String alamat = "Fukuoka, Japanaese";
    private static int setGaji() {
        int gaji = 215000;
        return gaji;
    }
    private static double settinggi(){
        double tinggi = 160;
        return tinggi;
    }
    private static String warga = "WNA";

    private static String personal = "Bertanggung Jawab";
    public static void main (String[] args){
        System.out.println("\tData Karyawan");
        System.out.println("Nama  \t: " + nama);
        System.out.println("Umur  \t: " + setUmur());
        System.out.println("Alamat\t: " + alamat);
        System.out.println("Gaji per Bulan  : " + setGaji());
        System.out.println("Tinggi Badan    : " + settinggi());
        System.out.println("Kewarganegaraan : " + warga);
        System.out.println("Personaliti     : " + personal);
    }
}