public class newSorting {
    void newSorting(int[]array,int size){
if (array.length <= size) {
    quickSort(array);

} else {
    int mid = array.length / 2;
    int[] LH = new int[mid];
    int[] RH = new int[array.length - mid];
    int toPopulate = array.length - mid;
    for (int i = 0; i < LH.length; i++) {
        LH[i] = array[i];
    }
    for (int i = 0; i < RH.length - mid; i++) {
        RH[i] = array[i + toPopulate];
        i++;
    }
    newSorting(LH, size);
    newSorting(RH, size);
    mergeSortedHalves(array, LH, RH);
   }

}//closes newSorting

    /********MERGE SORT******/
    void mergeSortedHalves(int[]array,int [] LH,int [] RH) {
        int pointer1 = 0;
        int pointer2 = 0;
        int i = 0;
        while (pointer1 < LH.length && pointer2 < RH.length) {
            if (LH[pointer1] < RH[pointer2]) {
                array[i++] = LH[pointer1++];
            } else {
                array[i++] = RH[pointer2++];
            }
        } //closes while
        while (pointer1 < LH.length) {
            array[i++] = LH[pointer1++];
        }
        while (pointer2 < RH.length) {
            array[i++] = RH[pointer2++];
        }
    }//closes merge method

    /********QUICKSORT******/
     int partitioning(int[]array, int start, int end) {
        int piv = array[start]; //we select the first element as the pivot
        int part = start + 1;
        for (int i = start+1; i <= end; i++) {
            if (array[i] < piv) {
                if (i != part) {
                    int temp = array[part];
                    array[part] = array[i];
                    array[i] = temp;
                }
                part++;
            }
        }
        array[start] = array[part-1];
        array[part-1] = piv;

      return part - 1;
    }

    void quickSort(int[]array,int start, int end) {
        int part;
        if (start < end) {
            part = partitioning(array, start, end);
            quickSort(array, start, part-1);
            quickSort(array, part + 1, end);
        }
    }

    void quickSort(int[]array){
         quickSort(array,0,array.length);
    }
}//closes newSorting class

