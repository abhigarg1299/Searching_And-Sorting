package Searching_And_Sorting;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr={-18,-12,-4,0,2,3,4,15,16,18,22,89};
        int target=5;
        int ans=ceilingOfNumber(arr,target);System.out.println(ans);
    }
    static int ceilingOfNumber(int []arr,int target)
    {
        int start=0;
        int  end=arr.length-1;
        // find whether array is sorting in ascending or descending
        boolean isAsc=arr[start]<arr[end];
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]==target)
            {
                return arr[mid];
            }
            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
            else
            {
                if (target > arr[mid]) {
                    end= mid -1;
                } else {
                    start= mid + 1;
                }

            }
        }
        return arr[start];
    }
}
