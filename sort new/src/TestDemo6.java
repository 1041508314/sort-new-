import org.omg.CORBA.AnySeqHelper;
import org.omg.CORBA.Object;

/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/29
 * @Content:
 */

/**
 * <T>是占位符  当前类是泛型类
 * 放数据的时候 可以自动进行类型检查
 * 取数据的时候 可以自动进行类型转换
 *
 * 泛型是怎么编译的？
 * 泛型是在编译时期的一种机制 -》 擦除机制   编译的时候，按照Object编译的
 * 不是替换成Object
 *
 * 泛型是有边界的
 * @param <T>
 *
 *     坑：1.不能new泛型类型的数组
 *     2.简单类型不能做泛型类型的参数
 *     MyStack<int> myStack3 = new MyStack<>();是错误的
 *     3.泛型类型的参数不参与类型的组成
 */

class MyStack<T>{
    public T[] elem;
    public int top;

    public MyStack() {
        //this.elem = new T[10];//不能new泛型类型的数组
        this.elem = (T[])new Object[10];
    }
    public void push(T val){
        this.elem[top] = val;
        this.top++;
    }
    public T peek(){
        return this.elem[this.top-1];
    }
}
public class TestDemo6 {
//    public static void main(String[] args) {
//        Person1 person = new Person1();
//        System.out.println(person);
//    }


    public static void main2(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(10);
        myStack.push(20);
        int ret = myStack.peek();
        System.out.println(ret);

        MyStack<String> myStack2 = new MyStack<>();
        myStack2.push("abcd");
        myStack2.push("efgh");
    }


    public static void main1(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push("hello");
        String ret = (String)myStack.peek();
        System.out.println(ret);
    }
}
