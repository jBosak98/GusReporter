package jbosak.gus.reporter.gusReporter;

import jbosak.gus.reporter.gusReporter.services.SoapService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import java.net.MalformedURLException;

@Configuration
public class BeanConfig {
    public static final String SERVICE_URL = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/wsdl/UslugaBIRzewnPubl.xsd";
    public static final String SERVICE_ENDPOINT = "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc";
    public static final String USER_KEY = "abcde12345abcde12345";

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPaths("cis.bir._2014._07",
                "cis.bir.publ._2014._07",
                "cis.bir.publ._2014._07.datacontract",
                "jbosak.gus.reporter.gusReporter.model");
        return marshaller;
    }

    @Bean
    public SoapService quoteClient(Jaxb2Marshaller marshaller) throws MalformedURLException {
        SoapService client = new SoapService();
        client.setDefaultUri(SERVICE_ENDPOINT);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);

        return client;
    }

}