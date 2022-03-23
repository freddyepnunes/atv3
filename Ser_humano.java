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
public class Ser_humano {
    
    
  public static void main(String[] args) {
   Corpo_humano c1 = new Corpo_humano(60,90,1.6);
      System.out.println(c1.GetImc());
 }
   
        //deu erro por causa que o atributo massa é privado

        //alteracao para public o erro foi corrigido

        //setvolume não pode ser acessado 

