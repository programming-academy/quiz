package org.academy.quiz.stealthily;

import org.academy.quiz.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class StealthilyHomeTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@BeforeMethod
	public void beforeMethod() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void home() throws Exception {
		mockMvc.perform(get("/stealthily")).andExpect(content().string("running..."));
		mockMvc.perform(get("/stealthily/")).andExpect(content().string("running..."));
	}
	
}
