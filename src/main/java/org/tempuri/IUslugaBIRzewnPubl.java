
package org.tempuri;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IUslugaBIRzewnPubl", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
@XmlSeeAlso({
    cis.bir._2014._07.ObjectFactory.class,
    cis.bir.publ._2014._07.ObjectFactory.class,
    cis.bir.publ._2014._07.datacontract.ObjectFactory.class,
    com.microsoft.schemas._2003._10.serialization.ObjectFactory.class
})
public interface IUslugaBIRzewnPubl {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "PobierzCaptcha", action = "http://CIS/BIR/2014/07/IUslugaBIR/PobierzCaptcha")
    @WebResult(name = "PobierzCaptchaResult", targetNamespace = "http://CIS/BIR/2014/07")
    @RequestWrapper(localName = "PobierzCaptcha", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.PobierzCaptcha")
    @ResponseWrapper(localName = "PobierzCaptchaResponse", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.PobierzCaptchaResponse")
    public String pobierzCaptcha();

    /**
     * 
     * @param pCaptcha
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "SprawdzCaptcha", action = "http://CIS/BIR/2014/07/IUslugaBIR/SprawdzCaptcha")
    @WebResult(name = "SprawdzCaptchaResult", targetNamespace = "http://CIS/BIR/2014/07")
    @RequestWrapper(localName = "SprawdzCaptcha", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.SprawdzCaptcha")
    @ResponseWrapper(localName = "SprawdzCaptchaResponse", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.SprawdzCaptchaResponse")
    public Boolean sprawdzCaptcha(
        @WebParam(name = "pCaptcha", targetNamespace = "http://CIS/BIR/2014/07")
        String pCaptcha);

    /**
     * 
     * @param pNazwaParametru
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetValue", action = "http://CIS/BIR/2014/07/IUslugaBIR/GetValue")
    @WebResult(name = "GetValueResult", targetNamespace = "http://CIS/BIR/2014/07")
    @RequestWrapper(localName = "GetValue", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.GetValue")
    @ResponseWrapper(localName = "GetValueResponse", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.GetValueResponse")
    public String getValue(
        @WebParam(name = "pNazwaParametru", targetNamespace = "http://CIS/BIR/2014/07")
        String pNazwaParametru);

    /**
     * 
     * @param pWartoscParametru
     * @param pNazwaParametru
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "SetValue", action = "http://CIS/BIR/2014/07/IUslugaBIR/SetValue")
    @WebResult(name = "SetValueResult", targetNamespace = "http://CIS/BIR/2014/07")
    @RequestWrapper(localName = "SetValue", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.SetValue")
    @ResponseWrapper(localName = "SetValueResponse", targetNamespace = "http://CIS/BIR/2014/07", className = "cis.bir._2014._07.SetValueResponse")
    public String setValue(
        @WebParam(name = "pNazwaParametru", targetNamespace = "http://CIS/BIR/2014/07")
        String pNazwaParametru,
        @WebParam(name = "pWartoscParametru", targetNamespace = "http://CIS/BIR/2014/07")
        String pWartoscParametru);

    /**
     * 
     * @param pKluczUzytkownika
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "Zaloguj", action = "http://CIS/BIR/PUBL/2014/07/IUslugaBIRzewnPubl/Zaloguj")
    @WebResult(name = "ZalogujResult", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
    @RequestWrapper(localName = "Zaloguj", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.Zaloguj")
    @ResponseWrapper(localName = "ZalogujResponse", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.ZalogujResponse")
    public String zaloguj(
        @WebParam(name = "pKluczUzytkownika", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
        String pKluczUzytkownika);

    /**
     * 
     * @param pIdentyfikatorSesji
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod(operationName = "Wyloguj", action = "http://CIS/BIR/PUBL/2014/07/IUslugaBIRzewnPubl/Wyloguj")
    @WebResult(name = "WylogujResult", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
    @RequestWrapper(localName = "Wyloguj", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.Wyloguj")
    @ResponseWrapper(localName = "WylogujResponse", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.WylogujResponse")
    public Boolean wyloguj(
        @WebParam(name = "pIdentyfikatorSesji", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
        String pIdentyfikatorSesji);

    /**
     * 
     * @param pParametryWyszukiwania
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DaneSzukaj", action = "http://CIS/BIR/PUBL/2014/07/IUslugaBIRzewnPubl/DaneSzukaj")
    @WebResult(name = "DaneSzukajResult", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
    @RequestWrapper(localName = "DaneSzukaj", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.DaneSzukaj")
    @ResponseWrapper(localName = "DaneSzukajResponse", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.DaneSzukajResponse")
    public String daneSzukaj(
        @WebParam(name = "pParametryWyszukiwania", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
        ParametryWyszukiwania pParametryWyszukiwania);

    /**
     * 
     * @param pRegon
     * @param pNazwaRaportu
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DanePobierzPelnyRaport", action = "http://CIS/BIR/PUBL/2014/07/IUslugaBIRzewnPubl/DanePobierzPelnyRaport")
    @WebResult(name = "DanePobierzPelnyRaportResult", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
    @RequestWrapper(localName = "DanePobierzPelnyRaport", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.DanePobierzPelnyRaport")
    @ResponseWrapper(localName = "DanePobierzPelnyRaportResponse", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.DanePobierzPelnyRaportResponse")
    public String danePobierzPelnyRaport(
        @WebParam(name = "pRegon", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
        String pRegon,
        @WebParam(name = "pNazwaRaportu", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
        String pNazwaRaportu);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DaneKomunikat", action = "http://CIS/BIR/PUBL/2014/07/IUslugaBIRzewnPubl/DaneKomunikat")
    @WebResult(name = "DaneKomunikatResult", targetNamespace = "http://CIS/BIR/PUBL/2014/07")
    @RequestWrapper(localName = "DaneKomunikat", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.DaneKomunikat")
    @ResponseWrapper(localName = "DaneKomunikatResponse", targetNamespace = "http://CIS/BIR/PUBL/2014/07", className = "cis.bir.publ._2014._07.DaneKomunikatResponse")
    public String daneKomunikat();

}
