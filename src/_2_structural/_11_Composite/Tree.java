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
		
		nodeB.add(nodeC); // C 是 B 的儿子
		tree.root.add(nodeB); // B 添加到 A 树下的根节点下
		System.out.println("build the tree finished!");
		
		// 创建了一个A树，根节点A，A拥有子节点B， B节点拥有孙子节点C
	}
}
