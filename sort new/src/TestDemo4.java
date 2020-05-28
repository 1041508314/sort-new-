/**
 * @Version 1.0
 * @Author:LiuXinYu
 * @Date:2020/5/28
 * @Content:
 */
class Animal{
    public void func(){
        System.out.println("Animal::func()");
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        new Animal(){
            @Override//可以重写方法
            public void func() {
                System.out.println("我重写了这个方法");
            }
        }.func();//匿名内部类
    }
}
