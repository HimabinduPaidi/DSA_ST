import java.util.Arrays;
class BoundaryTraversal {
    public static void main(String[] args) {
        int[][] arr= new int[5][5];
        int ct=1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j] = ct++;
            }

        }
        int top =0;
        int left =0;
        int right =arr[0].length-1;
        int bottom = arr.length-1;
        //top
        for(int j=left;j<=right;j++){
            System.out.print(arr[top][j]+" ");
        }
        System.out.println();
        //right
        for(int i=top+1;i<=bottom;i++){
            System.out.print(arr[i][right]+" ");
        }
        System.out.println();
        //bottom
        for(int j=right-1; j>=left;j--){
            System.out.print(arr[bottom][j]+" ");
        }
        System.out.println();
        //left
        for(int i=bottom-1; i>top;i--){
            System.out.print(arr[i][left]+" ");
        }
        System.out.println();


    }


    
}
