/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import transform.transformadorGeneland;

/**
 *
 * @author David
 */
public class selector {
    

    public File elegir (String origen, String salida, File archivo) throws FileNotFoundException{
        
        //Insertaremos todos los diferentes parsers hechos en la lista.
        List<Object> list = new ArrayList<>();
        list.add("arlequin");
        list.add("adegenet");
        File documentoXML = null;
        
        Document XML = null; //Guardamos en la variable XML el XML generado.
        File XSLT = null; 
        
        
        if(origen.equals("geneland")){
            transformadorGeneland tg = new transformadorGeneland();
            documentoXML = tg.convierte(archivo);
            //XML = ar.XMLarlequin(archivo); 
        }
        
        /*if(origen.equals("arlequin")){
            arlequin ar = new arlequin();
            XML = ar.XMLarlequin(archivo); 
        }*/
        
        /*if (salida.equals("adegenet")){
            adegenet ad = new adegenet();
            XSLT = ad.XSLTadegenet(XML);
        }*/
        
        if (salida.equals("genepop")){
            genepop gn = new genepop();
            XSLT = gn.XSLTgenepop(documentoXML);
        }
  
        return XSLT;
    }
    
}
