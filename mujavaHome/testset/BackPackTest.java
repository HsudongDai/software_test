import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BackPackTest {
    private BackPack backPack = null;
    @Before
    public void SetUp() {
        backPack = new BackPack();
    }

    @After
    public void tearDown() {
        backPack = null;
    }

    @Test
    public void test1() {
        int maxCapa = 10;
        int numOfItems = 3;
        int[] weights = new int[] {3, 4, 5};
        int[] price = new int[]{4, 5, 6};
        int[][] res = BackPack.BackPack_Solution(maxCapa, numOfItems, weights, price);
        String fin = "0\t0\t4\t4\t4\t4\t4\t4\t4\t4\t\n" +
                "0\t0\t4\t5\t5\t5\t9\t9\t9\t9\t\n" +
                "0\t0\t4\t5\t6\t6\t9\t10\t11\t11\t\n";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= numOfItems; i++) {
            for (int j = 1; j <= maxCapa; j++) {
                stringBuilder.append(res[i][j]).append('\t');
                //System.out.print(c[i][j] + "\t");
                if (j == maxCapa) {
                    stringBuilder.append('\n');
                    //System.out.println();
                }
            }
        }
        TestCase.assertEquals(stringBuilder.toString(), fin);
    }
}
