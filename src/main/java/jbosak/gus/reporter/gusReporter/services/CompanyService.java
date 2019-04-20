package jbosak.gus.reporter.gusReporter.services;

import jbosak.gus.reporter.gusReporter.model.CompanyData;

public interface CompanyService {
     public CompanyData.Company getCompany(String nip) ;
}
