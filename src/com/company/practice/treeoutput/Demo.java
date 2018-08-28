package com.company.practice.treeoutput;

import java.io.File;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) throws IOException {
        TreeStructure tree = new TreeStructure();
        System.out.println(tree.getTreeStructure(new File("/home/irina/Projects/alevelcourse")));
    }
}

