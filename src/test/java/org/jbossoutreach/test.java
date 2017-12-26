package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;

public class test {

	private int val = 22;
	private int vbl = 33;
	private String str1 = "Hello";
	private String str2 = "World";
	private String str0 = null;

	@Test
	public void sampleTest() {
		System.out.println("@Test - test_method_1");
	}

	@Test
	public void assertTrueTest() {
		Assert.assertTrue(val == 22);
	}

	@Test
	public void assertFalseTest() {
		Assert.assertFalse(val == 33);
	}

	@Test
	public void assertEqualsTest() {
		int sum = val + vbl;
		Assert.assertEquals(sum, 55);
	}

	@Test
	public void assertNotEqualsTest() {
		Assert.assertNotEquals(str1, str2);
	}

	@Test
	public void assertNullTest() {
		Assert.assertNull(str0);
	}
}
