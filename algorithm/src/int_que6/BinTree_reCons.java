package int_que6;

/**输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如：前序遍历序列｛ 1, 2, 4, 7, 3, 5, 6, 8｝和中序遍历序列｛4, 7, 2, 1, 5, 3, 8，6}，
 * 重建出下图所示的二叉树并输出它的头结点。
 * 
 * @author LaZY（李志一）
 * @data 2018/12/25 - 10:42
 */
public class BinTree_reCons {
    /***
     * 重建二叉树
     *
     *  1.输入检查
     *  2.构建（递归）
     *      参数：先序遍历数组，起始坐标，结束坐标；中序遍历数组，起始坐标，结束坐标。
     *      出口
     *      根据先序遍历获取根结点的值。
     *      根据根结点的值获取在中序遍历中的位置。
     *      创建真实根结点。
     *      递归计算左右孩子。
     *
     * @param pre 先序遍历结果集
     * @param mid 中序遍历结果集
     */
    public static BinaryTree  reconstruction(int pre[],int mid[]){
        if(check(pre,mid)){
            return recons(pre,0,pre.length-1,mid,0,mid.length-1);
        }else{
            System.out.println("输入不合法");
            return null;
        }
    }

    /***
     * 输入检查
     * @param pre 先序遍历结果集
     * @param mid 中序遍历结果集
     * @return
     */
    public static boolean check(int pre[],int mid[]){
        if(pre == null||mid == null||pre.length != mid.length){
            return false;
        }else{
            return true;
        }
    }


    /***
     * 重建二叉树（内部方法）
     * 左子树：
     *      先序遍历
     *          起点：根结点+1.   终点：根结点的左子树中所有节点的和。
     *       中序遍历
     *          起点：中序遍历的起点  终点：根结点的左侧
     *  右子树：
     *      先序遍历
     *          起点：根结点的左子树中所有节点的和+1   终点：先序遍历的终点
     *       中序遍历
     *          起点：根结点的右侧  终点：中序遍历的终点
     *
     * @param pre 先序遍历结果集
     * @param p_start 起始坐标
     * @param p_end 结束坐标
     * @param mid  中序遍历结果集
     * @param m_start 起始坐标
     * @param m_end 结束坐标
     * @return 二叉树根结点
     */
    public static BinaryTree recons(int pre[],int p_start,int p_end,int mid[],int m_start,int m_end){
        if(p_start>p_end){
            return null;
        }
        int value = getRootValue(pre,p_start);
        int index = getRootIndex_mid(value,mid);
        BinaryTree root = new BinaryTree(value);
        root.left = recons(pre,p_start+1,p_start+(index-m_start),mid,m_start,index-1);
        root.right = recons(pre,p_start+(index-m_start)+1,p_end,mid,index+1,m_end);

        return root;
    }

    /***
     * 根据先序遍历获得根结点的值
     * @param pre 先序遍历结果集
     * @return 根结点的值
     */
    public static int getRootValue (int pre[],int start){
        return pre[start];
    }

    /**
     * 在中序遍历的结果集中找到根结点的坐标
     * @param value 根结点的值
     * @param mid 中序遍历结果集
     * @return 根结点的坐标
     */
    public static int getRootIndex_mid(int value,int mid[]){
        int index = 0;
        for (int i = 0; i < mid.length; i++) {
            if(mid[i] == value){
                index = i;
            }
        }
        return index;
    }

    /**
     * 中序遍历打印二叉树
     * @param root
     */
    public static void print_mid(BinaryTree root){
        if(root!=null){
            print_mid(root.left);
            System.out.print(root.value+" ");
            print_mid(root.right);
        }
    }
    /**
     * 内部类：二叉树
     */
    public static class BinaryTree{
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree() {

        }

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
