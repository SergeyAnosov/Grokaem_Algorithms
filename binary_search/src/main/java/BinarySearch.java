public class BinarySearch {
    public int binarySearch(int[] sortArray, int item) {
        int low = 0;
        int high = sortArray.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (sortArray[mid] < item) {
                low = mid + 1;
            } else if (sortArray[mid] > item) {
                high = mid - 1;
            } else if (sortArray[mid] == item) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
