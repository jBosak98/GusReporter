package jbosak.gus.reporter.gusReporter.Services;

import jbosak.gus.reporter.gusReporter.SoapHandlerImpl;
import jbosak.gus.reporter.gusReporter.SoapHandlerResolver;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.tempuri.IUslugaBIRzewnPubl;
import org.tempuri.UslugaBIRzewnPubl;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.soap.AddressingFeature;
import java.net.MalformedURLException;
import java.net.URL;

import static jbosak.gus.reporter.gusReporter.BeanConfig.*;

public class SoapService extends WebServiceGatewaySupport {



    private SoapHandlerResolver soapHandlerResolver;
    private SoapHandlerImpl soapHandler;
    private IUslugaBIRzewnPubl gusService;

    public SoapService() throws MalformedURLException {
        this.soapHandler = new SoapHandlerImpl();
        this.soapHandlerResolver = new SoapHandlerResolver(soapHandler);
        UslugaBIRzewnPubl s = new UslugaBIRzewnPubl(new URL(SERVICE_URL));
        s.setHandlerResolver(soapHandlerResolver);
        gusService = s.getE3(new AddressingFeature());
        ((BindingProvider) gusService)
                .getRequestContext()
                .put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, SERVICE_ENDPOINT);
        login();
    }
    private void login(){
        if (soapHandler.getSession().equals("") || soapHandler.getSession().equals("1")){
            soapHandler.setSession(gusService.zaloguj(USER_KEY));
        }
    }
    public void logout(){
        gusService.wyloguj(soapHandler.getSid());
        soapHandler.setSession("");
    }

    public IUslugaBIRzewnPubl getGusService() {
        return gusService;
    }
}
