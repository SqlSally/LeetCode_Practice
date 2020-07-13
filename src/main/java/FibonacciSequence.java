
/**
 *
 * use FibonaccisSequence to understand Bottom up and Top down algorithm for DP
 *
 * @author sally
 */
public class FibonacciSequence {

  /**
   * Bottom down
   *
   * @param index
   * @return
   */
  int calculateFibonacci(int index) {

    int[] name = new int[index + 1];
    name[0] = 1;
    name[1] = 1;
    for (int j = 2; j <= index; j++) {
      name[j] = name[j - 1] + name[j - 2];
    }
    return name[index];
  }

  /**
   * Top down
   *
   * @param index
   * @return
   */
  int[] mom;

  int topdownFibonacci(int index) {

    mom = new int[index + 1];
    mom[0] = 1;
    mom[1] = 1;
    return f(index);
  }

  private int f(int index) {

    if (index >= 2 && mom[index] == 0) {
      mom[index] = f(index - 1) + f(index - 2);
    }

    return mom[index];
  }

}
