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
        Queue<TreeNode>queue=new LinkedList<TreeNode>();
        List<List<Integer>>res=new ArrayList<>();
        if(root==null)return res;

        queue.offer(root);
        while(!queue.isEmpty()){
            int len=queue.size();
            List<Integer>li=new ArrayList<>();
            for(int i=0;i<len;i++){
                TreeNode curr=queue.poll();
                if(curr.left!=null){
                   queue.offer(curr.left);
                }
                if(curr.right!=null){
                    queue.offer(curr.right);
                }
                li.add(curr.val);
            }
            res.add(li);

        }
        return res;

    }
}