
package com.mycompany.rpg;

import java.util.Random;

/**
 * @author Natã
 */
public class Walkman extends VedaPerson {

    private boolean Fortalecimento;
    private boolean HPMAX;

   private void WalUpgrade() {

        Random random = new Random();

        Boolean[] buffs = {Fortalecimento, HPMAX,};
        int randomBuff = random.nextInt(buffs.length);
        Boolean EscolherBuff = buffs[randomBuff];
        System.out.println("Você conseguiu: " + EscolherBuff);
    }
   
   /*Random random = new Random();
    
    Boolean[] buffs = {Fortalecimento, HPMAX,};
    int randomBuff = random.nextInt(buffs.length);
    Boolean EscolherBuff = buffs[randomBuff];
    
    public void resultado(){
    System.out.println("Você conseguiu: " + EscolherBuff);
    }*/

   
    public void Fortalecimento() {
        setForca((Fortalecimento) ? (Forca -= 100) : (Forca += 100));
        Fortalecimento = !Fortalecimento;
    }

    public void HPMAX() {
        setVitalidade((HPMAX) ? (vitalidade -= 200) : (vitalidade += 200));
        HPMAX = !HPMAX;
        //return;
    }

}
