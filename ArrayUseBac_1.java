public class ArrayUseBac_1 {
    public static void changeArr(int arr[],int i,int val) {
        if(i == arr.length-1) {
            printArray(arr);
            return;
        }
        //recuseion        
        arr[i] = val;
        changeArr(arr, i+1, val+1);
        arr[i] = arr[i]-2;
    }

    public static  void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArray(arr);
    }
}