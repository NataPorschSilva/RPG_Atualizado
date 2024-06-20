
package com.mycompany.rpg;

import java.util.Random;

/**
 *
 * @author Natã
 */
public class Walkman extends Atributos{
    
    private boolean Fortalecimento;
    private boolean HPMAX;
    
    public void upgrade(){
        
    
    Random random = new Random();
    
               Boolean[] buffs = {Fortalecimento, HPMAX,}; 
               int randomBuff = random.nextInt(buffs.length);
               Boolean EscolherBuff = buffs[randomBuff];
               System.out.println("Você " + EscolherBuff);
               
    }  
        void Fortalecimento() {
        setForca((Fortalecimento) ? (Forca -= 100) : (Forca += 100));
        Fortalecimento = !Fortalecimento;
        }
        void HPMAX(){
            setVitalidade((HPMAX) ? (vitalidade -=200) : (vitalidade +=200));
        HPMAX =!HPMAX; 
        return;
        }
    
     }
    

