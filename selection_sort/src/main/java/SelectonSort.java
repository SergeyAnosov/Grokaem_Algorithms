public class SelectonSort {

    public int[] selectionSort(int[] array) {
        int smallest_index;
        int[] newArray = new int[array.length-1];
        for (int i : array) {
            smallest_index = findSmallest(array);
            newArray[i] = array[smallest_index];
        }
        return newArray;
    }

    public int findSmallest(int[] array) {
        int smallest = array[0];
        int smallest_index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallest_index = i;
            }
        }
        return smallest_index;
    }
}
