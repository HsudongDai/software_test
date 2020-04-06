import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    private BubbleSort bubbleSort = null;
    private int[] arr = new int[]{5, 4, 3, 2, 1};
    private int[] target = {1, 2, 3, 4, 5};

    @Before
    public void SetUp() {
        bubbleSort = new BubbleSort();
    }

    @After
    public void tearDown() {
        bubbleSort = null;
    }

    @Test
    public void isSame() {
        BubbleSort.bubbleSort(arr);
        TestCase.assertEquals(Arrays.toString(target), Arrays.toString(arr));
        // System.out.println(Arrays.toString(arr));
    }

}
