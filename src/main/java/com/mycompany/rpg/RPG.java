  
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
    Inventario inv = new Inventario(vp);
    Walkman wal = new Walkman();
    vp.setInventario(inv);
    
    //início do código "MENU"
    
    System.out.println("Bem-vindo ao VedaPerson!\n*[aperte enter]*");
    a = STRING.nextLine();
    
    //ordem dos acontecimentos
    fp.fallperson();
    vp.xPerson();
    vp.bornPerson();
    vp.pressagio();
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        



