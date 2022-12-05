package com.zhouxiang;

import java.util.*;

public class Test extends Thread {
	//  private Producer p=new Producer(product)
	@Override
	public void run() {
//String s;
//StringBuilder builder;
//builder.
//CharSequence s.toCharArray();
		char a = '%';
	}

//	void trackBack(int n, List<CharSequence> charList, List<List<char>> res, int first) {
//
//
//	}
public static void main(String[] args) {
	int [] data=new int[]{4,-2};
	System.out.println("args = " + Arrays.toString(maxSlidingWindow(data,2)));
}
	public static int[] maxSlidingWindow(int[] nums, int k) {
		int length = nums.length;
		int[] res = new int[length - k + 1];
		PriorityQueue<Integer> quene = new PriorityQueue<>((o1,o2)->o2-o1);
		int j = 0;
		for (int i = 0; i < length; i++) {
			if (i >= k&&!quene.isEmpty()) {
				res[j] = quene.peek();
				j++;
				quene.remove(nums[i - k]);
			}
			quene.offer(nums[i]);

			if(i==length-1&&!quene.isEmpty()&&nums[i]>=quene.peek()){
				res[j]= nums[i];
			}
		}
		Node head=new Node();
		Node headNew=null;
		if(head==null){
			return  null;
		}
//		Node temp=new Node(head, head.value);
		Node cur=head,pre=null;
		while(cur!=null){
			//保存下一节点
             Node temp=cur.next;
			 //
			 cur.next=pre;
			 pre=cur;
			 cur=temp;
		}
		return res;

	}
	static class Node{
		private Node next;
		private int value;
		public Node(Node next ,int value){
			this.next=next;
			this.value=value;
		}
		public Node(){

		}
	}
}