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
    private int data4 = 4;
    //实例内部类 -》 看作是一个外部类的普通实例内部类成员
    static class InnerClass{
        public int data3 = 3;
        //public static int a = 99;这个是错误的
        //实例内部类中不可以定义静态的数据成员
        //public static final int a = 99;但final修饰的可以 final修饰是在编译时期已经初始化好了 变成常量了
        public OuterClass out;
        public  InnerClass(OuterClass out){
            this.out = out;
        }
        public void func(){
            //实例内部类有额外的开销  实例内部类包含外部类的this
            System.out.println(this.out.data1);
            //实例内部类需要外部类引用new一下
//            System.out.println(OuterClass.this.data1);//this是一个静态的引用
            //System.out.println(OuterClass.this.data1);//不能识别 静态的不依赖对象
            //静态内部类不能访问外部类的非静态数据成员
            System.out.println(data2);
            System.out.println(data3);
            System.out.println(this.out.data4);

//
//            System.out.println("Innerclass func");
        }
    }
}
public class TestDemo5 {
    public static void main(String[] args) {
//        InnerClass innerClass = new InnerClass();
        //静态内部类需要这样做
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(outerClass);
        innerClass.func();
    }
//    public static void main1(String[] args) {
//        OuterClass outerClass = new OuterClass();
//        OuterClass.InnerClass innerClass = outerClass.new InnerClass();//需要依赖外部类的引用
//        innerClass.func();
//    }
}
