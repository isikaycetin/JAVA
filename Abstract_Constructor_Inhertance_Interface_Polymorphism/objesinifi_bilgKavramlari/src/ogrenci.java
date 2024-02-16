public class ogrenci extends insan implements Cloneable{
    Object kopyala() throws CloneNotSupportedException{
        return this.clone();
    }
    public String toString(){
        return "bu objenin boyu " + this.boy;

    }
}
