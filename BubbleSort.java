package Searching_And_Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));


    }

    static void bubbleSort(int [] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            boolean swapped;
            for(int j=1;j<=arr.length-i-1;j++)
            {
                swapped=false;
                if(arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
                if(swapped==false)
                {
                    break;
                }
            }

        }
    }
}
/* Time Complexity: Best Case O(N-1) when it is already Sorted .
Worst case :O(N^2)
Total Comparisons=(N-1)+(N-2)+(N-3)+(N-4)=4N-((N*(N-1))/2)
constant values are ignored
 */