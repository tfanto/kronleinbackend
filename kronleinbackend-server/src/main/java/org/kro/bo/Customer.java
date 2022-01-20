package org.kro.bo;


import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "cust" )
public class Customer {

    @EmbeddedId
    private CustomerKey key;

    @Column(name = "cust_name")
    private String name;

    public Customer() {
    }

    public Customer(CustomerKey key) {
        this.key = key;
    }

    public CustomerKey getKey() {
        return key;
    }

    public void setKey(CustomerKey key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer activity = (Customer) o;
        return Objects.equals(key, activity.key) && Objects.equals(name, activity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, name);
    }
}
