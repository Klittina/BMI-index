package metódusok;

import java.util.Scanner;

public class bmi_index {
    public static void udvozles(){
        System.out.println("Szia!\n Ez egy BMI számláló program, amivel megnézzük hogy mennyi a testtömegindexed.");
    }
    public static int bekeres(String mitkerekbe, int alsohatar, int felsohatar){
        Scanner sc = new Scanner(System.in);
        System.out.print(mitkerekbe);
        int valasz = sc.nextInt();
        while(valasz<alsohatar || valasz>felsohatar){
            System.out.print(mitkerekbe);
            valasz = sc.nextInt();
        }
        return valasz;
    }
    static double bmi (int kg,  int cm){
        return kg/Math.pow(cm/100.0,2);
    }
    public static void main(String[] args) {
        udvozles();
        int kg;
        int cm;
        kg = bekeres("Írd be légyszives a testtömegedet, kg-ban megadva (40 és 150 kg között).",40,150);
        cm = bekeres("Írd be légyszives a magasságodat, cm-ben megadva (100 és 200 között).",100,200);
        double bmiIndex = bmi(kg,cm);
        
    }
}
