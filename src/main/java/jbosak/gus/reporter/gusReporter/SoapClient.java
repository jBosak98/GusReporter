package jbosak.gus.reporter.gusReporter;

import org.tempuri.IUslugaBIRzewnPubl;
import org.tempuri.UslugaBIRzewnPubl;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.AddressingFeature;
import java.net.MalformedURLException;
import java.net.URL;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;


public class SoapClient extends WebServiceGatewaySupport{

    private SoapHandlerResolver soapHandlerResolver;
    private SoapHandlerImpl soapHandler;

    public SoapClient() {

        this.soapHandler = new SoapHandlerImpl();
        this.soapHandlerResolver = new SoapHandlerResolver(soapHandler);
    }

    public IUslugaBIRzewnPubl initService() throws MalformedURLException {
        IUslugaBIRzewnPubl service = setupBindingProvider();

        return service;
    }

    private IUslugaBIRzewnPubl setupBindingProvider() throws MalformedURLException {

        UslugaBIRzewnPubl service = new UslugaBIRzewnPubl(new URL("https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/wsdl/UslugaBIRzewnPubl.xsd"));
        service.setHandlerResolver(soapHandlerResolver);
        IUslugaBIRzewnPubl newService = service.getE3(new AddressingFeature());
        BindingProvider bindingProvider = (BindingProvider) newService;
        bindingProvider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://wyszukiwarkaregontest.stat.gov.pl/wsBIR/UslugaBIRzewnPubl.svc");
        if (soapHandler.getSession().equals("") || soapHandler.getSession().equals("1")){
            soapHandler.setSession(newService.zaloguj("abcde12345abcde12345"));
        }
        return newService;

    }

}
