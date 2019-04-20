package jbosak.gus.reporter.gusReporter;

import cis.bir.publ._2014._07.DaneSzukaj;
import cis.bir.publ._2014._07.ObjectFactory;
import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.xml.transform.StringSource;
import org.tempuri.IUslugaBIRzewnPubl;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import java.io.IOException;
import java.net.MalformedURLException;

@RestController
public class MainController {

    @GetMapping("/xd/{nip}")
    public String exampleMethod(@PathVariable("nip") String nip){
        SoapClient client = new SoapClient();
        try {
            IUslugaBIRzewnPubl service =  client.initService();

            System.out.println("Status sesji: " + service.getValue("StatusSesji"));
            System.out.println("PelnyRaport:" + service.danePobierzPelnyRaport("00033150100000", "PublDaneRaportPrawna"));

            ObjectFactory objectFactory = new ObjectFactory();
            ParametryWyszukiwania params = new ParametryWyszukiwania();
            params.setRegon(objectFactory.createDanePobierzPelnyRaportPRegon(""));
            objectFactory.createDaneSzukaj();
            ParametryWyszukiwania regonA = new ParametryWyszukiwania();
            DaneSzukaj createMessageDescription = objectFactory.createDaneSzukaj();
            regonA.setNip(new JAXBElement<String>(new QName("http://CIS/BIR/PUBL/2014/07/DataContract", "Nip"),String.class, nip));
            System.out.println("REGON:" + regonA.getNip().getName());
            System.out.println("REGON:" + regonA.getNip().getValue());
            createMessageDescription.setPParametryWyszukiwania( new JAXBElement<ParametryWyszukiwania>(new QName("Your localPart"),
                    ParametryWyszukiwania.class, regonA));

            System.out.println("DaneSzukaj: " + service.daneSzukaj(regonA));
//            DaneSzukajResponse response = service.daneSzukaj(regonA);
//            JAXBElement<ParametryWyszukiwania> paramsGroup = new JAXBElement<ParametryWyszukiwania>();
//
//            paramsGroup.setValue(params);
//            xd.setPParametryWyszukiwania(paramsGroup);

//            regon.setRegon(objectFactory.createDanePobierzPelnyRaportPRegon("Reg"));
//            service.danePobierzPelnyRaport()
//            service.daneSzukaj(params);
//            Source source = new StreamSource(service.daneSzukaj(regonA));
//            JAXBElement<CompanyData> root = (JAXBElement<CompanyData>) client.getUnmarshaller().unmarshal(source);
//            CompanyData foo = root.getValue();
            System.out.println(service.daneSzukaj(regonA));
            JAXBContext jaxbContext = JAXBContext.newInstance(CompanyData.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            String dane = service.daneSzukaj(regonA);
            CompanyData c = (CompanyData) unmarshaller.unmarshal( new StringSource(service.daneSzukaj(regonA)));
            System.out.println(c);


            return  service.daneSzukaj(regonA);

//                    service.danePobierzPelnyRaport("00033150100000", "PublDaneRaportPrawna");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return "XD";
    }
}
