package src;

public class Sorting {
    public static void SelectionSort (int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] <= array[minIndex])
                     minIndex = j;
            }
            
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    public static void QuickSort (int[] array) {
        QuickSort(array, 0, array.length - 1);
    }

    private static void QuickSort (int[] array, final int begin, final int end) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end);

            QuickSort(array, begin, partitionIndex - 1);
            QuickSort(array, partitionIndex + 1, end);
        }
    }
    
    private static int partition (int[] array, final int begin, final int end) {
        int pivot = array[end];
        int smallerElement = begin - 1;

        for (int currentElement = begin; currentElement <= end - 1; currentElement++) {
            if (array[currentElement] < pivot) {
                smallerElement++;
                swapIn(array, currentElement, smallerElement);
            }
        }

        swapIn(array, smallerElement + 1, end);
        return smallerElement + 1;
    }

    private static void swapIn (int[] array, final int indexOfFirstValue, 
                                    final int indexOfSecondValue) {
        int temp = array[indexOfFirstValue];
        array[indexOfFirstValue] = array[indexOfSecondValue];
        array[indexOfSecondValue] = temp;
    }
}