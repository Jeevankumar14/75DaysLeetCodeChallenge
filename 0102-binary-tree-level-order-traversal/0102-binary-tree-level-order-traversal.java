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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>q=new LinkedList<TreeNode>();
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;

        q.offer(root);
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer>li=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode curr=q.poll();
                if(curr.left!=null){
                   q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
                li.add(curr.val);
            }
            res.add(li);

        }
        return res;

    }
}