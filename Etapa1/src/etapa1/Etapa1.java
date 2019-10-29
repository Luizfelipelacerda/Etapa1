/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package etapa1;

import java.util.Scanner;

/**
 *
 * @author Lacerda
 */
public class Etapa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int numeroArabico;
        do{
            System.out.println("digite um valor entre 1 a 3999");
            numeroArabico = Integer.parseInt(scanner.nextLine());
        }while(numeroArabico > 3999 || numeroArabico < 0);
        
        Formata f = new Formata();
        String numeroRomano = f.FormataRomano(numeroArabico);
        System.out.println("Arabico "+numeroArabico+" -> Romano "+numeroRomano);
    }
    
}
