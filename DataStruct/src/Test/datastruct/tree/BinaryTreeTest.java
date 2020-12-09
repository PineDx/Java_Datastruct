package Test.datastruct.tree;

import algorithm.datastruct.tree.binary_tree.BiTree;

/**
 * Title:
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/7-21:51
 */
public class BinaryTreeTest {
    public static void main(String[] args) {
        BiTree tree = new BiTree("ABDECFG");
//        tree.preRootTraverse(tree.getRoot());
//        tree.inRootTraverse(tree.getRoot());
        tree.postRootTraverse(tree.getRoot());
    }
}
