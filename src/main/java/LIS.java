
import java.util.Arrays;

/**
 * Given an unsorted array of integers, find the length of longest increasing subsequence
 *
 * @author sally
 */
public class LIS {

  //subproblem
  public static int lengthOfLIS(int[] nums) {
    //base problem
    if (nums.length == 0) {
      return 0;
    }

    if (nums.length == 1) {
      return 1;
    }
    int[] L = new int[nums.length + 1];
    for (int i = 0; i < L.length; i++) {
      L[i] = 1;
    }
    for (int i = 1; i < nums.length; i++) {
      for (int j = 0; j < i; j++) {
        if (nums[j] < nums[i]) {
          L[i] = Math.max(L[j] + 1, L[i]);
        }
      }
    }
    Arrays.sort(L);
    return L[L.length - 1];
  }

  public static void main(String[] args) {

    System.out.println(LIS.lengthOfLIS(new int[]{0, 4, 12, 2, 10, 6, 9, 13, 3, 11, 7, 15}));
  }
}
