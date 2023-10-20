package com.PortfolioProject.ERPFullstackApp;

import com.PortfolioProject.ERPFullstackApp.ProductCard.ProductCardRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;


@SpringBootTest
class ErpFullstackAppApplicationTests {

	@Test
	void contextLoads() {
	}

//Serw
//
//	@Test
//	@Order(value = 2)
//	void testAddEmployees() throws Exception {
//		for (EmployeeRequest employee : employees) {
//			String emp = objectMapper.writeValueAsString(employee);
//			mockMvc.perform(
//							MockMvcRequestBuilders.post("/api/v1/employees").contentType(MediaType.APPLICATION_JSON).content(emp))
//					.andExpect(status().isCreated());
//		}
//		Assertions.assertEquals(5, repository.findAll().size());
//	}
//
//	@Test
//	@Order(value = 3)
//	void testGetAllEmployees() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/employees")).andExpect(status().isOk());
//		Assertions.assertEquals(employees.get(3).getName(), repository.findById(4).get().getName());
//	}
//
//	@Test
//	@Order(value = 4)
//	void testGetEmployeeById() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/employees/2")).andExpect(status().isOk());
//		Assertions.assertEquals(employees.get(1).getName(), repository.findById(2).get().getName());
//	}
//
//	@Test
//	@Order(value = 5)
//	void testDeleteEmployeeById() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/employees/2")).andExpect(status().isOk());
//	}
//
//	@Test
//	@Order(value = 6)
//	void testUpdateEmployee() throws Exception {
//		Employee employee = Employee.builder().id(3).name("Saurav Kumar Shah").address("India East").build();
//		String emp = objectMapper.writeValueAsString(employee);
//		mockMvc.perform(
//						MockMvcRequestBuilders.put("/api/v1/employees").contentType(MediaType.APPLICATION_JSON).content(emp))
//				.andExpect(status().isOk());
//		Assertions.assertEquals(employee.getName(), repository.findById(3).get().getName());
//	}
//
//	@Test
//	@Order(value = 7)
//	void testDeleteAllEmployees() throws Exception {
//		mockMvc.perform(MockMvcRequestBuilders.delete("/api/v1/employees")).andExpect(status().isOk());
//		Assertions.assertEquals(0, repository.findAll().size());
//	}

}
