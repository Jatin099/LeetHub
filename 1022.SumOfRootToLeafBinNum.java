// Simple Method
class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return sumRootToLeaf(root, 0);
    }
    public int sumRootToLeaf(TreeNode root, int sum){
        if(root == null) return 0;
        sum = (2 * sum) + root.val;
        if(root.left == null && root.right == null) return sum;
        return sumRootToLeaf(root.left, sum) + sumRootToLeaf(root.right, sum);
    }
}

// Recursive With Bitwise operator
class Solution {
    int rootToLeaf = 0;
    public void preorder(TreeNode r, int currNum){
        if(r!= null){
            currNum = (currNum << 1) | r.val;
            if(r.left == null && r.right == null){
                rootToLeaf += currNum;
            }
            preorder(r.left, currNum);
            preorder(r.right, currNum);
        }
    }
    
    public int sumRootToLeaf(TreeNode root) {
        preorder(root, 0);
        return rootToLeaf;
    }
}
