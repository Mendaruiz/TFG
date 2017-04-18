/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import org.w3c.dom.Document;
import xml.Study;

/**
 *
 * @author David
 */
public class genalex implements herramienta{
    File fichero;
    File XML;
    
    public genalex(File fichero,File XML){
        this.fichero = fichero;
        this.XML = XML;
    }
    
    FileReader fr = null;
    BufferedReader br = null;
    public File XML() {
        File file = null;
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
        int numLoci = 0;
        //Creamos una lista con todos los Locus
        List<String> listaLocus = new ArrayList<String>();
        //Creamos un booleano para saber cuando tiene que insertar los individuals
        boolean afterPop = false;
        //Numero de individuals
        int numIndi = 0;        
        //Lista de individuals
        List<String> listaIndi = new ArrayList<String>();
        //Lista de listas con los individuals;
        List<List<String>> listalistaIndi = new ArrayList<List<String>>();
        //Recorrer la listalistaIndi
        int numlistIndi = 0;
        //Lista de los nombres de los individuales
        List<String> nombrIndis = new ArrayList<String>();
        //Lista de los numeros de individual de cada population
        List<Integer> listanumIndi = new ArrayList<Integer>();
        
        
        while ((linea = br.readLine()) != null){
            //Controlamos la primera linea en la que estan el numero de loci, el numero de populations y el numero de de populations
            if (lineas == 0){
                String cadena = linea;
                String delimitadores = "[ .,;?!¡¿\'\"\\[\\]]+";
                String[] numeros = cadena.split(delimitadores);
                for(int i = 3; i<numeros.length;i++){
                    //System.out.println(numeros[i]);
                    listanumIndi.add(new Integer(numeros[i]));
                }
                numLoci = Integer.parseInt(numeros[0]);
                numIndi = Integer.parseInt(numeros[1]);
                numeroPop = Integer.parseInt(numeros[2]);
                study.setNLoci(new BigInteger(String.valueOf(numLoci)));
                study.setNPopulations(new BigInteger(String.valueOf(numeroPop)));
                study.setNIndividuals(new BigInteger(String.valueOf(numIndi)));
                //System.out.println(listanumIndi);
            }
            
            //Ponemos el nombre del estudio y guardamos el nombre de los populations
            if (lineas == 1){
                String cadena = linea;
                String delimitadores = "[ .,;?!¡¿\'\"\\[\\]]+";
                String[] numeros = cadena.split(delimitadores);
                for(int i = 1; i<numeros.length;i++){
                    nombrIndis.add(numeros[i]);
                }
                study.setName(numeros[0]);
            }
            
            //Poner los loci en la lista para despues procesarlo 
            if(lineas == 2){
                String cadena = linea;
                String delimitadores = "[ ,;?!¡¿\'\"\\[\\]]+";
                String[] numeros = cadena.split(delimitadores);
                for (int i = 2 ; i < numeros.length ; i ++){
                    //System.out.println(numeros[i]);
                    if(numeros[i].contains("Locus")){
                        listaLocus.add(numeros[i]);
                    }
                }  
            }

            //Insertar en la lista todos los individuals
            for (int x = 0; x < nombrIndis.size(); x++){
                if(lineas != 1){
                    if(linea.contains(nombrIndis.get(x))){
                        listaIndi.add(linea);
                    }                
                } 
            }              
            lineas ++;
        }
        
        //Insertar locus
        Study.Loci loci = new Study.Loci();
        for(int i = 0; i < listaLocus.size(); i++){
            loci.getLocus().add(listaLocus.get(i));           
        }
        study.setLoci(loci);
        
        //System.out.println(listanumIndi);
        //System.out.println(listaIndi);
        //System.out.println(nombrIndis);
        
        //Incluimos en la lista de listas los individuals de cada population.
        for (int x = 0; x < nombrIndis.size(); x ++){
            //System.out.println(nombrIndis.get(x));
            listalistaIndi.add(new ArrayList<>());
            for (int i = 0; i < listaIndi.size(); i ++){
                //System.out.println(listaIndi.get(i));
                if (listaIndi.get(i).contains(nombrIndis.get(x))){
                    listalistaIndi.get(numlistIndi).add(listaIndi.get(i));
                }
            }
            numlistIndi ++;
        }
        
        //Procesamo la anterior lista para crear las populations
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
                    popu.setName(numeros[1]);
                    for(int x = 2; x < numeros.length ; x ++){
                        //Recorremos la lista para insertar el Locus de cada individual
                        if (numeros[x].equals("0")){
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
        file = new File("C:\\Users\\David\\Desktop\\TFG\\Pruebas\\Conversor\\Documentos\\salidaGenAlEX.xml");
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

        return file;
    }

    @Override
    public File XSL() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
