/**
*@author Santiago Montoya, Nelson A Barrios
**/
import java.util.Random;
public class Laboratorio2 {
    public static int ArraySum(int[] A) {          
        return ArraySumAux(A,0);
    } 
    public static int ArraySumAux(int[] A, int i) {
        if (i == A.length) {
            return 0;
        }
        return (A[i] + ArraySumAux(A, i+1));
    }  
    public static int ArrayMax(int[] A) {
        return ArrayMaxAux(A,A.length-1);
    }
    public static int ArrayMaxAux(int[] array, int i) {
        int max, temp;
        max=array[i];
        if(i==0) {
            max=array[i];
        }
        else {
            temp = ArrayMaxAux(array, i-1);
            if(temp>max) 
                max=temp;
        }
        return max;
    }
    // Taken from https://www.geeksforgeeks.org/insertion-sort/
    public static void InsertionSort(int[] A) {
        int n = A.length; 
        for (int i = 1; i < n; ++i) { 
            int key = A[i]; 
            int j = i - 1; 
            while (j >= 0 && A[j] > key) { 
                A[j + 1] = A[j]; 
                j = j - 1; 
            } 
            A[j + 1] = key; 
        } 
    }
      // Taken from www.cs.cmu.edu/      
    public static void mergeSort(int [ ] a) {
        mergeSort(a, a.length);
    }
    public static void mergeSort(int [ ] a, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];
        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);
        merge(a, l, r, mid, n - mid);        
    }
    private static void merge(int[ ] a, int[ ] l, int[] r, int left, int right )
    {
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }
    public static void main(String[] args) {
        int[] A = {1,5,3,2,6};
        int[] B = {1,5,3,2};
        int[] C = {1,5,2,6};
        int[][] Arrays = {A,B,C};  
        for (int[] X : Arrays) {        
            mergeSort(X);
            InsertionSort(X);     
        }
        testInsertion();
        testMerge();
    }
    //Test for Insertion algorithm
    public static void testInsertion() {  
        System.out.println("Test Insertion: ");
        for(int i=8000; i<=80000; i+=3000) {
            int[] arr = new int[i];
            Random rnd = new Random();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rnd.nextInt(1000 - 1 );
            }
            long inicio= System.currentTimeMillis();
            InsertionSort(arr);
            long fin= System.currentTimeMillis();
            long tiempo = fin-inicio;
            System.out.println(i+"-"+(fin-inicio));            
        }
    }
    //Test for Merge algorithm 
    public static void testMerge() {
        System.out.println("Test Merge: ");
        for(int i=10000; i<=100000000; i+=4000000) {        
            int[] arr = new int[i];
            Random rnd = new Random();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = rnd.nextInt(1000 - 1 );
            }
            long inicio= System.currentTimeMillis();
            mergeSort(arr);
            long fin= System.currentTimeMillis();
            long tiempo = fin-inicio;
            System.out.println(i+"-"+(fin-inicio));            
        }
    }    
}
