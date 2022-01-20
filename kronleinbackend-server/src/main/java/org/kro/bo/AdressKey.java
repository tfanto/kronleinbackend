package org.kro.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AdressKey implements Serializable{
	
    @Column(name = "cust_id")
    private Long cust_id;

    @Column(name = "adress_id")
    private Long adress_id;
    
    public AdressKey() {
    }

    public AdressKey(Long customerId, Long adressId) {
        this.cust_id = customerId;
        this.adress_id = adressId;
    }


	

}
