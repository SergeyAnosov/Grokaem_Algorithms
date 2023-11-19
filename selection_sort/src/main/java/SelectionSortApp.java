import java.util.Arrays;

public class SelectionSortApp {

    public static void main(String[] args) {
        SelectonSort selectonSort = new SelectonSort();
        int[] array = {5,3,6,2,10,1};

        System.out.println(Arrays.toString(selectonSort.selectionSort(array)));
    }
}
