
/**
 * Input: image = [[1,1,1],[1,1,0],[1,0,1]] sr = 1, sc = 1, newColor = 2 Output:
 * [[2,2,2],[2,2,0],[2,0,1]] Explanation: From the center of the image (with position (sr, sc) = (1,
 * 1)), all pixels connected by a path of the same color as the starting pixel are colored with the
 * new color. Note the bottom corner is not colored 2, because it is not 4-directionally connected
 * to the starting pixel.
 *
 * The length of image and image[0] will be in the range [1, 50]. The given starting pixel will
 * satisfy 0 <= sr < image.length and 0 <= sc < image[0].length. The value of each color in
 * image[i][j] and newColor will be an integer in [0, 65535].
 *
 * @author sally
 */
public class May11FloodFill {

  private static final int[] X = new int[]{0, 1, 0, -1};

  private static final int[] Y = new int[]{1, 0, -1, 0};

  private int[][] image;

  private boolean[][] visited;

  private int originColor;

  private int newColor;

  /**
   * see if the point is visitable
   *
   * @param row
   * @param column
   * @return
   */
  private boolean visitable(final int row, final int column) {
    return row >= 0 && row < this.image.length
            && column >= 0 && column < this.image[0].length
            && this.image[row][column] == this.originColor
            && !this.visited[row][column];
  }

  /**
   * move
   *
   * @param row
   * @param column
   */
  private void dfs(final int row, final int column) {
    this.image[row][column] = this.newColor;
    this.visited[row][column] = true;
    for (int i = 0; i < X.length; ++i) {
      final int r = row + X[i];
      final int c = column + Y[i];
      if (this.visitable(r, c)) {
        this.dfs(r, c);
      }
    }
  }

  public int[][] floodFill(final int[][] image, final int sr, final int sc, final int newColor) {
    this.image = image;
    this.originColor = image[sr][sc];
    this.newColor = newColor;
    this.visited = new boolean[image.length][image[0].length];
    this.dfs(sr, sc);
    return image;
  }
}
