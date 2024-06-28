package com.mycompany.rpg;
import java.sql.DriverManager; // biblioteca 

/**
 *
 * @author Natã //mortos vivos ja estão mortos, faça algum metodo para acabar com eles de forma diferente.
 */
public class Atributos {
    
    
//--------------------------ATRIBUTOS-DO-PERSONAGEM-PRINCIPAL--------------------------------------
    
    public int Forca;
    protected int Velocidade;
    protected int Mana;
    protected int dinheiro;
    protected int vitalidade;
    protected int inteligencia;
    public boolean vivo;

    public int getForca() {
        return this.Forca;
    }

    public void setForca(int Forca) {
        this.Forca = Forca;
    }

    public int getVelocidade() {
        return this.Velocidade;
    }

    public void setVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public int getMana() {
        return this.Mana;
    }

    public void setMana(int Mana) {
        this.Mana = Mana;
    }

    public int getDinheiro() {
        return this.dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getVitalidade() {
        return this.vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getInteligencia() {
        return this.inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public boolean isVivo() {
        return this.vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
 
//-------------------------ATRIBUTOS-DA-ELFA-----------------------------------------------
    
    public int ForcaELFA = 200;
    protected int VelocidadeELFA = 100;
    protected int ManaELFA = 100;
    protected int dinheiroELFA = 1500;
    protected int vitalidadeELFA = 500;
    protected int inteligenciaELFA = 200;
    public boolean vivoELFA;

    public int getForcaELFA() {
        return Forca;
    }

    public void setForcaELFA(int Forca) {
        this.Forca = Forca;
    }

    public int getVelocidadeELFA() {
        return Velocidade;
    }

    public void setVelocidadeELFA(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public int getManaELFA() {
        return Mana;
    }

    public void setManaELFA(int Mana) {
        this.Mana = Mana;
    }

    public int getDinheiroELFA() {
        return dinheiro;
    }

    public void setDinheiroELFA(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getVitalidadeELFA() {
        return vitalidade;
    }

    public void setVitalidadeELFA(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getInteligenciaELFA() {
        return inteligencia;
    }

    public void setInteligenciaELFA(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public boolean isVivoELFA() {
        return vivo;
    }

    public void setVivoELFA(boolean vivo) {
        this.vivo = vivo;
    }
}
