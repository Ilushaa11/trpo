import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    public static int[] mergeSort(int[] sortArr)
    {
        int[] buffer1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buffer2 = new int[sortArr.length];
        int[] result = mergeSortInner(buffer1, buffer2, 0, sortArr.length);
        return result;
    }

    public static int[] mergeSortInner(int[] buffer1, int[] buffer2, int startIndex, int endIndex)
    {
        if (startIndex >= endIndex - 1)
        {
            return buffer1;
        }

        //уже отсортирован
        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(buffer1, buffer2, startIndex, middle);
        int[] sorted2 = mergeSortInner(buffer1, buffer2, middle, endIndex);

        //слияние
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == buffer1 ? buffer2 : buffer1;
        while (index1 < middle && index2 < endIndex)
        {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle)
        {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex)
        {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite razmernos' massiva");
        int n = input.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = input.nextInt();
        }


        int[] result = mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }
}



