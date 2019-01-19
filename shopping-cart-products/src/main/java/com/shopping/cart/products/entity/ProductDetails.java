package com.shopping.cart.products.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("PRODUCT_DETAILS")
public class ProductDetails implements Serializable{

	/**
	 * Serialization version id.
	 */
	private static final long serialVersionUID = -3821837923691134945L;
	
	/**
	 * code declaration
	 */
	@PrimaryKey
	private String code;
	
	/**
	 * name declaration
	 */
	private String name;
	
	/**
	 * description declaration
	 */
	private String description;
	
	/**
	 * price declaration
	 */
	private BigDecimal price;
	
	/**
	 * category declaration
	 */
	private String category;

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

}
