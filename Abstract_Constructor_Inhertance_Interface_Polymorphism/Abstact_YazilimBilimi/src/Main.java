public class Main {
    public static void main(String[] args) {
        /*sınıfların kullanımındaki amaç, nesne türetilirken şablon oluşturmaktır.
        Yani yukarıda bahsettiğim üzere kalıtım yaparak kullandığımız abstract sınıf
        özelliklerini override işlemine tabi tutarak yeniden tanımlayabiliriz.
        Örnek olarak Apple, Samsung, Huawei gibi markaları ele alalım. Bu örnek verdiğim markalarının birtakım ortak özellikleri
         ve birbirlerinden farklı özellikleri de bulunmaktadır.
         Hepsinin ortak noktasını düşünürsek hepsinin Akıllı telefon üreticisi olduğunu görürüz.
         Aralarındaki farklara ise işletim sistemleri, vergi hükümlülükleri gibi örnekler verebilirim.*/
         */
        Mongo mongo = new Mongo();
        AbstractDatabase abstractdatabase = new Mysql();
        mongo.add();
        mongo.get();
        mongo.delete();
        mongo.update();
        System.out.println("--------------");

        abstractdatabase.add();
        abstractdatabase.delete();
        abstractdatabase.get();
        abstractdatabase.update();

    }
}