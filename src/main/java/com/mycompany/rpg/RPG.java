
package com.mycompany.rpg;

import java.util.Scanner;

/**
 *
 * @author Natã
 */
public class RPG {

    public static void main(String[] args) {
        
    Scanner STRING = new Scanner(System.in);
    Scanner INT = new Scanner(System.in);
    
    Atributos at = new Atributos();
    String a;
    FalsePerson fp = new FalsePerson();
    VedaPerson vp = new VedaPerson();
    
    System.out.println("Bem-vindo ao VedaPerson!\n*[aperte enter]*");
    a = STRING.nextLine();
    
    fp.fallperson();
   
    vp.bornPerson();
        //System.out.println(at.toString()); depois usar
    }
}
