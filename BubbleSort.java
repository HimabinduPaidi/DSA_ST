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
        
        System.out.print("Step " + (i+1) + ": ");
                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();
    }
    }
    
}

