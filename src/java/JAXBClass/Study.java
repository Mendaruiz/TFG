//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.03.08 a las 07:57:51 PM CET 
//


package xml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="n_populations" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="n_individuals" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="n_loci" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="loci"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="populations"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="population" maxOccurs="unbounded"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                             &lt;element name="n_individuals" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                             &lt;element name="individuals"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="individual" maxOccurs="unbounded"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;sequence&gt;
 *                                                 &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                                 &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
 *                                                 &lt;element name="coordinates" minOccurs="0"&gt;
 *                                                   &lt;complexType&gt;
 *                                                     &lt;complexContent&gt;
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                                         &lt;sequence&gt;
 *                                                           &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                                           &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *                                                         &lt;/sequence&gt;
 *                                                       &lt;/restriction&gt;
 *                                                     &lt;/complexContent&gt;
 *                                                   &lt;/complexType&gt;
 *                                                 &lt;/element&gt;
 *                                                 &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                                               &lt;/sequence&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "nPopulations",
    "nIndividuals",
    "nLoci",
    "loci",
    "populations"
})
@XmlRootElement(name = "study")
public class Study {

    @XmlElement(required = true)
    protected String name;
    @XmlElement(name = "n_populations", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nPopulations;
    @XmlElement(name = "n_individuals", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nIndividuals;
    @XmlElement(name = "n_loci", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nLoci;
    @XmlElement(required = true)
    protected Study.Loci loci;
    @XmlElement(required = true)
    protected Study.Populations populations;

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad nPopulations.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNPopulations() {
        return nPopulations;
    }

    /**
     * Define el valor de la propiedad nPopulations.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNPopulations(BigInteger value) {
        this.nPopulations = value;
    }

    /**
     * Obtiene el valor de la propiedad nIndividuals.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNIndividuals() {
        return nIndividuals;
    }

    /**
     * Define el valor de la propiedad nIndividuals.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNIndividuals(BigInteger value) {
        this.nIndividuals = value;
    }

    /**
     * Obtiene el valor de la propiedad nLoci.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNLoci() {
        return nLoci;
    }

    /**
     * Define el valor de la propiedad nLoci.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNLoci(BigInteger value) {
        this.nLoci = value;
    }

    /**
     * Obtiene el valor de la propiedad loci.
     * 
     * @return
     *     possible object is
     *     {@link Study.Loci }
     *     
     */
    public Study.Loci getLoci() {
        return loci;
    }

    /**
     * Define el valor de la propiedad loci.
     * 
     * @param value
     *     allowed object is
     *     {@link Study.Loci }
     *     
     */
    public void setLoci(Study.Loci value) {
        this.loci = value;
    }

    /**
     * Obtiene el valor de la propiedad populations.
     * 
     * @return
     *     possible object is
     *     {@link Study.Populations }
     *     
     */
    public Study.Populations getPopulations() {
        return populations;
    }

    /**
     * Define el valor de la propiedad populations.
     * 
     * @param value
     *     allowed object is
     *     {@link Study.Populations }
     *     
     */
    public void setPopulations(Study.Populations value) {
        this.populations = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "locus"
    })
    public static class Loci {

        @XmlElement(required = true)
        protected List<String> locus;

        /**
         * Gets the value of the locus property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the locus property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocus().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getLocus() {
            if (locus == null) {
                locus = new ArrayList<String>();
            }
            return this.locus;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="population" maxOccurs="unbounded"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                   &lt;element name="n_individuals" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                   &lt;element name="individuals"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="individual" maxOccurs="unbounded"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;sequence&gt;
     *                                       &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                                       &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
     *                                       &lt;element name="coordinates" minOccurs="0"&gt;
     *                                         &lt;complexType&gt;
     *                                           &lt;complexContent&gt;
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                               &lt;sequence&gt;
     *                                                 &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                                                 &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
     *                                               &lt;/sequence&gt;
     *                                             &lt;/restriction&gt;
     *                                           &lt;/complexContent&gt;
     *                                         &lt;/complexType&gt;
     *                                       &lt;/element&gt;
     *                                       &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *                                     &lt;/sequence&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "population"
    })
    public static class Populations {

        @XmlElement(required = true)
        protected List<Study.Populations.Population> population;

        /**
         * Gets the value of the population property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the population property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPopulation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Study.Populations.Population }
         * 
         * 
         */
        public List<Study.Populations.Population> getPopulation() {
            if (population == null) {
                population = new ArrayList<Study.Populations.Population>();
            }
            return this.population;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *         &lt;element name="n_individuals" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *         &lt;element name="individuals"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="individual" maxOccurs="unbounded"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;sequence&gt;
         *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                             &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
         *                             &lt;element name="coordinates" minOccurs="0"&gt;
         *                               &lt;complexType&gt;
         *                                 &lt;complexContent&gt;
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                                     &lt;sequence&gt;
         *                                       &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                                       &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
         *                                     &lt;/sequence&gt;
         *                                   &lt;/restriction&gt;
         *                                 &lt;/complexContent&gt;
         *                               &lt;/complexType&gt;
         *                             &lt;/element&gt;
         *                             &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
         *                           &lt;/sequence&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "id",
            "nIndividuals",
            "individuals"
        })
        public static class Population {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(name = "ID", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger id;
            @XmlElement(name = "n_individuals", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger nIndividuals;
            @XmlElement(required = true)
            protected Study.Populations.Population.Individuals individuals;

            /**
             * Obtiene el valor de la propiedad name.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Define el valor de la propiedad name.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Obtiene el valor de la propiedad id.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getID() {
                return id;
            }

            /**
             * Define el valor de la propiedad id.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setID(BigInteger value) {
                this.id = value;
            }

            /**
             * Obtiene el valor de la propiedad nIndividuals.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNIndividuals() {
                return nIndividuals;
            }

            /**
             * Define el valor de la propiedad nIndividuals.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNIndividuals(BigInteger value) {
                this.nIndividuals = value;
            }

            /**
             * Obtiene el valor de la propiedad individuals.
             * 
             * @return
             *     possible object is
             *     {@link Study.Populations.Population.Individuals }
             *     
             */
            public Study.Populations.Population.Individuals getIndividuals() {
                return individuals;
            }

            /**
             * Define el valor de la propiedad individuals.
             * 
             * @param value
             *     allowed object is
             *     {@link Study.Populations.Population.Individuals }
             *     
             */
            public void setIndividuals(Study.Populations.Population.Individuals value) {
                this.individuals = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="individual" maxOccurs="unbounded"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;sequence&gt;
             *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *                   &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
             *                   &lt;element name="coordinates" minOccurs="0"&gt;
             *                     &lt;complexType&gt;
             *                       &lt;complexContent&gt;
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                           &lt;sequence&gt;
             *                             &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *                             &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
             *                           &lt;/sequence&gt;
             *                         &lt;/restriction&gt;
             *                       &lt;/complexContent&gt;
             *                     &lt;/complexType&gt;
             *                   &lt;/element&gt;
             *                   &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
             *                 &lt;/sequence&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "individual"
            })
            public static class Individuals {

                @XmlElement(required = true)
                protected List<Study.Populations.Population.Individuals.Individual> individual;

                /**
                 * Gets the value of the individual property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the individual property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getIndividual().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Study.Populations.Population.Individuals.Individual }
                 * 
                 * 
                 */
                public List<Study.Populations.Population.Individuals.Individual> getIndividual() {
                    if (individual == null) {
                        individual = new ArrayList<Study.Populations.Population.Individuals.Individual>();
                    }
                    return this.individual;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;sequence&gt;
                 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
                 *         &lt;element name="locus" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded"/&gt;
                 *         &lt;element name="coordinates" minOccurs="0"&gt;
                 *           &lt;complexType&gt;
                 *             &lt;complexContent&gt;
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *                 &lt;sequence&gt;
                 *                   &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                 *                   &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                 *                 &lt;/sequence&gt;
                 *               &lt;/restriction&gt;
                 *             &lt;/complexContent&gt;
                 *           &lt;/complexType&gt;
                 *         &lt;/element&gt;
                 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
                 *       &lt;/sequence&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "name",
                    "locus",
                    "coordinates",
                    "id"
                })
                public static class Individual {

                    @XmlElement(required = true)
                    protected String name;
                    @XmlElement(type = Boolean.class)
                    protected List<Boolean> locus;
                    protected Study.Populations.Population.Individuals.Individual.Coordinates coordinates;
                    @XmlElement(name = "ID", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger id;

                    /**
                     * Obtiene el valor de la propiedad name.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * Define el valor de la propiedad name.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                    /**
                     * Gets the value of the locus property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the locus property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getLocus().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link Boolean }
                     * 
                     * 
                     */
                    public List<Boolean> getLocus() {
                        if (locus == null) {
                            locus = new ArrayList<Boolean>();
                        }
                        return this.locus;
                    }

                    /**
                     * Obtiene el valor de la propiedad coordinates.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Study.Populations.Population.Individuals.Individual.Coordinates }
                     *     
                     */
                    public Study.Populations.Population.Individuals.Individual.Coordinates getCoordinates() {
                        return coordinates;
                    }

                    /**
                     * Define el valor de la propiedad coordinates.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Study.Populations.Population.Individuals.Individual.Coordinates }
                     *     
                     */
                    public void setCoordinates(Study.Populations.Population.Individuals.Individual.Coordinates value) {
                        this.coordinates = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad id.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getID() {
                        return id;
                    }

                    /**
                     * Define el valor de la propiedad id.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setID(BigInteger value) {
                        this.id = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType&gt;
                     *   &lt;complexContent&gt;
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                     *       &lt;sequence&gt;
                     *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                     *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
                     *       &lt;/sequence&gt;
                     *     &lt;/restriction&gt;
                     *   &lt;/complexContent&gt;
                     * &lt;/complexType&gt;
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "longitude",
                        "latitude"
                    })
                    public static class Coordinates {

                        protected float longitude;
                        protected float latitude;

                        /**
                         * Obtiene el valor de la propiedad longitude.
                         * 
                         */
                        public float getLongitude() {
                            return longitude;
                        }

                        /**
                         * Define el valor de la propiedad longitude.
                         * 
                         */
                        public void setLongitude(float value) {
                            this.longitude = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad latitude.
                         * 
                         */
                        public float getLatitude() {
                            return latitude;
                        }

                        /**
                         * Define el valor de la propiedad latitude.
                         * 
                         */
                        public void setLatitude(float value) {
                            this.latitude = value;
                        }

                    }

                }

            }

        }

    }

}
