
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

/**
 *
 * @author sally
 */
public class HandCards {

  public static boolean isNStraightHand(int[] hand, int W) {

    Arrays.sort(hand);
    Hashtable<Integer, Integer> cards = new Hashtable<>();

    for (int card : hand) {
      if (cards.containsKey(card)) {
        cards.put(card, cards.get(card) + 1);
      } else {
        cards.put(card, 1);
      }
    }
    //find the consecutive cards

    int count = 0;

    for (Map.Entry<Integer, Integer> entry : cards.entrySet()) {
      Integer key = entry.getKey();
      Integer value = entry.getValue();

      int min = value;
      for (int i = key + 1; i < i + W; i++) {
        if (!cards.containsKey(i)) {
          min = 0;
          break;
        } else {
          if (cards.get(i) < min) {
            min = cards.get(i);
          }
        }
      }
      count = count + min;

      if (count == 0) {
        break;
      }

      for (int i = key; i < i + W; i++) {
        cards.put(i, cards.get(i) - min);
      }
    }

    if (count > 0 && !cards.isEmpty()) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {

    int[] input = new int[]{2, 3, 4, 5};

    int W = 4;
    boolean nStraightHand = HandCards.isNStraightHand(input, W);
    System.out.println(nStraightHand);
  }

}
