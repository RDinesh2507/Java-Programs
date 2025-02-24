class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lt = maxDepth(root.left);
        int rt = maxDepth(root.right);
        return 1 + Math.max(lt, rt);
    }
}
