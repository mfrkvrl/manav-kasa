import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        double armutFiyat=2.14;
        double elmaFiyat=3.67;
        double domatesFiyat=1.11;
        double muzFiyat=0.95;
        double patlicanFiyat=5.00;

        System.out.println("Armut kaç kilo? : ");
        double  armutKilo=scanner.nextDouble();
        System.out.println("Elma kaç kilo? : ");
        double  elmaKilo=scanner.nextDouble();
        System.out.println("Domates kaç kilo? : ");
        double  domatesKilo=scanner.nextDouble();
        System.out.println("Muz kaç kilo? : ");
        double  muzKilo=scanner.nextDouble();
        System.out.println("Patlıcan kaç kilo? : ");
        double  patlicanKilo=scanner.nextDouble();
        double  tutar=patlicanKilo*patlicanFiyat+armutFiyat*armutKilo+elmaFiyat*elmaKilo+domatesFiyat*domatesKilo+muzFiyat*muzKilo;
        System.out.println("Toplam tutar : " +tutar);
    }
}
