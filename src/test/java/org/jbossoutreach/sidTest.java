package org.jbossoutreach;
import org.junit.Assert;
import org.junit.Test;

public class sidTest {

    private int x = 666;
    private int y = 242;


    @Test
    public void sampleTest() {
        System.out.println("@Test_Test_Method_2");
    }

    @Test
        public void testArrayEquals(){              // Checks if array turns out to be same
        int[] array1={x,y};
        int[] array2_Expected={666,242};
        Assert.assertArrayEquals(array1, array2_Expected);

        }

    @Test
        public void testFalse() {                   // Checks if Product is Fals
        int pro = x * y;
        Assert.assertFalse(pro == 300);
        Assert.assertFalse(pro == 99);
        Assert.assertFalse(pro == 10000000);
        Assert.assertFalse(pro == -10000000);
        Assert.assertFalse(pro == 0);
        }

    @Test
        public void testEquals() {                  // Checks if Sum is equal
        int sum = x + y;
        Assert.assertEquals(sum, 908);
        Assert.assertEquals(x + 30, 696);
        Assert.assertEquals(y + 30, 272);
    }

    @Test
        public void testTrue() {                    // Checks is difference is true
        int diff = x - y;
        Assert.assertTrue(diff == 424);
        Assert.assertTrue(x - diff == y);
    }

    @Test
    public void testDifferent() {                   // Checks if x & y are different
        Assert.assertNotSame(x, y);
    }




}

