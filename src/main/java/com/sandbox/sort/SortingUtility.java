package com.sandbox.sort;

public class SortingUtility {

    public static <T extends Comparable<T>> void selectionSort(T[] data) {

            int min; // red box

            for (int index = 0; index < data.length - 1; index++) {

                // Assume first value is min
                min = index;

                for (int scan = index + 1; scan < data.length; scan++) { // blue box

                    // Find minimum value
                    if (data[scan].compareTo(data[min]) < 0) {
                        min = scan;
                    }

                }

                // Swap minimum value with lowest index
                swap(data, min, index);
            }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int index1, int index2) {

        T temp = data[index1];
        data[index1] = data[index2];
        data[index2] = temp;
    }

    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for (int index = 1; index < data.length; index++) {

            T key = data[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && data[position - 1].compareTo(key) > 0) {
                data[position] = data[position - 1];
                position--;
            }

            data[position] = key;

        }
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] data) {

        int position, scan;

        for (position = data.length - 1; position >= 0; position--) {

            for (scan = 0; scan <= position - 1; scan++) {

                if (data[scan].compareTo(data[scan + 1]) > 0) {
                    swap(data, scan, scan + 1);
                }

            }

        }

    }

    public static <T extends Comparable<T>> void quickSort(T[] data) {
        quickSort(data, 0, data.length - 1);
    }

    private static <T extends Comparable<T>> void quickSort(T[] data, int min, int max) {

        if (min < max) {

            int pivot = partition(data, min, max);

            quickSort(data, min, pivot - 1);
            quickSort(data, pivot + 1, max);

        }

    }

    private static <T extends Comparable<T>> int partition(T[] data, int min, int max) {

        T pivot = data[min];
        int left = min;
        int right = max;

        while (left < right) {

            while (data[left].compareTo(pivot) <= 0 && left < right) {
                left++;
            }

            while (data[right].compareTo(pivot) > 0) {
                right--;
            }

            if (left < right) {
                swap(data, left, right);
            }

        }

        swap(data, min, right);

        return right;
    }

    public static <T extends Comparable<T>> void mergeSort(T[] data) {
        mergeSort(data, 0, data.length - 1);
    }

    private static <T extends Comparable<T>> void mergeSort(T[] data, int min, int max) {

        if (min < max) {

            int mid = (min + max) / 2;

            mergeSort(data, min, mid);
            mergeSort(data, mid + 1, max);

            merge(data, min, mid, max);
        }

    }

    private static <T extends Comparable<T>> void merge(T[] data, int first, int mid, int last) {

        T[] temp = (T[]) new Comparable[data.length];

        int first1 = first;
        int last1 = mid;
        int first2 = mid + 1;
        int last2 = last;

        int index = first1;

        while (first1 <= last1 && first2 <= last2) {

            if (data[first1].compareTo(data[first2]) < 0) {
                temp[index] = data[first1];
                first1++;
            } else {
                temp[index] = data[first2];
                first2++;
            }

            index++;
        }

        while (first1 <= last1) {
            temp[index] = data[first1];
            first1++;
            index++;
        }

        while (first2 <= last2) {
            temp[index] = data[first2];
            first2++;
            index++;
        }

        for (index = first; index <= last; index++) {
            data[index] = temp[index];
        }

    }

}
