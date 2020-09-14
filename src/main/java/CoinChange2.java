/*
 * Copyright 2020 sally.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 *
 * @author sally
 */
public class CoinChange2 {

  public int coinChange(int[] coins, int amount) {
    return dp(amount, coins);
  }

  int dp(int n, int[] coins) {

    //初始值
    if (n == 0) {
      return 0;
    }
    if (n < 0) {
      return -1;
    }

    //备忘录
    int[] memo = new int[n];

    for (int i = 1; i < memo.length; i++) {
      memo[i] = Integer.MAX_VALUE;
    }

    if (memo[n] < Integer.MAX_VALUE) {
      return memo[n];
    }

    int res = Integer.MAX_VALUE;

    for (int coin : coins) {

      //子问题
      int subproblem = dp(n - coin, coins);
      if (subproblem == -1) {
        continue;
      }
      res = Math.min(res, subproblem + 1);
    }

    if (res != Integer.MAX_VALUE) {
      memo[n] = res;
    }
    return memo[n];
  }

  public static void main(String[] args) {

    CoinChange2 coinChange = new CoinChange2();
    int change = coinChange.coinChange(new int[]{1}, 3);
    System.out.println(change);

  }

}
