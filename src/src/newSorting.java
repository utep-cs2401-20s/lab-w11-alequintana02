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

/*************mergeSortedHalves*************/
    void mergeSortedHalves(int[]array,int [] LH,int [] RH) {
        int iteratorL = 0;
        int iteratorR = 0;//
        for (int i = 0; i < array.length; i++) {
            if (iteratorL == LH.length) {//need to check bounds of LH
                array[i] = RH[iteratorR]; //we populate the opposite array
            }
            if (iteratorR == RH.length) {//need to check bounds of RH
                array[i] = LH[iteratorL];//we populate the opposite array
                iteratorL++;
            }
            if (LH[iteratorL] < RH[iteratorR]) {//want the smallest element to be first
                array[i] = LH[iteratorL];
                iteratorL++;
            } else { //if LH iter isn't the smallest, then RH iter is
                array[i] = RH[iteratorR];
                iteratorR++;
            }
      }//closes for loop
 }//closes merge method

/******************QUICKSORT*******************/
        int partitioning (int[] array, int start, int end) {
            int piv = array[start]; //we select the first element as the pivot
           // int part = start + 1;
            while (start <= end){
                while (array[start] < piv){
                    start++;
                } while (array[end] > piv){
                    end++;
                } if (start <= end){
                    int temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;

                    start++;
                    end--;
                }
            }
            return end;
        }
           /* for (int i = start + 1; i < end; i++) {
                if (array[i] < piv) {
                    int temp = array[part];
                    array[part] = array[i];
                    array[i] = temp;
                }
                part++;
            }

            array[start] = array[part - 1];
            array[part - 1] = piv;

            return part - 1;
        }
           // start = start;
            //end = end;
        /*    boolean done = false;
            while (start <= end){
                while (array[start] < piv){
                    start++;
                }
                while (array[end] > piv){
                    end++;
                }
                if (end <= start){
                    int temp = array[start];
                    array[start] = array[end];
                    array[end] = temp;


                start++;
                end--;
            }
            }

           return end;
}
         //   int i = start - 1;
          //  for (int j= start; j < end-1; j++){
           //     if (array[j] <= piv){
            //        i++;
           /* int j = end+1;
            while (i < j) {
                for (i++; array[i] < piv; i++) ;
                for (j--; array[j] > piv; j--) ;
                if (i < j) {*/
            /*        int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i+1];
            array[i+1] = array[end];
            array[end] = temp;

            return i + 1;
        }
            //for (int j = start + 1; j < end; j++) {
          /*   //   if (array[j] <= piv) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
                int temp = array[i+1];
                array[i+1] = array[end];
                array[end] = temp;

         return i+1;*/
//}

        //int j = end;


 /*           while (i < j) {
                do {
                    i++;
                } while (array[i] <= piv);
                do {
                    j--;
                } while (array[j] > piv);
                if (i < j) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
            return j;*/
 //closes partitioning
       // int part = start + 1;

 /*       for (int i = start+1; i < end; i++) {
            if (array[i] < piv) {
                    int temp = array[part];
                    array[part] = array[i];
                    array[i] = temp;
                }
                part++;
            }

       array[start] = array[part-1];
        array[part-1] = piv;

      return part - 1;*/

    void quickSort(int[]array,int start, int end) {
        int part;
      //if (start >= end){
       //    return;
       //}
       //else
        if (start < end) {
            part = partitioning(array, start, end);
            quickSort(array, start, part-1);
            quickSort(array, part, end);
        }
 }
    void quickSort(int[]array){
         quickSort(array,0,array.length);
    }
}//closes newSorting class

