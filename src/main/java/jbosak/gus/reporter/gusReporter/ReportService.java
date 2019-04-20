package jbosak.gus.reporter.gusReporter;

import cis.bir.publ._2014._07.ObjectFactory;
import cis.bir.publ._2014._07.datacontract.ParametryWyszukiwania;
import org.tempuri.IUslugaBIRzewnPubl;

import java.net.MalformedURLException;

public class ReportService {

    private SoapClient soapClient;

    public ReportService(SoapClient soapClient) {
        this.soapClient = soapClient;
    }

    public String getReport(){
        try {
            IUslugaBIRzewnPubl service = soapClient.initService();
            ObjectFactory objectFactory = new ObjectFactory();
            ParametryWyszukiwania params = new ParametryWyszukiwania();

            String report = service.danePobierzPelnyRaport("XD","GDS");

            return report;
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return "";
    }
}
