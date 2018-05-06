package praktek02;
public class Pyramid {
    double palas;
    double lalas;
    double tinggi;

    public Pyramid() {
        palas=9;
        lalas=4;
        tinggi=10;
    }

    public Pyramid(double palas, double lalas, double tinggi) {
        this.palas = palas;
        this.lalas = lalas;
        this.tinggi = tinggi;
    }
    
    
    
    void cetakInfo(){
        System.out.println("======================");
        System.out.println("Panjang Alas : "+palas);
        System.out.println("Lebar Alas   : "+lalas);
        System.out.println("Tinggi       : "+tinggi);
        System.out.println("======================");
    }
 
    double hitungVolume(){
        double volume;
        volume=(palas*lalas*tinggi)/3;
        return volume;
    }
    
    void cetakVolume(){
        System.out.println("Volumenya adalah : "+hitungVolume());
    }
}
