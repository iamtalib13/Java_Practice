import java.util.Arrays;

public class RotateMatrix {
    public static void main(String[] args) {

        int[][] matrix = { { 1, 2 ,3}, { 4, 5, 6 }, { 7, 8, 9 } };
        //Displaying Initial array
        for (int[] i:matrix)
        {
            System.out.println(Arrays.toString(i));

        }

        int n = matrix.length;
        //----------------------------------------------------
        for (int layer = 0; layer < n / 2; layer++) {
            int first= layer;
            int last= n - 1 - layer;
            for(int i = first; i < last; i++) {
                int offset = i - first;
                int top= matrix[first][i]; //save top
                //left -> top
                matrix[first][i] = matrix[last-offset][first];
                //bottom -> left
                matrix[last-offset][first]=matrix[last][last-offset];
                //right -> bottom
                matrix[last][last-offset] = matrix[i][last];
                //top -> right
                matrix[i][last] = top; // right<- saved top
            }
        }
        System.out.println("---------------------------------------");

        for (int[] i:matrix)
        {
            System.out.println(Arrays.toString(i));

        }
    }
}



