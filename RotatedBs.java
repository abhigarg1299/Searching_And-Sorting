package Searching_And_Sorting;

import Sortings.BinarySearch;

public class RotatedBs {
    public static void main(String[] args) {
    int []arr={4,5,6,7,0,1,2};
    int target=7;
    System.out.println(search(arr,target));
    }
    static int search(int []arr,int target)
    {
        int pivot=findPivot(arr);
        // if you didnot find a pivot, it means array id not rotated
        if(pivot==-1)
        {
            return binarySearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target)
        {
            return pivot;
        }
         if(target>arr[0])
        {
            binarySearch(arr,target,0,pivot-1);
        }


            return  binarySearch(arr,target,pivot+1,arr.length-1);

    }
    static int binarySearch(int []arr,int target,int start,int end)
    {
        while(start<=end)
        {
            //find the middle element
            //might be possible thet it exceeds the range
            // int mid=(start+end)/2;
            int mid= start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            }else if (target <arr[mid])
            {
                end=mid-1;
            }
            else
            {
                return mid;
            }
        }
        return -1;

    }
    static int findPivot(int[]arr)
    {
        int start=0;
        int end=arr.length-1;
        int mid= start+(end-start)/2;
        if(mid<end&&arr[mid]>arr[mid+1])
        {
                return mid;
        }
        if(mid>start&&arr[mid]<arr[mid-1])
        {
                return mid-1;
        }
        if(arr[start]>=arr[mid])
        {
            end=mid-1;

        }else
        {
            start=mid+1;

        }
        return -1;
    }

}
