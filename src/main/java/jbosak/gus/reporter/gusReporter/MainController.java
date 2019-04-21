package jbosak.gus.reporter.gusReporter;

import jbosak.gus.reporter.gusReporter.model.CompanyData;
import jbosak.gus.reporter.gusReporter.services.CompanyService;
import jbosak.gus.reporter.gusReporter.services.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {


    CompanyService companyService;

    @Autowired
    public MainController(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }

    public MainController() {
    }

    @GetMapping("/company/{nip}")
    public ModelAndView getCompanyDetails(@PathVariable("nip") String nip){
        ModelAndView mav = new ModelAndView("index");
        CompanyData.Company company = companyService.getCompany(nip);
        mav.addObject("company", company);
        return  mav;
    }



    @GetMapping("/")
    public ModelAndView indexPage(){
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("nip", "0");
        return mav;
    }

    @PostMapping("/")
    public ModelAndView indexPage(@ModelAttribute("nip") String nip){
        return new ModelAndView("redirect:/company/" + nip);
    }


}
