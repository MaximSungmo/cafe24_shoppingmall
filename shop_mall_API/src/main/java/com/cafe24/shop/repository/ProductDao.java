package com.cafe24.shop.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cafe24.shop.vo.ProductDetailVo;
import com.cafe24.shop.vo.ProductVo;

@Repository
public class ProductDao {

	@Autowired
	SqlSession sqlSession;
	
	public Boolean add_product(ProductVo vo) {
		return sqlSession.insert("product.add_product", vo)==1;		
	}
	
	public List<ProductVo> get_product_list(Map<String, Object> map){
		List<ProductVo> product_list = sqlSession.selectList("product.get_product_list", map);
		return product_list;
	}
		
	public Long delete_product(Long no) {
		return sqlSession.delete("product.delete_product", vo);
	}
	
	public Long update_product(ProductVo vo) {	
		return sqlSession.update("product.update_product", vo);
	}

	public Long add_product_detail(ProductDetailVo vo) {
		return sqlSession.insert("product.add_product_detail", vo);
	}

	public List<ProductDetailVo> get_product_detail_list(Long no) {
		List<ProductDetailVo> product_list = sqlSession.selectList("product.get_product_detail_list", no);
		return product_detail_list;
	}

	public Long update_product_detail(Long product_detail_no) {
		Long updated_product_detail_no = sqlSession.update("product.update_product_detail", product_detail_no);
		return updated_product_detail_no;
	}

	public Long delete_product_detail(Map<String, Long> map) {
		return sqlSession.delete("product.delete_product", vo);
	}

}
