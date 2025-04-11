package Unit_Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	int a,b, expRes;
	static Calculator c;
	
	@BeforeAll
	static void getObject() {
		c = new Calculator();
	}
	
	@BeforeEach 
	void setValues() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a= sc.nextInt();
		System.out.println("Enter b: ");
		b= sc.nextInt();
		System.out.println("Enter Expected result: ");
		expRes = sc.nextInt();
	}
	
	@Test
	void testAdd() {
		int actRes = c.add(a,b);
		assertEquals(expRes,actRes,"test case failed");
	}

	@Test
	void testSub() {
		int actRes = c.sub(a,b);
		assertEquals(expRes,actRes);
	}

	@Test
	void testMul() {
		int actRes = c.mul(a,b);
		assertEquals(expRes,actRes);
	}

	@Test
	void testDiv() {
		int actRes =c.div(a,b);
		assertEquals(expRes,actRes);
	}

}
