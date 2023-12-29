import java.util.*;

/**
 * @ClassName 力扣
 * @Description TODO
 * @Author @O_o
 * @Date 2023-12-25 20:48
 * @Version 1.0
 */
public class likou {
    public static void main(String[] args) {
        int[] token ={1,1,1,2,2,3};
        int[] result =Solution.levelOrder(token,2);

    }
}
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> li=new LinkedList<>();
        queue.offer(root);
        int size=queue.size();
        TreeNode temp=root;
        while(size>0){
            List<Integer> ceng=new LinkedList<>();
            size=queue.size();
            while(size>0){
                temp=queue.poll();
                ceng.add(temp.val);
                if(temp.left!=null)
                    queue.offer(temp.left);
                if(temp.right!=null)
                    queue.offer(temp.right);
                size--;
            }
            li.add(ceng);
            size=queue.size();
        }

        return li;

    }
}
