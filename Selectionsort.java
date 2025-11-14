public class Selectionsort {
    public static void main(String[] args) {
        int[] arr={20,10,60,30,40,10};
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex!=i){
                int temp =arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

            }
        
              System.out.print("Step " + (i+1) + ": ");
                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();
        }
    }
    
}
