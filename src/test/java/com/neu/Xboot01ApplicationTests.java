package com.neu;

import static org.junit.Assert.assertTrue;

//import org.junit.Before;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.MvcResult;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//import org.springframework.web.context.WebApplicationContext;
//
//import com.ljxl.at.core.annotation.CheckPoint;
//import com.ljxl.at.core.common.BaseTest;
//import com.neu.controller.UserController;


//@RunWith(SpringRunner.class)
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//@AutoConfigureMockMvc
//class Xboot01ApplicationTests extends BaseTest {
//
//	@Autowired
//    private MockMvc mockMvc;
//
//    @Before
//	protected void setup() {
//		
//	}
//
//	@Test
//	@CheckPoint(name="",score = 20)
//	void contextLoads() {
//		try {
//			MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/users")
//								) 
//					             .andDo(MockMvcResultHandlers.print())  
//					            .andReturn();
//		} catch (Exception e) {
//			e.printStackTrace();
//			assertTrue(false);
//		} 
//	}
//
//	
//}
