// Sepid Ebrahimi, CS245

public class BubbleSort implements SortingAlgorithm {

    public void sort(int [] a){
        boolean swapped = true; // we are adding a boolean which helps up improve our function in case the array is already sorted
        for(int i = 0; i < a.length && swapped; i++){
            swapped = false;
            for (int j = 0; j < a.length-i-1; j++){
                if(a[j] > a[j+1]){
                    swap(a,j,j+1);
                    swapped = true;
                }
            }
        }

    }


    public void swap(int[]a, int i, int j){ //swaps a[i] with a[j]
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
