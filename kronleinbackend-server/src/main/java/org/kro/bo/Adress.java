package org.kro.bo;

import java.time.LocalDateTime;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "adress" )
public class Adress {
	
    @EmbeddedId
    private AdressKey key;
    
    private LocalDateTime  registered;
    
    private String street;
    private String streetNumber;
    private String apartment;
    private String city;
    private String zipCode;
    private String country;
    
    
    


}
