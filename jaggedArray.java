import java.util.Scanner;
class JaggedArray {
    public static void main(String args[]) 
    {
        int[][] jaggedArray;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows for jagged array:");
        int numRows = sc.nextInt();
        jaggedArray = new int[numRows][];
        for (int i = 0; i < numRows; i++) {
            System.out.println("Enter the no. of columns for row " + i + ":");
            int numCols = sc.nextInt();
            jaggedArray[i] = new int[numCols];
        }
        for (int i = 0; i < jaggedArray.length; i++) 
        {
            for (int j = 0; j < jaggedArray[i].length; j++) 
            { 
                System.out.println("Enter the element of [" + i + "][" + j + "]:");
                jaggedArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nJagged Array Elements:");
        for (int i = 0; i < jaggedArray.length; i++) 
        {
            for (int j = 0; j < jaggedArray[i].length; j++)
            {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
