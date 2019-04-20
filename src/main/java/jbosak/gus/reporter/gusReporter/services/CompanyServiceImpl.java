package jbosak.gus.reporter.gusReporter.services;

import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;
import jbosak.gus.reporter.gusReporter.model.CompanyData;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.xml.transform.StringSource;
import org.tempuri.IUslugaBIRzewnPubl;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Service
public class CompanyService {

    SoapService soapService;

    public CompanyService(SoapService soapService) {
        this.soapService = soapService;
    }

    public CompanyData.Company getCompanyData(String nip){
        IUslugaBIRzewnPubl service = soapService.getGusService();
        ParametryWyszukiwania regonA = new ParametryWyszukiwania();
        regonA.setNip(new JAXBElement<>(new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Nip"),String.class, nip));
        Jaxb2Marshaller unmarshaller = (Jaxb2Marshaller) soapService.getUnmarshaller();
        CompanyData c = (CompanyData) unmarshaller.unmarshal( new StringSource(service.daneSzukaj(regonA)));
        System.out.println(c);
        return c.dane;
    }
}
