package com.zhouxiang;

import java.util.LinkedList;

/**
 * @author zhouxiang12
 * @date 2022/10/27 4:30 PM
 **/
public class TreeNode {


          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x,TreeNode left,TreeNode right) { val = x;
            this.left=left;
            this.right=right;
          }

    public void firstNode(TreeNode treeNode){
              if(treeNode!=null){
                  System.out.println(treeNode.val);
                  firstNode(treeNode.left);
                  firstNode(treeNode.right);
              }

    }
    public void wideNode(TreeNode treeNode){
        LinkedList<TreeNode> linkedList=new LinkedList<>();
        linkedList.offer(treeNode);
        while (!linkedList.isEmpty()){
            TreeNode poll = linkedList.poll();
            System.out.println(poll.val);
            if(poll.left!=null){
                linkedList.offer(poll.left);
            }
            if(poll.right!=null){
                linkedList.offer(poll.right);
            }
        }
    }
    public void lastNode(TreeNode treeNode){
        if(treeNode!=null){
            lastNode(treeNode.left);
            lastNode(treeNode.right);
        }
        System.out.println(treeNode.val);
    }
    public void middleNode(TreeNode treeNode){

        if(treeNode.left!=null){
            middleNode(treeNode.left);
        }
//        System.out.println( treeNode.val);
        if(treeNode.right!=null){
            middleNode(treeNode.right);

        }
        System.out.println( treeNode.val);

    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1,new TreeNode(2,new TreeNode(4,null,null),new TreeNode(5,null,null)),new TreeNode(3,new TreeNode(6,null,null),new TreeNode(7,null,null)));
       treeNode.middleNode(treeNode);
    }
}
