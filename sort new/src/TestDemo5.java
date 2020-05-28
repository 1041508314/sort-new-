/**
 * @Version 1.0
 * @Author:LiuXinYu
 * 内部类
 * 1.实例内部类
 * 2.静态内部类
 * 3.匿名内部类
 * @Date:2020/5/28
 * @Content:
 */
class OuterClass{
    public int data1 = 1;
    public static int data2 = 2;

    //实例内部类 -》 看作是一个普通的实例内部类成员
    class InnerClass{
        public int data1 = 11;
        public int data3 = 3;
        //public static int a = 99;这个是错误的
        //实例内部类中不可以定义静态的数据成员
        //public static final int a = 99;但final修饰的可以 final修饰是在编译时期已经初始化好了 变成常量了
        public void func(){
            //实例内部类有额外的开销  实例内部类包含外部类的this
            System.out.println(data1);
            System.out.println(OuterClass.this.data1);//this是一个静态的引用
            System.out.println(data2);
            System.out.println(data3);

            System.out.println("Innerclass func");
        }
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}
