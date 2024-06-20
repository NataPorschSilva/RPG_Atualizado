
package com.mycompany.rpg;

/**
 *
 * @author Natã
 * //mortos vivos ja estão mortos, faça algum metodo para acabar com eles de forma diferente.
 */
public class Atributos extends RPG{
    protected int Forca;
    protected int Velocidade;
    protected int Mana;
    protected int dinheiro;
    protected int vitalidade;
    protected int inteligencia;
    public boolean vivo; 
    
    public int getForca() {
        return Forca;
    }

    public void setForca(int Forca) {
        this.Forca = Forca;
    }

    public int getVelocidade() {
        return Velocidade;
    }

    public void setVelocidade(int Velocidade) {
        this.Velocidade = Velocidade;
    }

    public int getMana() {
        return Mana;
    }

    public void setMana(int Mana) {
        this.Mana = Mana;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getVitalidade() {
        return vitalidade;
    }

    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

   
}
    
    
    
    
    
   