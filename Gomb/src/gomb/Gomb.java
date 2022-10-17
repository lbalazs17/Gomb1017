/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomb;
import java.util.Scanner;
/**
 *
 * @author user11
 */
public class Gomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kérem a gömb sugarát: ");
        double sugar = Double.parseDouble(sc.nextLine());
        Gomb_oszt g = new Gomb_oszt(sugar);
        System.out.println("A kör felszine: "+g.felszin());
        System.out.println("A kör sugara: "+g.terfogat());
        
        Gomb_oszt g1 = new Gomb_oszt(sugar);
        System.out.println("A kör felszine: "+g1.felszin());
        System.out.println("A kör térfogata: "+g1.terfogat());
    }
    
}
