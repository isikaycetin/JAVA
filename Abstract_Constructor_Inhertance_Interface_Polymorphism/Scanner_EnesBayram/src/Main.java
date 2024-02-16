import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adınızı giriniz: ");
        String isim= scanner.nextLine();
        System.out.println("Soyadınızı da giriniz: ");
        String soyIsim= scanner.nextLine();
        System.out.println("Adınız ve Soyadınız "+isim " "+soyIsim);
    }
}