package int_que6;

/**
 * @author LaZY（李志一）
 * @data 2018/12/25 - 12:28
 */
public class Test {
    public static void main(String[] args) {
        int[] preorder = {1, 2, 4, 7, 3, 5, 6, 8};
        int[] inorder = {4, 7, 2, 1, 5, 3, 8, 6};
        BinTree_reCons.BinaryTree root = BinTree_reCons.reconstruction(preorder, inorder);
        BinTree_reCons.print_mid(root);
        System.out.println();
        int[] preorder1 = {1, 2, 3, 4, 5};
        int[] inorder1 = {5, 4, 3, 2, 1};
        BinTree_reCons.BinaryTree root1 = BinTree_reCons.reconstruction(preorder1, inorder1);
        BinTree_reCons.print_mid(root1);
    }
}
