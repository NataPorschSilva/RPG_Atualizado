
package com.mycompany.rpg;

import java.util.Scanner;

/**
 *
 * @author Natã
 * 
 * 
 * Walkman é usado para escutar musicas e dependedo da musica que tocar Aurora recebe algum buff em especifíco (walkman vindo de seu mundo passado e que aparentemente ela não se recorda de nada) 
 * 
 * 
 * 
 * 
 */
public class VedaPerson extends Inventario{
    Scanner resposta = new Scanner (System.in);
    String a;
    
    
    void bornPerson(){
        System.out.println("AURORA! Acorda!...Você está bem?");
        
        String a = resposta.next().toLowerCase();
        if (a.equals("sim")){
            System.out.println("que bom\n");
            
        }else if(a.equals("não") || a.equals("nao")){
            System.out.println("que merda\n");
            
        }else{
            System.out.println("a vai tomar no cu\n");
        }
           
        System.out.println("Ainda está com ele na mochila?\n"
                + "a) Entrar no inventário"
                + "b) Usar walkman "
                + "c) ");   
        String b = resposta.next().toLowerCase();
        switch (b){
            case "a":
                System.out.println("banana");
           
            case "b":    
                System.out.println("");
            case "c":
                System.out.println("");
                
            case "d":
                System.out.println("\n");
                
            default:
        }
        }
     
            
        }
    


        


