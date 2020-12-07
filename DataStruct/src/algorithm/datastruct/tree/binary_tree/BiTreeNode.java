package algorithm.datastruct.tree.binary_tree;
/**
 * 二叉树节点类
 * <功能详细描述> 
 * @Author: Songlin
 * @create: 2020/12/6-22:15
 */
public class BiTreeNode {
    // 节点的数据域
    private Object data;
    // 左子节点
    private BiTreeNode lnode;
    // 右子节点
    private BiTreeNode rnode;

    public BiTreeNode(){
        this(null);
    }
    public BiTreeNode(Object data, BiTreeNode lnode, BiTreeNode rnode) {
        this.data = data;
        this.lnode = lnode;
        this.rnode = rnode;
    }

    public BiTreeNode(Object data) {
        this(data,null, null);
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BiTreeNode getLnode() {
        return lnode;
    }

    public void setLnode(BiTreeNode lnode) {
        this.lnode = lnode;
    }

    public BiTreeNode getRnode() {
        return rnode;
    }

    public void setRnode(BiTreeNode rnode) {
        this.rnode = rnode;
    }
}
