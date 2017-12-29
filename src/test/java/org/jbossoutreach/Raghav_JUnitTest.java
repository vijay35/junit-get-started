package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;


public class Raghav_JUnitTest{
	int s1=586,s2=986;
    @Test
    public void test_sum()
    {
        int sum=s1+s2;        
        Assert.assertTrue(sum == 1572);
    }
	 @Test
    public void sampleTest() {
        System.out.println("@Test - test_method_1");
    }
    @Test
    public void test_power()
    {
        double pow=Math.pow(s1,3);
        Assert.assertFalse(pow != 201230056);
    }
    @Test
    public void test_sub()
    {
        int sub=s2-s1;
        Assert.assertEquals(sub,400);
    }
    @Test
    public void test_array_equality()
    {
        int ar1[]={1,2,3};
        int ar2[]={1,2,3};
        Assert.assertArrayEquals(ar1 ,ar2);
    }

    @Test
    public void test_null()
    {
        String str=null;
        Assert.assertNull(str);
    }	
	
}
