/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alph
 */
public class AppliOperat_BitDecalage {
    public static void main (String[ ] args)
    {
    int x,y,z,calcul= 0;
    x=-14;//1...11110010
    y=x;
    z=x;
    calcul= x >>2; //1...11111100;
    System.out.println("x>>2 ="+calcul);
    calcul=z>>>2; //001...111100
    System.out.println("x>>>2 ="+calcul);
    
    }
    
    
}
