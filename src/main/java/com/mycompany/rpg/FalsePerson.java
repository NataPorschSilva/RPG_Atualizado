
package com.mycompany.rpg;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class FalsePerson {
    
    void fallperson(){
        Scanner teclado = new Scanner(System.in);
        String a;
        System.out.println("Qual sua altura.....\n"
                + "a)Alto"
                + "\nb)Médio"
                + "\nc)Baixo");
        String z = teclado.next().toLowerCase();
        System.out.println("Qual estilo de roupa....\n"
                + "a)Elegante. ...\n" 
                + "b)Casual\n" 
                + "c)Criativo\n" 
                + "d)Dramático\n" 
                + "e)Romântico\n" 
                + "f)Sexy.");
        String b = teclado.next().toLowerCase();
        System.out.println("Qual seu tipo de sangue preferido.....\n"
                + "a)ABO\n"
                + "b)A\n"
                + "c)B\n"
                + "d)AB\n"
                + "e)O");
        String c = teclado.next().toLowerCase();
        System.out.println("Qual sua escolha de classe....\n"
                + "a)Doce\n"
                + "b)Azedo\n" 
                + "c)Salgado\n" 
                + "d)Amargo\n"
                + "e)Medo");
        String d = teclado.next().toLowerCase();
        System.out.println("Dê um nome para a criação:");
        String f = teclado.next().toLowerCase();
        System.out.println("Qual nome de seu criador:");
        String g = teclado.next().toLowerCase();
        
        System.out.println("Obrigado...");
        System.out.println("Pelo seu tempo...");
        a = teclado.nextLine();
        System.out.println("Sua criação...");
        System.out.println("Sua bela criação agr...");
        b = teclado.nextLine();
        System.out.println("Será descartada\nninguém pode escolher o que quer ser nesse mundo.");
        System.out.println("seu nome é...");
    }
    }


