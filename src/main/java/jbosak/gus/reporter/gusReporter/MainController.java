package jbosak.gus.reporter.gusReporter;

import jbosak.gus.reporter.gusReporter.model.CompanyData;
import jbosak.gus.reporter.gusReporter.services.CompanyService;
import jbosak.gus.reporter.gusReporter.services.CompanyServiceImpl;
import jbosak.gus.reporter.gusReporter.services.SoapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXParseException;

@RestController
public class MainController {

//    SoapService soapService;

    CompanyService companyService;

    @Autowired
    public MainController(CompanyServiceImpl companyService) {
//        this.soapService = soapService;
        this.companyService = companyService;
    }

    public MainController() {
    }

    @GetMapping("/company/{nip}")
    public String getCompanyDetails(@PathVariable("nip") String nip)  {
        CompanyData.Company company = companyService.getCompany(nip);
        if (company == null){
            return "Error";
        }
        return company.toString();
    }
}
