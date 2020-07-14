// Java Implementation

public class CoinInLineGame {

  // Class to find the maximum value.
  public static int Coin_in_a_line(int[] arr) {
    // Matrix to store max value.
    int[][] Max_Value = new int[arr.length][arr.length];

    // Filling the matrix using the above algorithm.
    for (int k = 0; k < arr.length; k++) {
      for (int i = 0, j = k; j < arr.length; i++, j++) {

        int x, y, z;
        if (i + 2 <= j) {
          x = Max_Value[i + 2][j];
        } else {
          x = 0;
        }
        if (i + 1 <= j - 1) {
          y = Max_Value[i + 1][j - 1];
        } else {
          y = 0;
        }
        if (i <= j - 2) {
          z = Max_Value[i][j - 2];
        } else {
          z = 0;
        }
        Max_Value[i][j] = Math.max(arr[i] + Math.min(x, y), arr[j] + Math.min(y, z));
      }
    }
    return Max_Value[0][arr.length - 1];
  }

  // Sample program
  public static void main(String[] arguments) {
    int[] array = {5, 16, 3, 7};
    System.out.println(Coin_in_a_line(array));
  }
}
