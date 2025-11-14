public class Insertionsort {
    public static void main(String[] args) {
        int[] arr ={90,80,90,10};
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
             
        System.out.print("Step " + (i) + ": ");
                    for (int x : arr) System.out.print(x + " ");
                    System.out.println();
        }

    }
    
}
