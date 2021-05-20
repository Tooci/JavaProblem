/**
 *  类初始化
 *  先初始化父类 静态方法赋值，静态代码块 5 1
 *  后初始化子类 10 6
 *  实例初始化 非静态方法赋值，非静态代码块 构造器方法 9 3 2  9 8 7
 */
public class p3 {
    public static void main(String[] args) {
        Son s1=new Son();
        System.out.println();
        //
        Son s2=new Son();
    }
}
// 1 super() 2 i=test() 3 非静态代码块 4 无参构造
class Father{
    private int i=test();
    private static int j=mehtod();

    static {
        System.out.println("(1)");
    }

    Father(){
        System.out.println("(2)");
    }
    {
        System.out.println("(3)");
    }

    public int test(){
        System.out.println("(4)");
        return 1;
    }

    public static int mehtod(){
        System.out.println("(5)");
        return 1;
    }
}
// 1 super() 2 i=test() 3 非静态代码块 4 无参构造 子类重写的test方法
class Son extends Father{
    private int i=test();
    private static int j=mehtod();

    static {
        System.out.println("(6)");
    }

    Son(){
        //super() 一定会调用父类构造器
        System.out.println("(7)");
    }
    {
        System.out.println("(8)");
    }

    public int test(){
        System.out.println("(9)");
        return 1;
    }

    public static int mehtod(){
        System.out.println("(10)");
        return 1;
    }
}
