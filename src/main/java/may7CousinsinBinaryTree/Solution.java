package may7CousinsinBinaryTree;

public class Solution {

  public boolean isCousins(TreeNode root, int x, int y) {

    Calculation depthx = depth(root, x, 0, null);
    Calculation depthy = depth(root, y, 0, null);

    return depthx.deepth == depthy.deepth && depthx.parent != depthy.parent;
  }

  private Calculation depth(TreeNode root, int val, int d, TreeNode parent) {

    if (root.val == val) {
      return new Calculation(d, parent);
    }

    if (root.left != null) {
      Calculation depth = depth(root.left, val, d + 1, root);
      if (depth != null) {
        return depth;
      }
    }

    if (root.right != null) {
      Calculation depth = depth(root.right, val, d + 1, root);
      if (depth != null) {
        return depth;
      }
    }
    return null;
  }

  private class Calculation {

    int deepth;

    TreeNode parent;

    public Calculation(int deepth, TreeNode parent) {
      this.deepth = deepth;
      this.parent = parent;
    }
  }
}
