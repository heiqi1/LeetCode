//二叉搜索树的中序遍历就是其自小到大的排序序列，所以只要记录遍历的数量，就可以找到kth小数
public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        if(root==null)return 0;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode node=root;
        int count=0;
        while(node!=null||!stack.empty()){
            if(node!=null){
                stack.push(node);
                node=node.left;
            }else{
                node=stack.pop();
                //对count进行自增
                count++;
                if(count==k)return node.val;
                node=node.right;
            }
        }
        return -1;
    }
}
