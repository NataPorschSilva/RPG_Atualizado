
package com.mycompany.rpg;

/**
 *
 * @author Natã
 */
public class Atributos {
    protected int Força = 0;
    protected int Velocidade = 0;
    protected int Mana = 0;
    protected int dinheiro = 0;
    public boolean vivo;

    public int getForça() {
        return Força;
    }

    public void setForça(int Força) {
        this.Força = Força;
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

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    @Override
    public String toString() {
        return "Atributos{" + "For\u00e7a=" + Força + ", Velocidade=" + Velocidade + ", Mana=" + Mana + ", dinheiro=" + dinheiro + ", vivo=" + vivo + '}';
    }
    
   

   
}
