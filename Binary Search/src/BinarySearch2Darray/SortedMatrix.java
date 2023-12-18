package BinarySearch2Darray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int [][] arr = {
            {12,13,45},
            {46,49,50},
            {56,86,98}
        };
        System.out.println(Arrays.toString(Search(arr,50)));
    }
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd ,int target) {
    while(cStart <= cEnd) {
        int mid = cStart + (cEnd - cStart) / 2;
        if (matrix[row][mid] == target) {
            return new int[]{row, mid};
        }
        if(matrix[row][mid] < target){
            cStart = mid + 1;
        } else {
            cEnd = mid - 1;
        }
    }
    return new int[]{-1,-1};
    }

    static int[] Search(int[][] matrix, int target) {
        int rows = matrix.length;
        int column = matrix[0].length;
        if(column == 0){
            return new int[]{-1,-1};
        }
        if( rows == 1){
            return binarySearch(matrix, 0, 0, column-1, target);
        }
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = column / 2;

        while (rStart < (rEnd - 1)) { // while this is true it will have more than 2 rows
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // now we have two rows
        // check whether the target is in the col of 2 rows
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        // search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][column - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, column - 1, target);
        }
        // search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid-1, target);
        } else {
            return binarySearch(matrix, rStart + 1, cMid + 1, column - 1, target);
        }

    }


}
