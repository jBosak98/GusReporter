//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.04.20 at 02:29:57 PM CEST
//

package jbosak.gus.reporter.gusReporter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dane">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Regon" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="RegonLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Nazwa" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Wojewodztwo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Powiat" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Gmina" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Miejscowosc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="KodPocztowy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SilosID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dane"
})
@XmlRootElement(name = "root")
public class CompanyData {

    @XmlElement(required = true)
    protected Company dane;

    /**
     * Gets the value of the dane property.
     *
     * @return
     *     possible object is
     *     {@link Company }
     *
     */
    public Company getDane() {
        return dane;
    }

    /**
     * Sets the value of the dane property.
     *
     * @param value
     *     allowed object is
     *     {@link Company }
     *
     */
    public void setDane(Company value) {
        this.dane = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Regon" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="RegonLink" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Nazwa" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Wojewodztwo" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Powiat" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Gmina" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Miejscowosc" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="KodPocztowy" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Typ" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SilosID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "regon",
            "regonLink",
            "nazwa",
            "wojewodztwo",
            "powiat",
            "gmina",
            "miejscowosc",
            "kodPocztowy",
            "typ",
            "silosID"
    })
    public static class Company {

        @XmlElement(name = "Regon")
        protected int regon;
        @XmlElement(name = "RegonLink", required = true)
        protected String regonLink;
        @XmlElement(name = "Nazwa", required = true)
        protected String nazwa;
        @XmlElement(name = "Wojewodztwo", required = true)
        protected String wojewodztwo;
        @XmlElement(name = "Powiat", required = true)
        protected String powiat;
        @XmlElement(name = "Gmina", required = true)
        protected String gmina;
        @XmlElement(name = "Miejscowosc", required = true)
        protected String miejscowosc;
        @XmlElement(name = "KodPocztowy", required = true)
        protected String kodPocztowy;
        @XmlElement(name = "Typ", required = true)
        protected String typ;
        @XmlElement(name = "SilosID")
        protected byte silosID;

        /**
         * Gets the value of the regon property.
         *
         */
        public int getRegon() {
            return regon;
        }

        /**
         * Sets the value of the regon property.
         *
         */
        public void setRegon(int value) {
            this.regon = value;
        }

        /**
         * Gets the value of the regonLink property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRegonLink() {
            return regonLink;
        }

        /**
         * Sets the value of the regonLink property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRegonLink(String value) {
            this.regonLink = value;
        }

        /**
         * Gets the value of the nazwa property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNazwa() {
            return nazwa;
        }

        /**
         * Sets the value of the nazwa property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNazwa(String value) {
            this.nazwa = value;
        }

        /**
         * Gets the value of the wojewodztwo property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getWojewodztwo() {
            return wojewodztwo;
        }

        /**
         * Sets the value of the wojewodztwo property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setWojewodztwo(String value) {
            this.wojewodztwo = value;
        }

        /**
         * Gets the value of the powiat property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPowiat() {
            return powiat;
        }

        /**
         * Sets the value of the powiat property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPowiat(String value) {
            this.powiat = value;
        }

        /**
         * Gets the value of the gmina property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getGmina() {
            return gmina;
        }

        /**
         * Sets the value of the gmina property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setGmina(String value) {
            this.gmina = value;
        }

        /**
         * Gets the value of the miejscowosc property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMiejscowosc() {
            return miejscowosc;
        }

        /**
         * Sets the value of the miejscowosc property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMiejscowosc(String value) {
            this.miejscowosc = value;
        }

        /**
         * Gets the value of the kodPocztowy property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getKodPocztowy() {
            return kodPocztowy;
        }

        /**
         * Sets the value of the kodPocztowy property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setKodPocztowy(String value) {
            this.kodPocztowy = value;
        }

        /**
         * Gets the value of the typ property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getTyp() {
            return typ;
        }

        /**
         * Sets the value of the typ property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setTyp(String value) {
            this.typ = value;
        }

        /**
         * Gets the value of the silosID property.
         *
         */
        public byte getSilosID() {
            return silosID;
        }

        /**
         * Sets the value of the silosID property.
         *
         */
        public void setSilosID(byte value) {
            this.silosID = value;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "regon=" + regon +
                    ", regonLink='" + regonLink + '\'' +
                    ", nazwa='" + nazwa + '\'' +
                    ", wojewodztwo='" + wojewodztwo + '\'' +
                    ", powiat='" + powiat + '\'' +
                    ", gmina='" + gmina + '\'' +
                    ", miejscowosc='" + miejscowosc + '\'' +
                    ", kodPocztowy='" + kodPocztowy + '\'' +
                    ", typ='" + typ + '\'' +
                    ", silosID=" + silosID +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "CompanyData{" +
                "dane=" + dane +
                '}';
    }
}
