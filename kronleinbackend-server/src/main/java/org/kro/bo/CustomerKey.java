package org.kro.bo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CustomerKey implements Serializable {

    @Column(name = "cust_id")
    private Long cust_id;


    public CustomerKey() {
    }

    public CustomerKey(Long customerId) {
        this.cust_id = customerId;
    }

    public Long getCustomerId() {
        return cust_id;
    }

    public void setCustomerId(Long customerId) {
        this.cust_id = customerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerKey that = (CustomerKey) o;
        return Objects.equals(cust_id, that.cust_id) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cust_id);
    }
}
