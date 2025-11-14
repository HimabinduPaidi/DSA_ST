public class BubbleSort {
    public static void main(String[] args) {
    int[] arr={20,10,60,30,40,10};
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        boolean sorted = true;
        for(int j=0;j<n-1-i;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                sorted =  false;
            }
        }
        if(sorted) break;
        }
         for (int x : arr) {
            System.out.print(x + " ");
    }
    
}

}