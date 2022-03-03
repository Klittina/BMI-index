package metódusok;

public class Metódusok {

    public static void masikmetodus(){
        System.out.println("Sya");
    }
    public static void valami(){
        masikmetodus();
    }
    public static void main(String[] args) {
        // metódusok ---> függvény/eljárás ---> az egyiknek van visszatérési értéke ---> return
        valami();
    }
    
}
