import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int n1, n2, selecet;

        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin : ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Girin : ");
        n2 = inp.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("İşlem Seçin : ");
        selecet = inp.nextInt();

        switch (selecet) {
            case 1:
                System.out.println("Toplam : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                if (n2!=0){
                    System.out.println("Sonuç : "+(n1 / n2));
                }else {
                    System.out.println("Sayı 0'a Bölünemez. Lütfen Tekrar Deneyin.");

                }
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız,Lütfen Tekrar Deneyin.");


        }

    }

}
