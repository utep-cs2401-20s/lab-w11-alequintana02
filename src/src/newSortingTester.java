import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class newSortingTester {

    @org.junit.jupiter.api.Test
// For the following, I really tried to implement the feedback I received from last week's lab. I understand my test cases are
// in need of improvement, and  I have tried to further explain my though process and
// I hope I achieved that with these test cases
    @Test
    public void test1() {
        //example in pseudocode for newSorting, will show if code works
        //passed: 11 ms
        //tested multiple times, and it took the longest out of all my test cases at 11 ms
        //could be explained because it was the largest array tested with 9 elements
        newSorting ns = new newSorting();
        int [] array = {3,10,1,5,2,7,4,9,8};
        int [] exp = {1,2,3,4,5,7,8,9,10};
        ns.newSorting(array,4);
        assertArrayEquals(exp,array);
    }

    @Test
    public void test2() {
        // want to test if mergedSortedHalves can sort it the array properly since it contains duplicated ints
        //additionally it will require the recursive QS to be called from the beginning since size is these size of the array (8)
        //passed: 4 ms
        newSorting ns = new newSorting();
        int [] array = {1,7,1,6,9,6,3,5};
        int [] exp = {1,1,3,5,6,6,7,9};
        ns.newSorting(array,8);
        assertArrayEquals(exp,array);
    }

    @Test
    public void test3() {
        //contains odd numbered A.length (7), want to test how newSorting will handle. Additionally, I want to test against
        //an incorrect expected array, where the values of 8 and 9 are switched.
        //failed: 4 ms (as expected)
        //did correctly detect that "array contents differ at index [5], expected: <9> but was: <8>"
        newSorting ns = new newSorting();
        int [] array = {1,7,6,9,8,3,2};
        int [] exp = {1,2,3,6,7,9,8};
        ns.newSorting(array,4);
        assertArrayEquals(exp,array);
    }

    @Test
    public void test4() {
        //contains negative ints and duplicates, testing if partitioning will properly sort values. Will have to sort -
        //until the array size is equal to size of 1, unlike my previous test cases where the size is > 3.
        //passed: time 4 ms
        newSorting ns = new newSorting();
        int [] array = {6,-9,3,-7,6,1};
        int [] exp = {-9,-7,1,3,6,6};
        ns.newSorting(array,1);
        assertArrayEquals(exp,array);
    }

    @Test
    public void test5() {
        //I wanted to see the system time for an already sorted list, I expect it to be the fastest of all test cases
        //passed: 4 ms
        //surprisingly, it was as fast as test2 with the same amount of elements (8), but that array was unsorted
        newSorting ns = new newSorting();
        int [] array = {1,2,3,4,5,6,7,8};
        int [] exp = {1,2,3,4,5,6,7,8};
        ns.newSorting(array,4);
        assertArrayEquals(exp,array);
    }
}//closes tester class