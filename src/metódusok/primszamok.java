package metódusok;

public class primszamok {
    public static void primszam(int szam1, int szam2){
        
    }
    //megnéztük egy számról hogy prim vagynem
    //majd egy sorozatnak minden eleméről megnézzük h ééppen prímszám-e
    public static void main(String[] args) {
        int szam = 10007;
        boolean prim = false;
        int i =2;
        int primszamok = 0;
        while (i<szam-1 && !(szam%i==0)){
            i++;
        }
        boolean vanosztoja =  i>=Math.sqrt(szam);
        System.out.printf("A(z) %d egy prímszám: %b\n",szam, vanosztoja);
        
    }
}