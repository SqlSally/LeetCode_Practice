
/**
 * Given an array of integersA,a1, a2, . . . , an, design an efficient algorithm that finds the length
 * of thelongest  increasing  subsequence  of  the  array.
 * A  subsequence  ofAis  a  (not  necessarily  consecutive)sequence
 * of elements fromAthat can be obtained by deleting, but not rearranging, elements ofA.
 * Anincreasing sequence is one wherea i < aj for all 1≤i < j≤n
 * @
 *
 * author sally
 */
public class CoinChange {

  //subproblem
  public int coinChange(int[] coins, int amount) {
    //base case
    if (amount == 0) {
      return 0;
    }
    if (amount < 0) {
      return -1;
    }
    int[] results = new int[amount + 1];
    // results={0, infinity.....}
    for (int i = 0; i < results.length; i++) {
      results[i] = Integer.MAX_VALUE;
    }
    results[0] = 0;

    this.d(results, coins, amount);

    if (results[amount] == Integer.MAX_VALUE) {
      return -1;
    }
    return results[amount];
  }

  private int d(int[] results, int[] coins, int n) {
    int min = Integer.MAX_VALUE - 1;
    for (int coin : coins) {
      if (coin > n) {
        continue;
      }
      min = Math.min(d(results, coins, n - coin), min);
    }
    results[n] = Math.min(results[n], min + 1);
    return results[n];
  }

  public static void main(String[] args) {

    CoinChange coinChange = new CoinChange();
    int change = coinChange.coinChange(new int[]{1, 2, 5}, 11);
    System.out.println(change);

  }

}
