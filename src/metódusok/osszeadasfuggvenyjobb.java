package metódusok;

public class osszeadasfuggvenyjobb {
    
    static int szam1 = 3;
    static int szam2 = 5;
    
    public static int osszeadas(int szam1, int  szam2){
        return szam1+szam2;
    }
    public static void kiir(int szam1, int  szam2 , int szam3){
        System.out.printf("--------------\n");
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, szam3);
        System.out.printf("--------------\n");
    }
    public static void main(String[] args) {
        int eredmeny = osszeadas(szam1,szam2);
        System.out.println("Két szám eredménye: "+eredmeny);
        int ujeredmeny = osszeadas(eredmeny,2);
        System.out.println(ujeredmeny);
    }
}
