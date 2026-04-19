/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int pindex=0;
    HashMap<Integer,Integer>map=new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }

        return construct(preorder,0,inorder.length-1);
    }

    public TreeNode construct(int []preorder,int left,int right){
        if(left>right)return null;

        int rootval=preorder[pindex++];
        TreeNode root=new TreeNode(rootval);

        int index=map.get(rootval);

        root.left=construct(preorder,left,index-1);
        root.right=construct(preorder,index+1,right);

        return root;



    }
}