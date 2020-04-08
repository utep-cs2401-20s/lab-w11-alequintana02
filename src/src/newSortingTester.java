import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class newSortingTester {

    @org.junit.jupiter.api.Test

    @Test
    void test1() {
        //example in pseudocode for newSorting
        newSorting ns = new newSorting();
        //create arrays
        int [] array = {3,10,1,5,2,7,4,9,8};
        int [] exp = {1,2,3,4,5,7,8,9,10};
        ns.newSorting(array,4);
        assertArrayEquals(exp,array);
    }

    @Test
    void test2() {
        //contains duplicated ints
        newSorting ns = new newSorting();
        int [] array = {1,7,1,6,9,6,3,5};
        int [] exp = {1,1,3,5,6,6,7,9};
        ns.newSorting(array,3);
        assertArrayEquals(exp,array);
    }

    @Test
    void test3() {
        //contains odd numbered A.length
        newSorting ns = new newSorting();
        int [] array = {1,7,6,9,8,3,2};
        int [] exp = {1,2,3,6,7,8,9};
        ns.newSorting(array,4);
        assertArrayEquals(exp,array);
    }

    @Test
    void test4() {
        //contains negative ints and duplicates
        newSorting ns = new newSorting();
        int [] array = {6,-9,3,-7,6,1};
        int [] exp = {-9,-7,1,3,6,6};
        ns.newSorting(array,4);
        assertArrayEquals(exp,array);
    }

    @Test
    void test5() {
        //
        newSorting ns = new newSorting();
        int [] array = {};
        int [] exp = {};
        ns.newSorting(array,4);
        assertArrayEquals(exp,array);
    }
}//closes tester class