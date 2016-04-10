/**Copyright 2016
 * Lazarus
 */
package com.lazarus.ecommerce.dao;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.lazarus.domain.common.Product;

/**
 * @author aygavras
 *
 */
public class ProductDAO extends SqlSessionDaoSupport {

	public List<Product> getAllProducts(){
		return getSqlSession().selectList("Product.getAllProducts");
	}
}
