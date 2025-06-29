//TC: log(n)
//SC: O(1)

class BinarySearch { 
    // Returns index of x if it is present in arr[l.. r], else return -1 
    int binarySearch(int arr[], int l, int r, int x) 
    { 
        if(arr == null){
            return -1;
        }

        int left=l;
        int right = r;
        int mid = 0;
        
        while(left<=right){
            mid = left + (right - left)/2;

            if(arr[mid] == x){
                return mid;
            }
            else if(x>arr[mid]){
                left = mid+1;
            }
            else{
                right = mid-1;
            }
        }
        return -1;
    } 
}

class Exercise_1{
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        BinarySearch ob = new BinarySearch(); 
        int arr[] = { 2, 3, 4, 10, 40 }; 
        int n = arr.length; 
        int x = 40; 
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        if (result == -1) 
            System.out.println("Element not present"); 
        else
            System.out.println("Element found at index " + result); 
    } 
} 
