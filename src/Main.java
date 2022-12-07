
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new  Scanner(System.in);
        
        System.out.println("İdman Programına Hoşgeldiniz..");
        
        String hareketler = "-->  mekik   <--\n"+
                            "-->  barfiks <--\n"+
                            "-->  sinav   <--\n"+
                            "-->  squat   <--\n";
        
        System.out.println(hareketler);
        
        System.out.println("kaç adet idman yapmak istiyorsunuz?:");
        int adet = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("idmanınız başlıyor..");
        
        idman idman1 = new idman(adet, adet, adet, adet);
        
        while (idman1.idman_bittimi() == false) {
            
            System.out.println("yapmak istediğiniz hareketi yazınız: ");
            String hareket =scanner.nextLine();
            
            System.out.println(hareket + " hareketinden kaç tane yapacaksınız?: ");
            adet =scanner.nextInt();
            scanner.nextLine();
            
            idman1.hareket_yap(hareket, adet);
            
            
        }
        
        System.out.println("\nIDMAN PROGRAMINI BASARIYLA TAMAMLADINIZ..");
       
        
        
        
        
        
        
        
    }
    
}
