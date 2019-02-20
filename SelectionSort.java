// Sepid Ebrahimi, CS245

public class SelectionSort implements SortingAlgorithm {

    public void sort(int [] a){
        for(int i = 0; i < a.length-1;i++){
            swap(a,i,findSmallest(a,i)); //brings the smallest number in the array to the front
        }
    }


    public int findSmallest(int[]a, int start){ // finds the smallest element in the array
        int smallest = start;
        for(int i = start+1; i < a.length; i++){
            if(a[i]<a[smallest]){
                smallest=i;
            }
        }
        return smallest;
    }



    public void swap(int[]a, int i, int j){  //swaps a[i] with a[j]
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
