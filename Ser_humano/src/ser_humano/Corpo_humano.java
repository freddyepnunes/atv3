/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ser_humano;

/**
 *
 * @author alunocmc
 */

public class Corpo_humano {
    private float massa;
        private float densidade;
        private float volume;
  
    
     
        public Corpo_humano(float massa, float volume)
        {
            this.massa = massa;
            this.volume = volume; 
            densidade = massa/volume;
        }
            
            public float Getmassa()
            {return massa;
            }
            public float Getvolume()
            {return volume;
            }
            public float Getdensidade()
            {return densidade;
            }
            public void setmassa(float massa)
            {
                this.massa = massa;
                densidade = massa / volume;
            }
            public void setvolume(float volume)
            {this.volume = volume;
            densidade = massa / volume;
            }
        }        

