import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Gişe uygulaması yaaplım tc numaranız doğru ise sıra versin yamlış ise uyarsın.
        Scanner scanner= new Scanner(System.in);

        System.out.println("Gişe Uygulamasina Hosgeldiniz");
        System.out.print("Lütfen TCKN nizi giriniz : ");

        String tckn= scanner.nextLine();

        TCKN tckn1 = new TCKN();
        tckn1.setTckn(tckn);
    }
}