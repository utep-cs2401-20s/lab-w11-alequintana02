public class newSorting {
    void newSorting(int[]array,int size){
    if (array.length <= size) {
        quickSort(array);

    } else {
        int mid = array.length / 2;
        int[] LH = new int[mid];
        int[] RH = new int[array.length - mid];
        for (int i = 0; i < LH.length; i++) {
            LH[i] = array[i];
        }
        for (int i = 0; i < RH.length; i++) {
            RH[i] = array[i + mid];//Antoine helped me with this loop
        }
        newSorting(LH, size);
        newSorting(RH, size);
        mergeSortedHalves(array, LH, RH);
       }
}//closes newSorting

    /********MERGE SORT******/
    void mergeSortedHalves(int[]array,int [] LH,int [] RH) {
        int iteratorL = 0;
        int iteratorR = 0;
        while (iteratorL < array.length && iteratorR < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (LH[iteratorL] < RH[iteratorR]) {
                    array[i] = LH[iteratorL];
                    iteratorL++;
                }
                if (LH[iteratorL] > RH[iteratorR]) {
                    array[i] = RH[iteratorR];
                    iteratorR++;
                }
            }//closes for loop
        }//closes while
}//closes merge method

    /********QUICKSORT******/
     int partitioning(int[]array, int start, int end) {
        int piv = array[start]; //we select the first element as the pivot
        int part = start + 1;
        for (int i = start+1; i < end; i++) {
            if (array[i] < piv) {
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

