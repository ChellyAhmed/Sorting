import java.util.Random;
import java.util.Scanner;

public class SortingClass {
    //Define the attributes
    int n; //Size
    int[] arr;

    //Define the constructor
    public SortingClass(int n) {
        this.n = n;
        arr = new int[n];
    }

    //Method to fill the array with random ints:
    public void fillRandom() {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
    }

    //Method to display all the elements
    public void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //Method for insertion sort
    public void insertionSort() {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                int j = i;
                int temp = arr[j];
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }

        }
    }

    //Method for Bubble sort
    public void bubbleSort() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }

    }

    //Method for selection sort
    public void selectionSort() {
        int temp;
        for (int i = 0; i < n; i++) {
            int min = i ;
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temp = arr[i] ;
            arr[i] = arr[min] ;
            arr[min] = temp;

        }
    }

    //Method for quick sort
    public void quickSort() {
        //TODO
    }

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        //Read the size n that will be used FOR ALL THE SORTING ALGORITHMS.
        System.out.print("Please input the size of n: ");
        int n = stdin.nextInt();
        SortingClass sort = new SortingClass(n);

        //We start by insertion sort
        sort.fillRandom();
        //To compute the execution time
        long start = System.nanoTime(); //Start time
        sort.insertionSort();
        long end = System.nanoTime(); //End time
        long executionTime = end - start;
        //For testing purposes, we will print the array after sorting it if n is small
        if (n <= 50) {
            System.out.println("The array after sorting: ");
            sort.display();
        }
        System.out.println("The execution time of Insertion sort is: " + executionTime);

        //We should create another unsorted array for the next methods.
        //We will keep the same n.

        //Bubble sort
        sort.fillRandom();
        //To compute the execution time
        start = System.nanoTime(); //Start time
        sort.bubbleSort();
        end = System.nanoTime(); //End time
        executionTime = end - start;
        //For testing purposes, we will print the array after sorting it if n is small
        if (n <= 50) {
            System.out.println("The array after sorting: ");
            sort.display();
        }
        System.out.println("The execution time of Bubble sort is: " + executionTime);

        //Selection sort
        sort.fillRandom();
        //To compute the execution time
        start = System.nanoTime(); //Start time
        sort.selectionSort();
        end = System.nanoTime(); //End time
        executionTime = end - start;
        //For testing purposes, we will print the array after sorting it if n is small
        if (n <= 50) {
            System.out.println("The array after sorting: ");
            sort.display();
        }
        System.out.println("The execution time of Selection sort is: " + executionTime);
    }

}
