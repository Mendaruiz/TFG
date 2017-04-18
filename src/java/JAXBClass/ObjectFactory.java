//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.03.08 a las 07:57:51 PM CET 
//


package xml;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the paquete package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: paquete
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Study }
     * 
     * @return 
     */
    public Study createStudy() {
        return new Study();
    }

    /**
     * Create an instance of {@link Study.Populations }
     * 
     * @return 
     */
    public Study.Populations createStudyPopulations() {
        return new Study.Populations();
    }

    /**
     * Create an instance of {@link Study.Populations.Population }
     * 
     * @return 
     */
    public Study.Populations.Population createStudyPopulationsPopulation() {
        return new Study.Populations.Population();
    }

    /**
     * Create an instance of {@link Study.Populations.Population.Individuals }
     * 
     * @return 
     */
    public Study.Populations.Population.Individuals createStudyPopulationsPopulationIndividuals() {
        return new Study.Populations.Population.Individuals();
    }

    /**
     * Create an instance of {@link Study.Populations.Population.Individuals.Individual }
     * 
     * @return 
     */
    public Study.Populations.Population.Individuals.Individual createStudyPopulationsPopulationIndividualsIndividual() {
        return new Study.Populations.Population.Individuals.Individual();
    }

    /**
     * Create an instance of {@link Study.Loci }
     * 
     * @return 
     */
    public Study.Loci createStudyLoci() {
        return new Study.Loci();
    }

    /**
     * Create an instance of {@link Study.Populations.Population.Individuals.Individual.Coordinates }
     * 
     * @return 
     */
    public Study.Populations.Population.Individuals.Individual.Coordinates createStudyPopulationsPopulationIndividualsIndividualCoordinates() {
        return new Study.Populations.Population.Individuals.Individual.Coordinates();
    }

}
