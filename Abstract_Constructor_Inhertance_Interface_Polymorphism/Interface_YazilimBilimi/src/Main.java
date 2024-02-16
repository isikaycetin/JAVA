public class Main {
    public static void main(String[] args) {
         IDatabase idatabase= new Student();
         idatabase.log();

         IDatabase idatabase2= new Customer();
         idatabase2.log();
    }
}