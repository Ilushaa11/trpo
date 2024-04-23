import org.junit.Assert;
import org.junit.Test;

public class SortTest
{
    @Test
    public void testSortForNull()
    {
        int[] actual = {0, 0, 0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0, 0, 0};
        actual = Main.mergeSort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortForNegative()
    {
        int[] actual = {-5, -2, -3, -1, -6, -4};
        int[] expected = {-6,-5,-4,-3,-2,-1};
        actual = Main.mergeSort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortForSame()
    {
        int[] actual = {1, 1, 1, 2, 2, 2};
        int[] expected = {1,1,1,2,2,2};
        actual = Main.mergeSort(actual);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort()
    {
        int[] actual = {5, 1, 6, 2, 3, 4};
        int[] expected = {1, 2, 3, 4, 5, 6};
        actual = Main.mergeSort(actual);
        Assert.assertArrayEquals(expected, actual);
    }
}