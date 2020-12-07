package algorithm.datastruct.tree.binary_tree;

/**
 * Title:二叉链式存储结构的二叉树
 * Desc:
 *
 * @Author: Songlin
 * @create: 2020/12/7-21:41
 */
public class BiTree {
    // 根节点
    private BiTreeNode root;
    public BiTree() {
        this.root = null;
    }
    public BiTree(BiTreeNode root) {
        this.root = root;
    }
    // 先序遍历构造一棵二叉树
    private static int index = 0;

    public BiTree(String preStr) {
        if (index >= preStr.length()) return;
        char c = preStr.charAt(index++);
        System.out.println(c);
        if (c != '#') {
            root = new BiTreeNode(c);
            root.setLnode(new BiTree(preStr).root);
            root.setRnode(new BiTree(preStr).root);
        } else {
            root = null;
        }
    }

    // 先序遍历二叉树的递归算法
    public void preRootTraverse(BiTreeNode T) {
        if (T != null) {
            System.out.print(T.getData());
            preRootTraverse(T.getLnode());
            preRootTraverse(T.getRnode());
        }
    }

    // 中序遍历二叉树的递归算法
    public void inRootTraverse(BiTreeNode T) {
        if (T != null) {
            inRootTraverse(T.getLnode());
            System.out.print(T.getData());
            inRootTraverse(T.getRnode());
        }
    }

    // 后序遍历二叉树的递归算法
    public void postRootTraverse(BiTreeNode T) {
        if (T != null) {
            postRootTraverse(T.getLnode());
            postRootTraverse(T.getRnode());
            System.out.print(T.getData());
        }
    }

    public BiTreeNode getRoot() {
        return root;
    }

    public void setRoot(BiTreeNode root) {
        this.root  = root;
    }
}
