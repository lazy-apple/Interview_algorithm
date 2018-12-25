package int_que7;

import java.util.Stack;

/**用两个栈实现一个队列。队列的声明如下，请实现它的两个函数appendTail 和deleteHead，
 * 分别完成在队列尾部插入结点和在队列头部删除结点的功能。
 * @author LaZY（李志一）
 * @data 2018/12/25 - 14:35
 */
public class TwoStack<T> {
    //第一个栈用于插入
    //第二个栈用于删除
    //
    //删除的时候：
    //1.把第一个栈中的元素弹出并压入第二个栈中。
    //2.删除第二个栈的栈顶

    Stack<T> stack1 = new Stack<>();
    Stack<T> stack2 = new Stack<>();

    public void  appendTail(T t){
        stack1.add(t);
    }

    public T deleteHead(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.add(stack1.pop());
            }
        }

        if(stack2.isEmpty()){
            throw new RuntimeException("No more element.");
        }

        return stack2.pop();
    }
}
