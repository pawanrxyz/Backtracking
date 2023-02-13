public class BinarySearch {
    public static void binarySearch(int arr[],int key) {
        int si = 0,ei = arr.length;
        int mid = 0;

        while(si<=ei) {
            mid = (si+ei)/2;
             if(arr[mid] == key) {
                System.out.println("element found at index : "+mid);
             }
             if(arr[mid]<key) {
                si = mid+1;
             }
             else {
                ei = mid-1;
             }
        }
        if(si>ei) {
            System.out.println("Element not found : ");
        }
        
    }
    public static void main(String args[]) {
        int arr[] = {1,3,4,5,6,7,8};
        int key = 0;
        binarySearch(arr, key);
    }
    
}
