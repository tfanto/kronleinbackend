package org.kro.bo;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "shop" )
public class Shop {
	
    @EmbeddedId
    private ShopKey key;

    @Column(name = "shop_name")
    private String shop_name;
	
	

}
