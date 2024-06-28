package com.mycompany.rpg;

import static com.mycompany.rpg.VedaPerson.inspecionar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Natã
 * <p>
 * <p>
 * Walkman é usado para escutar musicas e dependedo da musica que tocar Aurora recebe algum buff em especifíco (walkman vindo de seu mundo passado e que aparentemente ela não se recorda de nada)
 */
public class VedaPerson extends Inventario {
    
    private Inventario inv;
    public Walkman wal;
    
    Scanner resposta = new Scanner(System.in);
    String a;
    String c;
    
    void xPerson() {
        System.out.println("Miriel: AURORA! Acorda!...Você está bem?");
        
        String a = resposta.next().toLowerCase();
        if (a.equals("sim")) {
            System.out.println("que bom");
            
        } else if (a.equals("não") || a.equals("nao")) {
            System.out.println("que merda");
            
        } else {
            System.out.println("a vai tomar no cu");
        }
    }

    //Começo das escolhas e história
    //O livro equipado lhe da informações que pessoas normais n tem 
    void bornPerson() {
        
        String b = "";
        while (!b.equals("e")) {
            
            System.out.println("""
                                               
                    Miriel: Pode equipar o Livro na mochila?"
                                               
                    a) Entrar no inventario
                    b) Usar walkman (beta)
                    c) Atributos
                    d) Inventário da Elfa
                    e) *equipei!*""");
            b = resposta.next().toLowerCase();
            
            switch (b) {
                case "a":
                    equiparGuerreiro();
                    break;
                case "b":

                    //wal.Fortalecimento();
                    break;
                case "c":
                    System.out.println("Forca: " + Forca);
                    System.out.println("Velocidade: " + Velocidade);
                    System.out.println("Inteligencia: " + inteligencia);
                    System.out.println("Mana: " + Mana);
                    System.out.println("Vitalidade: " + vitalidade);
                    System.out.println("Dinheiro: " + dinheiro);
                    bornPerson();
                case "d":
                    FadaEquip();
                case "e":
                    pressagio();
            }
        }
    }
    
    public void pressagio() {
        
        System.out.println("Miriel: Ufa então o que fiz n foi inútil...");
        System.out.println("Miriel: Por acaso se sente...'normal?'");
        
        String c;
        c = resposta.next().toLowerCase();
        
        if (c.equals("sim")) {
            System.out.println("Miriel: Wow incrível...\n");
            
        } else if (c.equals("não") || c.equals("nao")) {
            System.out.println("Miriel: Como esperado...\n");
            
        } else {
            System.out.println("Miriel: cuidado com suas palavras...\n");
            
        }
        System.out.println("Miriel: O v0?d_ realmente é assustador...");
        System.out.println("Miriel: Que bom que está tudo bem agora com você\n"
                + "Miriel: Isso me lembra quando eramos crianças, você adorava livros...\n"
                + "Miriel: Sempre amei estar com você,\n"
                + "você era a única que me entendia não é de se duvidar o porque era a próxima rainha ao trono...\n\n"
                + "Miriel: Por acaso lembra dessa memórias lindas?\n");
        
        c = resposta.next().toLowerCase();
        
        if (c.equals("sim")) {
            System.out.println("Miriel: ...Você sempre foi uma mentirosa mesmo ahah...ahahaHAAHAHAHHAHAHAHAHAHAHA");
            antBatalha();
        } else if (c.equals("não") || c.equals("nao")) {
            System.out.println("Miriel: Muito bem meu bichinho é isso mesmo que eu esperava...hahahHAHAHAHHAHAHAHHAHAH");
            antBatalha();
        } else {
            System.out.println("Miriel: É interessante saber isso meu verme favorito você sempre esteve na minha mão...hahaHAHAHAHAHAHAAHAHAHAH");
            antBatalha();
        }
    }
    
    public void antBatalha() {
        
        System.out.println("Miriel: Aiai é tão engraçado, você não tem ideia do passado ao até mesmo do que é não é mesmo?");
        System.out.println("Miriel: Esse livro nunca foi qualquer objeto mágico, ele é uma benção porém uma maldição para você, maldito.");
        System.out.println("Miriel: Com ele você pode até ver meus itens e poderes não é mesmo?");
        batalha();
    }

    // colocar os poderes da elfa no msql e puxar as informacoes dos dois ataques dela quanto 'investigar' as habilidades dela
    public void batalha() throws SQLException {
        
        String c = "";
        while (!c.equals("e")) {
            
            System.out.println("""
                                               
                    Miriel: Vá em frente e faça o teste.
                                               
                    a) Inspecionar
                    b) Usar walkman (beta)
                    c) Atributos da Elfa
                    d) Inventário da Elfa
                    e) *vamos iníciar isso logo*""");
            c = resposta.next().toLowerCase();
            
            switch (c) {
                case "a":
                    inspecionar();
                case "b":
                    wal.Fortalecimento();
                case "c":
                    System.out.println("Forca: " + ForcaELFA);
                    System.out.println("Velocidade: " + VelocidadeELFA);
                    System.out.println("Inteligencia: " + inteligenciaELFA);
                    System.out.println("Mana: " + ManaELFA);
                    System.out.println("Vitalidade: " + vitalidadeELFA);
                    System.out.println("Dinheiro: " + dinheiroELFA);
                    batalha();
                case "d":
                    FadaEquip();
                case "e":
                    System.out.println("issae");
            }
        }
    }
    
    private void inspecionar(Poderes poderes) throws SQLException { //criar classe poderes Poderes poderes
    Conexao c = new Conexao();
    try (Connection conn = c.getConexao()) {
    
    String sql = "SELECT * FROM poderes";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    
    if (rs.next()) {
    int id = rs.getInt("id");
    String tipo = rs.getString("tipo");
    String nome = rs.getString("nome");
    int dano = rs.getInt("dano");
    }
    
    }
    
    }

//public void batalha(int indice) {
//if (indice >= 0 && indice < poderes.size()) {
//Poder poder = poderes.get(indice);
//poder.usar();
//} else {
//System.out.println("Índice inválido!");
//}
//}
public void setInventario(Inventario inv) {

        this.inv = inv;
    }

    public VedaPerson getVedaPerson() {
        return this;
    }

    private void inspecionar() throws SQLException {
        Conexao c = new Conexao();
    try (Connection conn = c.getConexao()) {
    
    String sql = "SELECT * FROM poderes";
    Statement stmt = conn.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    
    if (rs.next()) {
    int id = rs.getInt("id");
    String tipo = rs.getString("tipo");
    String nome = rs.getString("nome");
    int dano = rs.getInt("dano");
    }
    
    }
    }

}
