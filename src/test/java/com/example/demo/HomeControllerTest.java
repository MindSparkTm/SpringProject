package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.model.Home;
import com.example.demo.service.HomeServiceImpl;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@WebMvcTest(value = HomeController.class)
public class HomeControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private HomeServiceImpl shomeService;
	
	@Test
    public void hellotest(){
    	
    	Home s = new Home("Mohsen");
    	Mockito.when(
			shomeService.fetchinfo(Mockito.anyString())).thenReturn(s);
    	
    	RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
				"/homedata?name=mohsen");
		try {
			MvcResult result = mockMvc.perform(requestBuilder).andReturn();
			String expected = "{name:Mohsen}";
			
			JSONAssert.assertEquals(expected, result.getResponse()
					.getContentAsString(), true);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
