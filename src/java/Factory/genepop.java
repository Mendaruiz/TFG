/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import xml.Study;

/**
 *
 * @author David
 */
public class genepop implements herramienta{
     File fichero;
    File XML;
    
    public genepop(File fichero,File XML){
        this.fichero = fichero;
        this.XML = XML;
    }
    
    FileReader fr = null;
    BufferedReader br = null;
    @Override
    public File XML() {
        try{
        //abrimos el archivo que deseamos leer
        //fichero = new File ("C:\\Users\\David\\Desktop\\TFG\\Pruebas\\Conversor\\Documentos\\Test_geneland_data");
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
        //Crear el study
        Study study = new Study();
        String linea;
        //Numero de lineas que tiene el fichero
        int lineas = 0;
        //El numero dePopulations que tiene.
        int numeroPop = 0;
        //El numero de locus
        int numLocus = 0;
        //Creamos una lista con todos los Locus
        List<String> listaLocus = new ArrayList<String>();
        //Creamos un booleano para saber cuando tiene que insertar los individuals
        boolean afterPop = false;
        //Numero de individuals
        int numIndi = 0;        
        //Lista de listas con los individuals;
        List<List<String>> listalistaIndi = new ArrayList<List<String>>();
        //Recorrer la listalistaIndi
        int numlistIndi = -1;

        
        while ((linea = br.readLine()) != null){
            //Crear individual
            Study.Populations.Population.Individuals.Individual indi = new Study.Populations.Population.Individuals.Individual();
            
            //Ponemos el nombre del estudio
            if(lineas == 0){
                study.setName(linea);
            }
            
            //Ponemos el numero de Populations
            if(linea.contains("Pop")){
                numeroPop ++;
                study.setNPopulations(new BigInteger(String.valueOf(numeroPop)));
                afterPop = true;
            }
            
            //Ponemos el numero de infividuals
            if(afterPop == true){
                if(linea.contains("Pop")){
                    listalistaIndi.add(new ArrayList<>());
                    numlistIndi ++;                    
                } else{
                    numIndi ++;
                    study.setNIndividuals(new BigInteger(String.valueOf(numIndi)));
                    listalistaIndi.get(numlistIndi).add(linea);
                }
            }
            
            //Ponemos el numero de Locus
            if(linea.contains("Locus")){
                numLocus ++;
                study.setNLoci(new BigInteger(String.valueOf(numLocus)));
                listaLocus.add(linea);
            }          
            lineas ++;
        }
        
        //Insertar locus
        Study.Loci loci = new Study.Loci();
        for(int i = 0; i < listaLocus.size(); i++){
            loci.getLocus().add(listaLocus.get(i));           
        }
        study.setLoci(loci);

        //Insertar populations
        //Crear populations
        Study.Populations populations = new Study.Populations();
        //Id population
        int popuID = 0;
        //Id de cada individual
        int indiID = 0;
                   
        for (int i = 0; i < listalistaIndi.size() ;i++){
                //Crear population
                Study.Populations.Population popu = new Study.Populations.Population();
                //Crear individuals
                Study.Populations.Population.Individuals individuals = new Study.Populations.Population.Individuals();
                
                //Poner el ID en el population
                popuID ++;
                popu.setID(new BigInteger(String.valueOf(popuID)));
                
                //Creamos una lista con cada una de las listas de individuals.
                List<String> listaindi = listalistaIndi.get(i);
                //Inicializamos el numerode individuales de cada population
                int numeIndi = listaindi.size();
                //Asignar valor al campo numero de individual que hay dentro de population.
                popu.setNIndividuals(new BigInteger(String.valueOf(numeIndi)));
                
                for (int y = 0; y < listaindi.size(); y ++){
                    //Crear individual
                    Study.Populations.Population.Individuals.Individual individual = new Study.Populations.Population.Individuals.Individual();
                    //Hacer de la linea que contiene el individual una lista con los numeros del individual
                    String cadena = listaindi.get(y);
                    String delimitadores = "[ .,;?!¡¿\'\"\\[\\]]+";
                    String[] numeros = cadena.split(delimitadores);
                    //Incrementamos uno cada vez que entre en un individual para despues asignarselo al ID
                    indiID ++;
                    
                    for(int x = 1; x < numeros.length ; x ++){
                        //Recorremos la lista para insertar el Locus de cada individual
                        if (numeros[x].equals("2")){
                            individual.getLocus().add(Boolean.FALSE);
                        }
                        else{
                            individual.getLocus().add(Boolean.TRUE);
                        }
                        //Asignar valor al ID de cada individual
                        individual.setID(new BigInteger(String.valueOf(indiID)));
                        //Asignar valor al nombre de cada individual
                        individual.setName(numeros[0]);
                    }
                    //Incluimos en cada lista de individuals el individual
                    individuals.getIndividual().add(individual);   
                }
                //Añadimos a cada population el individuals
                popu.setIndividuals(individuals);
                //Añadimos a cada populations el population que le corresponde
                populations.getPopulation().add(popu);
                //Añadimos al estudio el populations
                study.setPopulations(populations);

        }

        //fichero de salida
        File file = new File("C:\\Users\\David\\Desktop\\TFG\\Pruebas\\Conversor\\Documentos\\salidaGenepop.xml");
        //Proceso para crear el xml
        JAXBContext jaxbContext = JAXBContext.newInstance(Study.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        //Salida para el fichero
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(study, file);
        //jaxbMarshaller.marshal(study, System.out);
 
        }
        catch(Exception e){
            e.printStackTrace();
        }
        //utilizamos el finally para cerrar el fichero
        finally{
            try{
                if(null != fr){
                    fr.close();
                }
            }
            catch (Exception e2){
                e2.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public File XSL() {
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
