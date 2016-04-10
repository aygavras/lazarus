/**Copyright 2016
 * Lazarus
 */
package com.lazarus.ecommerce.services;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lazarus.domain.common.Product;

/**
 * @author aygavras
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:com/lazarus/ecommerce/services-context.xml" })
public class ProductServiceTest {

	@Resource(name = "productService")
	private ProductService productService;

	@Test
	public void testGetProducts() {
		List<Product> products = productService.getAllProducts();
		Assert.assertNotNull(products);
	}
}
