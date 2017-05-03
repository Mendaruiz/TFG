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
    
    
    public static Herramienta getHerramientaEntrada(String entrada, File fichero){
        
        if(entrada.equals("genalex")){
            return new Genalex(fichero,null);
        } 
        else if (entrada.equals("geneland")){
            return new Geneland(fichero,null);
        }
        else if(entrada.equals("genepop")){
            return new Genepop(fichero, null);
        }
        return null;
    }
    
    public static Herramienta getHerramientaSalida(String salida, File fichero){

        if(salida.equals("genalex")){
            return new Genalex(null,fichero);
        } 
        else if (salida.equals("geneland")){
            return new Geneland(null,fichero);
        }
        else if(salida.equals("genepop")){
            return new Genepop(null, fichero);
        }
        return null;
    }
}
