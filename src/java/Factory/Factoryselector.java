/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class Factoryselector {
    
    
    public static herramienta getHerramientaEntrada(String entrada, File fichero){
        
        if(entrada.equals("genalex")){
            return new genalex(fichero,null);
        } 
        else if (entrada.equals("geneland")){
            return new geneland(fichero,null);
        }
        else if(entrada.equals("genepop")){
            return new genepop(fichero, null);
        }
        return null;
    }
    
    public static herramienta getHerramientaSalida(String salida, File fichero){

        if(salida.equals("geneland")){
            return new geneland(null,fichero);
        }
        return null;
    }
}
