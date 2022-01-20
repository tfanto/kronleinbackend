package org.kro.bo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ShopKey implements Serializable{

    @Column(name = "shop_id")
    private Long shop_id;


    public ShopKey() {
    }

    public ShopKey(Long shopId) {
        this.shop_id = shopId;
    }

	
}
