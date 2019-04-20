package jbosak.gus.reporter.gusReporter;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.tempuri.IUslugaBIRzewnPubl;

public class SoapService extends WebServiceGatewaySupport {

    private SoapHandlerResolver soapHandlerResolver;
    private SoapHandlerImpl soapHandler;
    private IUslugaBIRzewnPubl gusService;

}
