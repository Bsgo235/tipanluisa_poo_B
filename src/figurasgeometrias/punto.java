/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurasgeometrias;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class punto {
     public static void main(String[] args) {
       Scanner arje=new Scanner (System.in);
       System.out.println("Ingrese el radio ");
       int radio=arje.nextInt();
       double longitud=radio*2*(3.1416);
       System.out.println("longitud es de= "+longitud+"cm");
    }
}
   