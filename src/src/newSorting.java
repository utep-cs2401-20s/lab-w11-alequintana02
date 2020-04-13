public class newSorting {
/*************newSorting*************/
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
/*************mergeSortedHalves*************/
    void mergeSortedHalves(int[]array,int [] LH,int [] RH) {
     int iteratorL=0;
     int iteratorR=0;
      for (int i = 0; i < array.length; i++) {
         if (iteratorL == LH.length) {//need to check bounds of LH
             array[i] = RH[iteratorR]; //we populate the opposite array
             iteratorR++; continue;
         } if (iteratorR == RH.length) {//need to check bounds of RH
             array[i] = LH[iteratorL];//we populate the opposite array
             iteratorL++;continue;
         } if (LH[iteratorL] < RH[iteratorR]) {//want the smallest element to be first
             array[i] = LH[iteratorL];
             iteratorL++;continue;
         } else { //if LH iter isn't the smallest, then RH iter is
             array[i] = RH[iteratorR];
             iteratorR++;continue;
         }//closes else
      }//closes for loop
 }//closes merge method

/******************QUICKSORT*******************/
    void quickSort (int[] array, int start, int end) {
        //base case
        if (end-start<=0) {
            return;
        }//the following was adapted from Dr. Ceberio's notes on quick sorting
        int piv = array[start]; //we select the first element as the pivot
        int less = start;
        int more = end;
        while (less < more) {
            while (less <= end && array[less] <= piv)
                less++;
            while (more >= start && array[more] > piv)
                more--;
            if (less < more) {
                int temp = array[less];
                array[less] = array[more];
                array[more] = temp;
            }
        }//closes while
        int temp = array[start];
        array[start] = array[more];
        array[more] = temp;

        quickSort(array, start, more - 1);
        quickSort(array, more + 1, end);
    }
/******************QUICKSORT*******************/
    void quickSort(int[]array){
         quickSort(array,0,array.length-1);
    }
}//closes newSorting class

