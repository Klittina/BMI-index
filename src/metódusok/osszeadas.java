package metódusok;

public class osszeadas {
    //egy metódus egy dolgot csináljon, ne lehessen görgetni
    public static int osszeadas(int a,int b){
        //int c = a+b;
        //System.out.println("Két szám eredménye: "+c);
        return a+b;
    }
    public static void kiir(int szam1, int  szam2 , int szam3){
        System.out.printf("--------------\n");
        System.out.printf("| %d + %d = %d |\n", szam1, szam2, szam3);
        System.out.printf("--------------\n");
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = osszeadas(a,b);
        System.out.println("Két szám eredménye: "+c);
        int ujeredmeny = osszeadas(c,2);
        System.out.println(ujeredmeny);
        kiir(a, b, c);
    }
}
