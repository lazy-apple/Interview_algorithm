package int_que5;

import java.util.Stack;

/**
 * 输入个链表的头结点，从尾到头反过来打印出每个结点的值。
 * @author LaZY（李志一）
 * @data 2018/12/24 - 22:40
 */
public class List_prin_reverse {
    /***
     * 反向打印链表
     *  1.从头结点迭代入栈
     *  2.从尾迭代出栈。
     * @param root 链表的头结点
     */
    public static void print(Lists root){
        Stack stack = new Stack();
        stackIn(root,stack);
        stackOut(stack);
    }

    /***
     * 链表从头结点依次入栈
     * @param root 链表头结点
     * @param stack 栈容器
     */
    public static void  stackIn(Lists root,Stack stack){
        while (root!=null){
            stack.push(root);
            root = root.next;
        }
    }

    /***
     * 链表从尾部依次出栈并打印
     * @param stack 栈容器
     */
    public static void stackOut (Stack stack){
        while(!stack.empty()){
         Lists root = (Lists) stack.pop();
            System.out.print(root.value+" ");
        }
    }

    public static void main(String[] args) {
        Lists root = new Lists();
        root.value = 1;
        root.next = new Lists();
        root.next.value = 2;
        root.next.next = new Lists();
        root.next.next.value = 3;
        root.next.next.next = new Lists();
        root.next.next.next.value = 4;
        root.next.next.next.next = new Lists();
        root.next.next.next.next.value = 5;

        print(root);
    }

    /**
     * 内部类：链表
     */
    public static class Lists{
        public int value;
        public Lists next;
    }
}
