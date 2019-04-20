package jbosak.gus.reporter.gusReporter;

import javax.xml.namespace.QName;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.util.*;

public class SoapHandlerImpl implements SOAPHandler<SOAPMessageContext> {

    private String session = "";
    private String sid = "sid";


    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        if ((boolean) context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY)){
            Map<String, List<String>> headers = (Map<String, List<String>>) context.get(MessageContext.HTTP_REQUEST_HEADERS);
            if (headers == null){
                headers = new HashMap<>();
                context.put(MessageContext.HTTP_REQUEST_HEADERS, headers);
            }
            List<String> cookies = headers.computeIfAbsent(sid, k-> new ArrayList<>());
            cookies.add(this.session);

        }
        return true;
    }

    @Override
    public Set<QName> getHeaders() { return null; }

    @Override
    public boolean handleFault(SOAPMessageContext context) { return false; }

    @Override
    public void close(MessageContext context) { }


    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }
}
