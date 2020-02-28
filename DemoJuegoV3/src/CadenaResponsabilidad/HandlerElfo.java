/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaResponsabilidad;

import Graficos.Sprite;
import Strategy.EstrategiaAdelanteElfo;


/**
 *
 * @author USUARIO
 */
public class HandlerElfo extends Handler {

    @Override
    public void moverAdelante(int opt, Sprite s) {
        if(opt == 1){
            super.e = new EstrategiaAdelanteElfo();
            e.teclaPresionada(s);
        }else {
            System.out.println("Operacion enviada al sucesor");
            sucesor.moverAdelante(opt, s);
        }       
    }
    
}
