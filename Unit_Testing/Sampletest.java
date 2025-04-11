package Unit_Testing;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Sampletest {

	@BeforeAll
	static void testNetwork() {
		System.out.println("Before all");
	}
	
	@AfterAll
	static void testNetwork2() {
		System.out.println("After all");
	}
	
	@BeforeEach
	void testdata() {
		System.out.println("Before each test case");
	}
	
	@AfterEach
	void testdata2() {
		System.out.println("after each test case");
	}
	
	@Test
	void test1() {
		System.out.println("test1");
	}
	
	@Test
	void test2() {
		System.out.println("test2");
	}

	@Test
	void test3() {
		System.out.println("test3");
	}


}
