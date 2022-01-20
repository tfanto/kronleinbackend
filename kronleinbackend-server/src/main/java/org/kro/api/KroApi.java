package org.kro.api;

import java.time.LocalDate;
import java.util.List;

import org.kro.bo.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping(value = "Api")
public class KroApi {
    private static final Logger LOG = LoggerFactory.getLogger(KroApi.class);

    @Autowired
    private CustomerService custService;

    

    @GetMapping(
            value = "/Time",
            produces = "application/json")
    List<Object> get(@RequestHeader(value = "X-ApiKey", required = false) String apiKeyfromHeader,
                           @RequestParam(value = "apiKey", required = false) String apiKeyfromParam,
                           @RequestParam(value = "empId", required = false) String empId,
                           @RequestParam(value = "fromDate", required = false) LocalDate fromDate,
                           @RequestParam(value = "toDate", required = false) LocalDate toDate,
                           @RequestParam(value = "customerId", required = false) Long customerId,
                           @RequestParam(value = "customerName", required = false) String customerName,
                           @RequestParam(value = "projectId", required = false) Long projectId,
                           @RequestParam(value = "projectName", required = false) String projectName) {

        //String apiUser = getApiUser(apiKeyfromHeader, apiKeyfromParam);

        //List<Object> ret =  reportedTimeService.get(apiUser, empId,fromDate,toDate,customerId,customerName,projectId,projectName);
          //      return ret;
    	LOG.info("not yet implemented");
    	return null;
    }

    
    
    
}
