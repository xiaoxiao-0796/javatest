package com.xiaofei.base.model.composite;

import lombok.Getter;
import lombok.Setter;

import java.util.Vector;

@Getter
@Setter
public class TreeNode {

    private String name;

    private TreeNode parent;

    private Vector<TreeNode> children = new Vector<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public void add(TreeNode treeNode){
        children.add(treeNode);
    }

}
