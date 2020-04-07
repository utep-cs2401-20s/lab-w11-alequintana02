public class newSorting {
    void newSorting(int[]array,int size){




    }




    /********MERGE SORT******/
    static void merging(int[]array,int i,int j,int k){
        int size = k-i+1;
        int position=0;
        int leftPos=0;
        int rightPos=0;
        int [] mergedHalves=new int[size];
        leftPos=i;
        rightPos=j+1;
        while (leftPos <= j && rightPos <=k){
            if(array[leftPos]<=array[rightPos]) {
                mergedHalves[position] = array[leftPos];
            }else {
                mergedHalves[position] = array[rightPos];
                rightPos++;
            }
            position++;
        } //closes while loop
        while (leftPos <=j) {
            mergedHalves[position] = array[leftPos];
        }
        while (rightPos<=k) {
            mergedHalves[position] = array[rightPos];
            rightPos++;
            position++;
        }
        for(position=0;position<size;position++){
            array[i + position] = mergedHalves[position];
        }//closes while
    }//closes merge method
    static void mergeSort(int[]array,int i,int k){
        int j=0;
        if (i<k){
            j=(i+k)/2;
            mergeSort(array,i,j);
            mergeSort(array,j+1,k);
            merging(array,i,j,k);
        }
    }
    /********QUICKSORT******/
    static int partitioning(int[]array,int i,int k) {
        int l = 0;
        int h = 0;
        int MP = 0;
        int piv = 0;
        int temp = 0;
        boolean done = false;

        MP = i + (k - i) / 2;
        piv = array[MP];
        l = i;
        h = k;
        while (!done) {
            while (array[1] < piv) {
                l++;
            }
            while (piv < array[h]) {
                h--;
            }
            if (l >= h) {
                done = true;
            } else {
                temp = array[l];
                array[l] = array[h];
                array[h] = temp;
            }
            l++;
            h--;
        }
        return h;
    }

    static void quickSort(int[]array,int i, int k) {
        int j = 0;
        if (i >= k) {
            return;
        }
        j = partitioning(array, i, k);
        quickSort(array, i, j);
        quickSort(array, j + 1, k);
    }
}

