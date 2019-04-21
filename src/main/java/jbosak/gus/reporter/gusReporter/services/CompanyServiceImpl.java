package jbosak.gus.reporter.gusReporter.services;

import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;
import jbosak.gus.reporter.gusReporter.model.CompanyData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.xml.transform.StringSource;
import org.tempuri.IUslugaBIRzewnPubl;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

@Service
public class CompanyServiceImpl implements CompanyService {

    SoapService soapService;


    @Autowired
    public CompanyServiceImpl(SoapService soapService) {
        this.soapService = soapService;
    }

    @Override
    public CompanyData.Company getCompany(String nip)
    {
        IUslugaBIRzewnPubl service = soapService.getGusService();
        ParametryWyszukiwania regonA = new ParametryWyszukiwania();
        regonA.setNip(new JAXBElement<>(new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Nip"),String.class, nip));

        String xmlResponse = service.daneSzukaj(regonA);
        if (xmlResponse.equals("")) {
            return  null;
        }

        Jaxb2Marshaller unmarshaller = (Jaxb2Marshaller) soapService.getUnmarshaller();
        CompanyData c = (CompanyData) unmarshaller.unmarshal(new StringSource(xmlResponse));
        return c.dane;
    }

}
