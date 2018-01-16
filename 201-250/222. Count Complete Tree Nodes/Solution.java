public class Solution {
    public int countNodes(TreeNode root) {
        return countNodes(root,-1,-1);
    }
    public int countNodes(TreeNode root,int left,int right){
        if(left==-1){
            TreeNode cur=root;
            left=0;
            while(cur!=null){
                left++;
                cur=cur.left;
            }
        }
        if(right==-1){
            TreeNode cur=root;
            right=0;
            while(cur!=null){
                right++;
                cur=cur.right;
            }
        }
        if(left==right) return (1<<left)-1;
        return 1+countNodes(root.left,left-1,-1)+countNodes(root.right,-1,right-1);
    }
}
