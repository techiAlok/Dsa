package Array2D;

public class printSpiral {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int endRow = arr.length-1, startRow = 0, endCol = arr[0].length-1, startCol = 0;
        while(startRow <= endRow && startCol <= endCol){
            //top
            for (int i = startRow; i <= endCol; i++) {
                System.out.print(arr[startRow][i]+"\t");
            }

            //left
            for (int i = startRow+1; i <= endRow; i++) {
                System.out.print(arr[i][endCol]+"\t");
            }

            //bottom
            for (int i = endCol-1; i >= startCol; i--) {
                System.out.print(arr[endRow][i]+"\t");
            }

            //right
            for (int i = endRow-1; i >= startRow+1; i--) {
                System.out.print(arr[i][startCol]+"\t");
            }

            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
}
