package org.kro.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class OrderKey implements Serializable{
	
    @Column(name = "cust_id")
    private Long cust_id;
    
    @Column(name = "order_id")
    private Long order_id;


    public OrderKey() {
    }

    public OrderKey(Long customerId, Long orderId) {
        this.cust_id = customerId;
        this.order_id = orderId;
    }

	
	

}
