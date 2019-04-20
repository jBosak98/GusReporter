package jbosak.gus.reporter.gusReporter;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;
import java.util.ArrayList;
import java.util.List;

public class SoapHandlerResolver implements HandlerResolver {
    private SoapHandlerImpl soapHandler;

    public SoapHandlerResolver(SoapHandlerImpl soapHandler) {
        this.soapHandler = soapHandler;
    }

    @Override
    public List<Handler> getHandlerChain(PortInfo portInfo) {
        List<Handler> handlers = new ArrayList<>();
        handlers.add(soapHandler);

        return handlers;
    }
}
