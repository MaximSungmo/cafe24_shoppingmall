package com.cafe24.mysite.controller;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ResourceProperties.Content;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.cafe24.mysite.vo.CategoryVo;
import com.cafe24.mysite.vo.CustomerVo;
import com.cafe24.mysite.vo.ProductVo;
import com.google.gson.Gson;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
public class ProductControllerTest {
	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private WebApplicationContext webApplicationContext;

	@Before
	public void setup() throws Exception {
		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).alwaysDo(print()).build();
	}

	List<ProductVo> list = new ArrayList<ProductVo>();
	ProductVo vo1 = new ProductVo(1L, "상품1", "상품1상세내용", "상태1", "Y", 1L, "2019-07-14 00:00:00", 1L, 1L);
	ProductVo vo2 = new ProductVo(2L, "상품2", "상품2상세내용", "상태2", "Y", 1L, "2019-07-14 00:00:00", 1L, 1L);
	ProductVo vo3 = new ProductVo(3L, "상품3", "상품3상세내용", "상태3", "Y", 1L, "2019-07-14 00:00:00", 1L, 1L);
	ProductVo vo4 = new ProductVo(4L, "상품4", "상품4상세내용", "상태4", "N", 1L, "2019-07-14 00:00:00", 1L, 1L);
//	list.add(vo1);
//	list.add(vo2);
//	list.add(vo3);
//	list.add(vo4);

	/**
	 * get_product_list()
	 * @throws Exception 
	 * :상품 목록 가져오기.(param: category_no, kwd) 
	 */
	@Test
	public void get_product_list() throws Exception {
		// ## get_product_list() 성공 테스트
//		Long no=1L;
//		String kwd="";
//		ResultActions resultActions = mockMvc.perform(get("/product/"+no+"?kwd="+kwd).contentType(MediaType.APPLICATION_JSON));
//		resultActions
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$.result").value("success"))
//		.andExpect(jsonPath("$.data.no").value("1"))
//		.andExpect(jsonPath("$.data.name").value("상품1"))
//		.andExpect(jsonPath("$.data.description").value("상품1상세내용"))
//		.andExpect(jsonPath("$.data.category_no").value("1"));
//		
//		ResultActions resultActions2 = mockMvc.perform(get("/product/?kwd=''").contentType(MediaType.APPLICATION_JSON));
//		resultActions2
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$.result").value("success"))
//		.andExpect(jsonPath("$.data.no").value("1"))
//		.andExpect(jsonPath("$.data.name").value("상품1"))
//		.andExpect(jsonPath("$.data.description").value("상품1상세내용"))
//		.andExpect(jsonPath("$.data.category_no").value("1"));
//		
//		ResultActions resultActions3 = mockMvc.perform(get("/product/1?kwd='상품1'").contentType(MediaType.APPLICATION_JSON));
//		resultActions3
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$.result").value("success"))
//		.andExpect(jsonPath("$.data.no").value("1"))
//		.andExpect(jsonPath("$.data.name").value("상품1"))
//		.andExpect(jsonPath("$.data.description").value("상품1상세내용"))
//		.andExpect(jsonPath("$.data.category_no").value("1"));
//		
//		ResultActions resultActions4 = mockMvc.perform(get("/product/?kwd='상품1'").contentType(MediaType.APPLICATION_JSON));
//		resultActions4
//		.andExpect(status().isOk())
//		.andExpect(jsonPath("$.result").value("success"))
//		.andExpect(jsonPath("$.data.no").value("1"))
//		.andExpect(jsonPath("$.data.name").value("상품1"))
//		.andExpect(jsonPath("$.data.description").value("상품1상세내용"))
//		.andExpect(jsonPath("$.data.category_no").value("1"));	
	}

}