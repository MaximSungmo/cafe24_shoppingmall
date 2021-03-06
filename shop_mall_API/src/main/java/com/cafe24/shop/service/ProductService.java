package com.cafe24.shop.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cafe24.shop.repository.ProductDao;
import com.cafe24.shop.vo.GuestbookVo;
import com.cafe24.shop.vo.ProductDetailVo;
import com.cafe24.shop.vo.ProductVo;
@Service
public class ProductService {

	@Autowired
	private ProductDao productDao;
	
	/*
	 * 상품 정보, product
	 */
	public List<ProductVo> get(Long no, String kwd, Long get_count) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("category_no", no);
		map.put("kwd", kwd);
		map.put("get_count", get_count);
		return productDao.get_product_list(map);
	}

	public Boolean add_product(ProductVo vo) {
		return productDao.add_product(vo);

	}
	
	public Long update_product(ProductVo vo) {
		return productDao.update_product(vo);
	}

	public Long delete_product(Long no) {
		return productDao.delete_product(no);
	}

	
	/*
	 * 상품 상세정보, product_detail 
	 */
	public Long add_product_detail(ProductDetailVo vo) {
		return productDao.add_product_detail(vo);

	}

	public List<ProductDetailVo> get_product_detail_list(Long product_no) {
		return productDao.get_product_detail_list(product_no);
	}

	public Long update_product_detail(Long product_detail_no) {
		return productDao.update_product_detail(product_detail_no);
	}

	public Long delete_product_detail(Long product_no, Long product_detail_no) {
		Map<String, Long> map = new HashMap<String, Long>();
		map.put("product_no", product_no);
		map.put("product_detail_no", product_detail_no);
		return productDao.delete_product_detail(map);
	}

}
