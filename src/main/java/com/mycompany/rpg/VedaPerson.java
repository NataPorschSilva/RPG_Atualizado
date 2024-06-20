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
public class VedaPerson extends Atributos {
    
    private Inventario inv;
    private Walkman wal;
    
    Scanner resposta = new Scanner(System.in);
    String a;
    int contador;
    String resposta1;


    void xPerson() {
        System.out.println("AURORA! Acorda!...Você está bem?");

        String a = resposta.next().toLowerCase();
        if (a.equals("sim")) {
            System.out.println("que bom");

        } else if (a.equals("não") || a.equals("nao")) {
            System.out.println("que merda");

        } else {
            System.out.println("a vai tomar no cu");
        }
    }

    void bornPerson() {
        System.out.println("""
                           
                           Pode equipar o Livro na mochila?"
                           
                           a) Entrar no inventario
                           b) Usar walkman
                           c) Atributos
                           d) Inventário da Elfa""");
        String b = resposta.next().toLowerCase();
        switch (b) {
            case "a":
                inv.equiparGuerreiro();
                break;
            case "b":
                this.wal.upgrade();
                bornPerson();
                break;
            case "c":
                Atributos at = new Atributos();
                System.out.println("Força: " + at.Forca);
                System.out.println("Velocidade: " + at.getVelocidade());
                System.out.println("Inteligência: " + at.inteligencia);
                System.out.println("Mana: " + at.getMana());
                System.out.println("Vitalidade: " + at.vitalidade);
                System.out.println("Dinheiro: " + at.getDinheiro());
                bornPerson();
                break;
            case "d":
                inv.FadaEquip();
                break;
            default:
        }
        
    }
        
        public void pressagio() {

        String c = resposta.next().toLowerCase();

        System.out.println("equipou o livro?");
       if (a.equals("sim")) {
            System.out.println("ótimo\n");

        } else if (a.equals("não") || a.equals("nao")) {
            System.out.println("EQUIPA AGORA\n");
            bornPerson();    
        } else {
            System.out.println("tá mas...\n");
            pressagio();
        }
       
    }
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        
        
   
    public void setInventario(Inventario inv){
        
        this.inv = inv;
    }
    
    public VedaPerson getVedaPerson(){
        return this;
    }
    
}