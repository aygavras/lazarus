/**Copyright 2016
 * Lazarus
 */
package com.lazarus.ecommerce.dao;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lazarus.domain.common.Product;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author aygavras
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:com/lazarus/dao/dao-context.xml" })
public class ProductDAOTest {

	@Resource(name = "productDAO")
	private ProductDAO productDAO;

	@Test
	public void testGetProducts() {
		List<Product> products = productDAO.getAllProducts();
		Assert.assertNotNull(products);
	}

}
