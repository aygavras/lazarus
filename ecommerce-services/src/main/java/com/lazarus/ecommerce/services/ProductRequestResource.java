/**Copyright 2016
 * Lazarus
 */
package com.lazarus.ecommerce.services;

import java.util.List;

import javax.inject.Singleton;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lazarus.domain.common.Product;

/**
 * @author aygavras
 *
 */
@Path("/products")
@Component
@Singleton
public class ProductRequestResource {

	@Autowired
	private ProductService productService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAllProducts")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	/**
	 * @param productService
	 *            the productService to set
	 */
	public void setProductService(ProductService productService) {
	
		this.productService = productService;
	}
}
