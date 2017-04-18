/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import org.w3c.dom.Document;

/**
 *
 * @author David
 */
public class genepop {
    public File XSLTgenepop(File XML) throws FileNotFoundException {
        TransformerFactory factory;
        factory = TransformerFactory.newInstance();
        BufferedWriter bw;
        File archivo = null;
        
        //Inicialización del documento de xslt
        
        //Source xsl = new StreamSource("C:\\Users\\David\\Desktop\\TFG\\PopXML\\PopXML\\XSLTs\\adegenet.xsl");
        try {
            //Aplicacion de la hoja de estilo.
            Transformer transformer = factory.newTransformer(new StreamSource("C:\\Users\\David\\Desktop\\TFG\\PopXML\\PopXML\\XSLTs\\genepop.xsl"));
            //Ruta en la cual se va a guardar.
            String ruta = "C:\\Users\\David\\Downloads\\descarga.txt";
            archivo = new File(ruta);
            bw = new BufferedWriter(new FileWriter(ruta));
            //Aplicar la hoja de estilo al fichero XML.
            transformer.transform(new StreamSource(XML), new StreamResult(new FileOutputStream(archivo)));
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        return archivo;
    }
}
