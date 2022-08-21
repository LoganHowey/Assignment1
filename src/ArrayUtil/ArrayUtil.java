package ArrayUtil;

import java.util.Arrays;

public class ArrayUtil {

    public static int[] fill(int size, int val) {
        int [] toFill = new int[size];
        for (int i = 0; i < toFill.length; i++) {
            toFill[i] = val;
        }
        return toFill;
    }
    public int[] copyOfRange(int[] original, int from, int to){
    int[] newArray = Arrays.copyOfRange(original, from, to);
    return newArray;
    }

    public int sum(int[] addends){
        int adding = 0;
        for(int i = 0; i < addends.length;i++){
            int test = addends[i] + adding;
            adding = test;
        }
        return adding;
    }

    public int sum(int[][] addends) {
        int[] new2dTo1d = new int[addends.length * addends[0].length];
        int k = 0;
        for (int i = 0; i < addends.length; i++) {
            int[] row = addends[i];
            for (int j = 0; j < row.length; j++) {
                new2dTo1d[k] = addends[i][j];
                k++;
            }
        }
        int adding = 0;
        for(int i = 0; i < new2dTo1d.length;i++){
            int test = new2dTo1d[i] + adding;
            adding = test;}
        return adding;
    }
    public static void main(String[] args) {
        ArrayUtil au = new ArrayUtil();
        int[] testArray = au.fill(5, 1);
        System.out.println(Arrays.toString(testArray));

        int[] newArray = au.copyOfRange(testArray, 0, 4);
        System.out.println(Arrays.toString(newArray));

        int sumOfArray = au.sum(testArray);
        System.out.println(sumOfArray);

        int[][] array2d = new int[][] {{0,1,2,3}, {4,5,6,7}};
        int sumOf2dArray = au.sum(array2d);
        System.out.println(sumOf2dArray);
    }
}