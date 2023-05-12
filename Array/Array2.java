public class Array2{
    public static void main(String args[]){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.print("Array before transpose:\n");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
        for(int i = 0;i<3;i++){
            for(int j = i;j<3;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.print("\nArray after transpose:\n");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
