package praktek02;
public class PyramidAksi {
    public static void main(String[] args) {
        
        Pyramid p1 = new Pyramid();
        p1.palas = 6;
        p1.lalas = 5;
        p1.tinggi = 7;
        
        p1.cetakInfo();
        System.out.println("Volume Pyramid = "+p1.hitungVolume());
        p1.cetakVolume();
        
        Pyramid p2 = new Pyramid();
        p2.cetakInfo();
        
        Pyramid p3 = new Pyramid(7,8,9);
        p3.cetakInfo();
    }
}
