package jbosak.gus.reporter.gusReporter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class BeanConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPaths("cis.bir._2014._07",
                "cis.bir.publ._2014._07",
                "cis.bir.publ._2014._07.datacontract");
        return marshaller;
    }

    @Bean
    public SoapClient quoteClient(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setDefaultUri("https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc"); //TODO
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);

        return client;
    }

}