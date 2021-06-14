package qiminfo;

public class Main {

    public static int[][] initSequences(int size)
    {
        int[] seqStartWithZero = new int[size];
        for (int i=1; i<seqStartWithZero.length; i+=2) {
            seqStartWithZero[i] = 1;
        }

        int[] seqStartWithOne = new int[size];
        for (int i=0; i<seqStartWithOne.length; i+=2) {
            seqStartWithOne[i] = 1;
        }

        return new int[][]{seqStartWithZero, seqStartWithOne};
    }

    public static int getDifference(int[] arr1, int[] arr2)
    {
        int diff = 0;

        for (int i=0; i<arr1.length; i++) {
            if (arr1[i] != arr2[i])
                diff += 1;
        }

        return diff;
    }

    public static int getMinCoinSwap(int[] arr)
    {
        int[][] output = initSequences(arr.length);
        return Math.min(getDifference(arr, output[0]), getDifference(arr, output[1]));
    }

}
