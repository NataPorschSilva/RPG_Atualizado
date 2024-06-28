
package com.mycompany.rpg;

import java.util.Scanner;

/**
 * @author aluno
 */
public class FalsePerson {

    void fallperson() {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Void: Qual sua altura.....\n"
                + "a)Alto\n"
                + "b)Médio\n"
                + "c)Baixo");
        String z = teclado.next().toLowerCase();
        System.out.println("Void: Qual estilo de roupa....\n"
                + "a)Elegante\n"
                + "b)Casual\n"
                + "c)Criativo\n"
                + "d)Dramático\n"
                + "e)Romântico\n"
                + "f)Sexy");
        String b = teclado.next().toLowerCase();
        System.out.println("Void: Qual seu tipo de sangue preferido.....\n"
                + "a)ABO\n"
                + "b)A\n"
                + "c)B\n"
                + "d)AB\n"
                + "e)O");
        String c = teclado.next().toLowerCase();
        System.out.println("Void: Qual sua escolha de classe....\n"
                + "a)Doce\n"
                + "b)Azedo\n"
                + "c)Salgado\n"
                + "d)Amargo\n"
                + "e)Medo");
        String d = teclado.next().toLowerCase();
        System.out.println("Void: Dê um nome para a criação:");
        String f = teclado.next().toLowerCase();
        System.out.println("Void: Qual nome de seu criador:");
        String g = teclado.next().toLowerCase();

        System.out.println("Void: Obrigado...");
        System.out.println("Pelo seu tempo...");
        b = teclado.nextLine();
        System.out.println("Sua criação...");
        System.out.println("Sua bela criação agr...");
        b = teclado.nextLine();
        System.out.println("Void: Será descartada\nninguém pode escolher o que quer ser nesse mundo.");
        System.out.println("Seu nome é...");
    }
}


