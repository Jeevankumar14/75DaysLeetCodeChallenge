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
// class Solution {
//     public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
//         Queue<TreeNode>queue=new LinkedList<>();
//         List<List<Integer>>res=new ArrayList<>();
//         if(root==null)return res;
//         queue.offer(root);
//         int count=1;

//         while(!queue.isEmpty()){
//             int size=queue.size();

//             List<Integer>subli=new ArrayList<>();
//             for(int i=0;i<size;i++){
//                 if(count%2!=0){
//                     if(queue.peek().right!=null){
//                         queue.offer(queue.peek().right);
//                     }
//                     if(queue.peek().left!=null){
//                         queue.offer(queue.peek().left);
//                     }
//                 }
//                 else{
//                     if(queue.peek().left!=null){
//                         queue.offer(queue.peek().left);
//                     }
//                     if(queue.peek().right!=null){
//                         queue.offer(queue.peek().right);
//                     }
//                 }

//                 subli.add(queue.poll().val);
//                 count++;
//             }
//             res.add(subli);
//         }
//         return res;
//     }
// }
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);

        boolean flag=true;
        while(!q.isEmpty()){
            int len=q.size();
            List<Integer>li=new ArrayList<>();
           

            for(int i=0;i<len;i++){
                TreeNode curr=q.poll();
                if(flag){
                    li.add(curr.val);
                }
                else{
                    li.add(0,curr.val);
                }


                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);


            }

            flag= !flag;
            res.add(li);
        }

        return res;
    }
}
