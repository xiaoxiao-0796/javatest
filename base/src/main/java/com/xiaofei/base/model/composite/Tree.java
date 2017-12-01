package com.xiaofei.base.model.composite;

public class Tree {

    TreeNode root;

    public Tree(String name){
        root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree tree = new Tree("A");

        TreeNode treeNode1= new TreeNode("B");
        TreeNode treeNode2= new TreeNode("C");
        treeNode1.add(treeNode2);
        treeNode2.setParent(treeNode1);
        tree.root.add(treeNode1);
        treeNode1.setParent(tree.root);
        System.out.println(tree.root);

    }
}
