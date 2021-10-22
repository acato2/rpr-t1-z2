package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {
    static int sumaCifara(int n){
        int suma=0,cifra;
        while(n>0){
            cifra=n%10;
            suma+=cifra;
            n=n/10;
        }
        return suma;

    }
    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz=new Scanner(System.in);
        int n=ulaz.nextInt();
        System.out.println("Brojevi između 1 i n koji su djeljivi sa sumom svojih cifara su:");
        for(int i=1;i<=n;i++){
            if(i%sumaCifara(n)==0){
                System.out.println(i);
            }
        }
    }

}
