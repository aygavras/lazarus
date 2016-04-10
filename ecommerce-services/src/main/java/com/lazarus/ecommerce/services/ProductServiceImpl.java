/**Copyright 2016
 * Lazarus
 */
package com.lazarus.ecommerce.services;

import java.util.List;

import com.lazarus.domain.common.Product;
import com.lazarus.ecommerce.dao.ProductDAO;

/**
 * @author aygavras
 *
 */
public class ProductServiceImpl implements ProductService {

	private ProductDAO productDAO;
	
	
	@Override
	public List<Product> getAllProducts() {
		return productDAO.getAllProducts();
	}
	
	/**
	 * @param productDAO the productDAO to set
	 */
	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

}
