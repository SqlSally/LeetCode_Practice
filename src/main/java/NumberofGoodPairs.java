
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sally
 */
public class NumberofGoodPairs {

  public static int numIdenticalPairs(int[] nums) {

    HashMap<Integer, Integer> pairs = new HashMap<>();
    int pair = 0;
    for (int num : nums) {
      if (pairs.containsKey(num)) {
        pairs.put(num, pairs.get(num) + 1);
        continue;
      }
      pairs.put(num, 1);
    }
    for (Map.Entry<Integer, Integer> entry : pairs.entrySet()) {

      pair = pair + ((entry.getValue() - 1) * entry.getValue()) / 2;

    }
    return pair;

  }

  public static void main(String[] args) {
    int[] nums = new int[]{1, 1, 1, 2, 3, 1};
    System.out.println(NumberofGoodPairs.numIdenticalPairs(nums));
  }
}
