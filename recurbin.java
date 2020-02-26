import java.util.*;
class recurbin {

        static int binarySearch(int arr[], int l, int r, int key)
        {
            if (r >= l) {
                int mid = l + (r - l) / 2;
                if (arr[mid] == key)
                    return mid;
                if (arr[mid] > key)
                    return binarySearch(arr, l, mid - 1, key);
                return binarySearch(arr, mid + 1, r, key);
            }
            return -1;
        }
    public static void main(String args[])
    {
        Scanner  s=new Scanner(System.in);
        System.out.println("Enter number of elements in the array");
        int n=s.nextInt();
        System.out.println("Enter the elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("ENter the element to be searched");
        int key=s.nextInt();
        int result = binarySearch(arr, 0, n - 1, key);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}