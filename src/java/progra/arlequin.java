/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

/**
 *
 * @author David
 */
public class arlequin {

    
    public Document XMLarlequin(File fichero){
        //El proceso es convertir el fichero plano de la herramienta a un fichero XML con la estructura del XML schema.
        Document xml = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        
        try{
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            xml = implementation.createDocument(null, "xml", null);

            //Creación de elementos
            //creamos el elemento principal casa
            Element casa = xml.createElement("Casa"); 
            //creamos un nuevo elemento. Casa contiene habitaciones
            Element habitacion= xml.createElement("Habitacion");
            //creamos un nuevo elemento. Habitación tiene color
            Element color = xml.createElement("Color"); 
            //Ingresamos la info. El color de esta habitación es azul
            Text valorColor = xml.createTextNode("Azul"); 

            //Asignamos la versión de nuestro XML
            xml.setXmlVersion("1.0"); 
            //Añadimos la casa al documento
            xml.getDocumentElement().appendChild(casa); 
            //Añadimos el elemento hijo a la raíz
            casa.appendChild(habitacion); 
            //Añadimos elemento
            habitacion.appendChild(color); 
            //Añadimos valor
            color.appendChild(valorColor); 
         }catch(Exception e){
             System.err.println("Error");
         }
        
        
        return xml;
        
    }

    public File XSLTarlequin(Document XML) {
        //El proceso es aplicarle al fichero XML la hoja de estilo XSLTS correspondiente para generar un fichero plano de esta herramienta.
        
        return null;
    }
}
