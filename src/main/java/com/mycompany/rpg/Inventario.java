package com.mycompany.rpg;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author aluno
 */
public class Inventario extends Atributos {

    int resposta;
    int resposta1;
    

    private final VedaPerson vp;

    private boolean espada;
    private boolean espadaInfernal;

    private boolean capacete;

    private boolean peitoral;

    private boolean bota;

    private boolean livro;
    private boolean LivroSagrado;

    protected int pocaoCura = 3;

    public Inventario(VedaPerson vp) {
        this.vp = vp;
    }

    //Mostra o inventário abaixo, o do personagem principal assim podendo desequipar e equipar
    
    void equiparGuerreiro() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inventario:\n\n"
                + (espada ? "(1) Espada 'EQUIPADO'" : "(1) Espada")
                + (capacete ? "\n(2) Capacete 'EQUPADO'" : "\n(2) Capacete")
                + (peitoral ? "\n(3) Peitoral 'EQUIPADO'" : "\n(3) Peitoral")
                + (bota ? "\n(4) Bota 'EQUIPADO'" : "\n(4) Bota")
                + (livro ? "\n(5) Livro 'EQUIPADO'" : "\n(5) Livro")
                + "\n\n(6) Fechar inventario");

        System.out.printf("\nDigite aqui: ");

        String resposta = teclado.nextLine().toLowerCase();

        switch (resposta) {
            case "1":
                System.out.println((espada ? "Você desquipou a espada! '-40 FORÇA'\n" : "Você equipou a espada! '+40 FORÇA'"));
                espada();
               
                break;
            case "2":
                System.out.println((capacete ? "Você desequipou o capacete '-10 VITALIDADE'\n" : "Você equipou o capacete '+10 VITALIDADE'"));
                capacete();
                equiparGuerreiro();
                break;
            case "3":
                System.out.println((peitoral ? "Você desequipou o peitoral '-20 VITALIDADE'\n" : "Você equipou o peitoral '+20 VITALIDADE'"));
                peitoral();
                equiparGuerreiro();
                break;
            case "4":
                System.out.println((bota ? "Você desequipou a bota '-10 VITALIDADE' '-15 STAMINA'\n" : "Você equipou a bota '+10 VITALIDADE' '+15 STAMINA'"));
                bota();
                equiparGuerreiro();
                break;
            case "5":
                System.out.println((livro ? "Você desequipou O livro '-50 INTELIGÊNCIA'\n" : "Você equipou o livro '+50 INTELIGÊNCIA'"));
                livro();
                equiparGuerreiro();
                break;
            case "6":
                System.out.println("Você fechou o inventário\n");
                vp.bornPerson();
                break;

            default:
                System.out.println("Item não encontrado tente novamente!\n");
                equiparGuerreiro();
                break;
        }
    }

    public void espada() {
        setForca((espada) ? (Forca =- 40) : (Forca =+ 40));
        espada  =! espada;
        equiparGuerreiro();
    }

    public void capacete() {
        //setVitalidade((capacete) ? (vitalidade -= 10) : (vitalidade += 10));
        //capacete = !capacete;
        if (capacete == true) {
            capacete = false;
            setVitalidade(vitalidade -= 10);

        } else if (capacete == false) {
            capacete = true;
            setVitalidade(vitalidade += 10);
        }
     
    }

    /**
     * asklndasokdnaslkfbasdlkjfbasdfl
     *
     * @param algumaCoisa faça alguma coias aqui
     * @param outraCoisa tira alguma coisa daqui
     * @return Retorna "Nada hahaha
     */
    //<editor-fold defaultstate="collapsed" desc="Capacete">
    /*public String Capacete(int algumaCoisa, String outraCoisa) {
    //setVitalidade((capacete) ? (vitalidade -= 10) : (vitalidade += 10));
    //capacete = !capacete;
    if (capacete == true) {
    capacete = false;
    setVitalidade(vitalidade -= 10);
    
    } else if (capacete == false) {
    capacete = true;
    setVitalidade(vitalidade += 10);
    }
    return "Nada hahaha";
    
    }*/
    //</editor-fold>

    public void peitoral() {
        if (peitoral == true) {
            peitoral = false;
            setVitalidade(vitalidade -= 20);
        } else if (peitoral == false) {
            peitoral = true;
            setVitalidade(vitalidade += 20);
        }

    }

    public void bota() {
        if (bota == true) {
            bota = false;
            setVelocidade(Velocidade -= 20);
        } else if (bota == false) {
            bota = true;
            setVelocidade(Velocidade += 20);
        }

    }

    public void livro() {

        if (livro == true) {
            livro = false;

            setInteligencia(inteligencia -= 50);

        } else if (livro == false) {
            livro = true;
            setInteligencia(inteligencia += 50);
        }
    }

   
    /*/**
    * lsaidfjaslkfnsdlkfansdf.l
    *
    /
    void buff() {
        
        Random RANDOM = new Random();
        
    }*/
    
    
    // Elfa
    //fazer um sistema que ela tera dano mag e fis, e dependendo do item que voce roubar ela vai perder os atributos respectivos dos itens,
    //ela terá dois ataques um para cada tipo de dano e ela vai usá-los aleatóriamente; 
    
    void espadaInfernal() {
        setForca((espadaInfernal) ? (Forca -= 550) : (Forca += 550));
        espadaInfernal = !espadaInfernal;
     }
    void LivroSagrado() {
        setInteligencia((LivroSagrado) ? (inteligencia -= 550) : (inteligencia += 550));
        LivroSagrado = !LivroSagrado;
     }
    
    
    void FadaEquip() {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();

        System.out.println("");
               
        System.out.println("Inventário da Elfa:\n\n"
                + "(1)EspadaInfernal\n"
                + "(2)LivroSagrado\n"
                + "(3)Fechar Inventário\n"
                + "tentar roubar ou quebrar qual item:");
       
        resposta = teclado.nextInt();
        
        //adiantar batalha com a fada
        
        switch (resposta){
           case 1:
               String[] actions = {"roubou", "quebrou", "não conseguiu nd"}; 
               int randomEspada = random.nextInt(actions.length);
               String EscolherAcao = actions[randomEspada];
               System.out.println("Você " + EscolherAcao);
               break;
        
           case 2:
               String[] actions2 = {"roubou", "quebrou", "não conseguiu nd"}; 
               int randomLivro = random.nextInt(actions2.length);
               String EscolherAcao1 = actions2[randomLivro];
               System.out.println("Você " + EscolherAcao1);
           default:
               vp.bornPerson();
               return;
    }
        
        /*switch ("1"){
            case "roubar":
                 int randomRoubo = random.nextInt(actions.length);
                 
                 
            case "quebrar":
                 int randomQuebrar = random.nextInt(actions.length);
                 
                 
            case "deixar":
                
        }*/
        
        
        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*System.out.println("Inventario Fada:\n\n"
                + (espadaInfernal ? "(1) Espada 'EQUIPADO'" : "(1) Espada")
                + "\n\n(6) Fechar inventario");
        
        if (resposta1){
            
        }
        
    
     switch (resposta1) {
            case 1:
                System.out.println((espadaInfernal ? "Você roubou a Espada Infernal! '-550 FORÇA'" : "Você equipou a espada! '+550 FORÇA'"));
                espadaInfernal();
                FadaEquip();
                break;
            case 2:
                System.out.println((espadaInfernal ? "Você não roubou a Espada Infernal! '-550 FORÇA'" : "Você equipou a espada! '+550 FORÇA'"));
                espadaInfernal();
                FadaEquip();
            default:
                
            }*/
        }
    }
                
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /**
     * Aqui vc escreve explicando oq o 'buff' vai fazer
     * @param a koasndfakjsdnf
     */
   // void buff(int a) {

      //  Random RANDOM = new Random();

    

