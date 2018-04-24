package unit_test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Person;

class PersonTest {

	private Person p =new  Person();
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testGetFirstName() {
		p.setFirstName("aa");
		   assertEquals("aa", p.getFirstName());
	}

}
