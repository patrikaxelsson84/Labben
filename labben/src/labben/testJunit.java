package labben;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testJunit {

	@Test
	void test() {
		System.out.println("adding test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1)); // Rätt
		
	}

	// fail("Not yet implemented");
	@Test
	void additionButFails() {
		
		System.out.println("adding failing test");
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(2, 1)); // Fel
		
	}

	@Test
	void TestarMittNamnRatt() {
		
		System.out.println("Testar skriva ut mitt namn1");
		char[] expected = { 'P', 'a', 't', 'r', 'i', 'k' };
		char[] actual = "Patrik".toCharArray();
		assertArrayEquals(expected, actual); // Rätt
		
	}

	@Test
	void TestarMittNamnFel() {
		System.out.println("Testar skriva ut mitt namn2");
		char[] expected = { 'P', 'a', 't', 'r', 'i', 's' };
		char[] actual = "Patrik".toCharArray();
		assertArrayEquals(expected, actual); // 2Fel
		
	}
}

//		  @Test  
//		void mitttest() {}

//		System.out.println("testing me");
//		Calculator calculator = new Calculator();
//		assertTrue()()
//		assertEquals(4, calculator.add(2, 2));
//	

// The Test annotation tells JUnit that the public void
// method to which it is attached can be run as a test case.

// A set of assertion methods useful for writing tests.
// Only failed assertions are recorded.
// These methods can be used directly: Assert.assertEquals(...),
// however, they read better if they are referenced through static import:

// Assert Equals If you want to test equality of two objects, you have the
// following methods
// assertEquals(expected, actual)
// It will return true if: expected.equals( actual ) returns true.
