/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;

/**
 *
 * @author Heberth Córdova
 */
public class Principal {
     public static void main(String[] args) 
     {
         Personal2 p1 = new Personal2 ("Angela", "Rivera","Peruana",'F',"Soltera", 36 );
         Personal2 p2 = new Personal2 ("Carmen", "Rojas","Peruana",'F',"Casada", 38 );
         Personal2 p3 = new Personal2 ("Andrea", "Rosales","Peruana",'F',"Soltera", 26 );
         p1.Mostrarinf();
         p2.Mostrarinf();
         p3.Mostrarinf();
     }
}

