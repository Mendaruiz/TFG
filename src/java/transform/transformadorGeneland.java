/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transform;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.math.BigInteger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import xml.Study;

/**
 *
 * @author David
 */
public class transformadorGeneland extends transformador{
    FileReader fr = null;
    BufferedReader br = null;
    
    @Override
    public File convierte(File fichero) {
        //Inicializo la variabel para devolverla
        File file = null;
                 
        try{
        //abrimos el archivo que deseamos leer
        //fichero = new File ("C:\\Users\\David\\Desktop\\TFG\\Pruebas\\Conversor\\Documentos\\Test_geneland_data");
        fr = new FileReader(fichero);
        br = new BufferedReader(fr);
        //Crear el study
        Study study = new Study();
        String linea;
        int lineas = 0;
        
        //Crear individuals
        Study.Populations.Population.Individuals individuals = new Study.Populations.Population.Individuals();
        //Crear population
        Study.Populations.Population popu = new Study.Populations.Population();

        while ((linea = br.readLine()) != null){
  
            //Crear populations
            Study.Populations populations = new Study.Populations();
            //Crear individual
            Study.Populations.Population.Individuals.Individual indi = new Study.Populations.Population.Individuals.Individual();
            
            System.out.println(lineas);
            lineas ++;
            //Cada linea la convierte en una cadena de numeros
            System.out.println(linea);
            String cadena = linea;
            String delimitadores = "[ .,;?!¡¿\'\"\\[\\]]+";
            String[] numeros = cadena.split(delimitadores);
            
            //Esta información no la da el Geneland
            //Ponemos el nombre del estudio, el n_populations, n_individuals y el n_loci
            /*
            study.setName("prueba");
            study.setNPopulations(BigInteger.ONE);
            study.setNIndividuals(BigInteger.ONE);
            study.setNLoci(BigInteger.ONE);
            
            Study.Loci loci = new Study.Loci();
            loci.getLocus().add("");
            study.setLoci(loci);
            popu.setName("");
            popu.setID(BigInteger.ONE);
            popu.setNIndividuals(BigInteger.ONE);*/

            for (int i = 0; i< numeros.length; i++){
                
                BigInteger bi = new BigInteger(String.valueOf(lineas));
                popu.setNIndividuals(bi);
                if (numeros[i].equals("0")){
                    indi.getLocus().add(Boolean.FALSE);
                    //System.out.println("entra 0");
                    
                }
                else{
                    indi.getLocus().add(Boolean.TRUE);
                    //System.out.println("entra 1");
                }            
            }
            System.out.println("Despues" + indi.getLocus());
            
            individuals.getIndividual().add(indi);
            populations.getPopulation().add(popu);
            popu.setIndividuals(individuals);
            study.setPopulations(populations);   
        }
        //fichero de salida
        file = new File("C:\\Users\\David\\Desktop\\TFG\\Pruebas\\Conversor\\Documentos\\salidaGeneland.xml");
        //Proceso para crear el xml
        JAXBContext jaxbContext = JAXBContext.newInstance(Study.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(study, file);
        jaxbMarshaller.marshal(study, System.out);

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
    
}
