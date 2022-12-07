
public class idman {
    
    private int mekik_sayisi;
    private int barfiks_sayisi;
    private int sinav_sayisi;
    private int squat_sayisi;

    public idman(int mekik_sayisi, int barfiks_sayisi, int sinav_sayisi, int squat_sayisi) {
        this.mekik_sayisi = mekik_sayisi;
        this.barfiks_sayisi = barfiks_sayisi;
        this.sinav_sayisi = sinav_sayisi;
        this.squat_sayisi = squat_sayisi;
    }

    public int getMekik_sayisi() {
        return mekik_sayisi;
    }

    public void setMekik_sayisi(int mekik_sayisi) {
        this.mekik_sayisi = mekik_sayisi;
    }

    public int getBarfiks_sayisi() {
        return barfiks_sayisi;
    }

    public void setBarfiks_sayisi(int barfiks_sayisi) {
        this.barfiks_sayisi = barfiks_sayisi;
    }

    public int getSinav_sayisi() {
        return sinav_sayisi;
    }

    public void setSinav_sayisi(int sinav_sayisi) {
        this.sinav_sayisi = sinav_sayisi;
    }

    public int getSquat_sayisi() {
        return squat_sayisi;
    }

    public void setSquat_sayisi(int squat_sayisi) {
        this.squat_sayisi = squat_sayisi;
    }
    
    
    public void hareket_yap(String hareket, int hareket_sayisi){
        switch (hareket) {
            case "mekik":
                mekik_sayisi -= hareket_sayisi;
                if(mekik_sayisi == 0){
                    System.out.println("Mekik hareketinizi tamamladınız..\n");
                    
                }
                
                else if(mekik_sayisi < 0){
                    mekik_sayisi = 0;
                    System.out.println("Tebrikler.. Mekik hareketini fazlasıyla tamamladınız..\n");
                }
                
                else{
                    System.out.println(" Mekik içim kalan hareketiniz: " + mekik_sayisi + "\n");
                }
                
                break;
                
             case "barfiks":
                barfiks_sayisi -= hareket_sayisi;
                if(barfiks_sayisi == 0){
                    System.out.println("Barfiks hareketinizi tamamladınız..\n");
                    
                }
                
                else if(barfiks_sayisi < 0){
                    barfiks_sayisi = 0;
                    System.out.println("Tebrikler.. barfiks hareketini fazlasıyla tamamladınız..\n");
                }
                
                else{
                    System.out.println("barfiks içim kalan hareketiniz: " + barfiks_sayisi + "\n");
                }
                
                break;
                
             case "sinav":
                sinav_sayisi -= hareket_sayisi;
                if(sinav_sayisi == 0){
                    System.out.println("sinav hareketinizi tamamladınız..\n");
                    
                }
                
                else if(sinav_sayisi < 0){
                    sinav_sayisi = 0;
                    System.out.println("Tebrikler.. sinav hareketini fazlasıyla tamamladınız..\n");
                }
                
                else{
                    System.out.println(" sinav içim kalan hareketiniz: " + sinav_sayisi + "\n");
                }
                
                break;
                
            case "squat":
                squat_sayisi -= hareket_sayisi;
                if(squat_sayisi == 0){
                    System.out.println("squat hareketinizi tamamladınız..\n");
                    
                }
                
                else if(squat_sayisi < 0){
                    squat_sayisi = 0;
                    System.out.println("Tebrikler.. squat hareketini fazlasıyla tamamladınız..\n");
                }
                
                else{
                    System.out.println(" squat içim kalan hareketiniz: " + squat_sayisi + "\n");
                }
                
                break;    
                
            default:
                System.out.println("Geçersiz hareket!!\n");
        }
        
        
    }
    
    public boolean idman_bittimi(){
        
    return (mekik_sayisi == 0) && (barfiks_sayisi == 0) && (sinav_sayisi == 0) && (squat_sayisi == 0);
    }
}
