package org.kro.bo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order {

	@EmbeddedId
	private OrderKey key;

	private String orderReference;

}
