package _2_structural._11_Composite;

import javax.swing.plaf.synth.SynthStyle;

public class Tree {
	TreeNode root = null;
	
	public Tree(String name) {
		root = new TreeNode(name);
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC); // C �� B �Ķ���
		tree.root.add(nodeB); // B ��ӵ� A ���µĸ��ڵ���
		System.out.println("build the tree finished!");
		
		// ������һ��A�������ڵ�A��Aӵ���ӽڵ�B�� B�ڵ�ӵ�����ӽڵ�C
	}
}
