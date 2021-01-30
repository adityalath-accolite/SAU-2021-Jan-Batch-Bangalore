package com.demo.mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StudentControllerTest {

	StudentController stud;
	
	@BeforeEach
	void before()
	{
		stud = new StudentController();
	}
	
	@Test
	void test1() {
		Student s = mock(Student.class);
		when(s.getFirstName()).thenReturn("Aditya");
		when(s.getLastName()).thenReturn("Lath");
		String name = stud.getFullName(s);
		assertEquals("Aditya Lath",name);
		verify(s).getFirstName();                        //verifying if this function is called in testing
		verify(s,times(1)).getLastName();				 //verifying if mock function is called exactly once 
	}
	
	@Test
	void test2() {
		Student s = mock(Student.class);
		when(s.getId()).thenReturn(15);
		int roll = stud.getStudentRollNumber(s);
		assertEquals(15,roll);
		verify(s).getId();
	}
	
	@AfterEach
	void after()
	{
		stud = null;
	}
}
