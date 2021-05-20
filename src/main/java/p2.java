
//饿汉式单例，直接创建对象，不存在线程安全问题
public class p2 {

    //1 构造器私有化
    //2 自行创建，静态变量保存
    //3 向外提供实例
    public static final p2 instance=new p2();
    private p2(){

    }
    //static {
       // try{//Properties pro new Properties();
    //    //pro.load(p2.class.getClassLoader().getRessourceAsStream())
    //   //instance=new p2(pro.getPropertty(""));
    // }catch(IOException e){
    // throw new RuntimeException}

    // }

    public static p2 getInstance(){
        return instance;
    }
}


//懒汉式单例，延迟创建对象，存在线程安全问题
class s1{
    //1 构造器私有化
    //2 静态变量保存唯一的实例
    //3 静态方法获取对象
    private static s1 instance;
    private s1(){

    }
   static s1 getInstance(){
        if (instance==null){
            instance=new s1();
        }
        return instance;
   }
}

//双检锁
 class s2{
    private static s2 instance;
    private s2(){

    }
   public static s2 getInstance(){
        if (instance==null){
            synchronized (s2.class){
                    if (instance==null){
                        instance=new s2();
                    }
            }
        }
        return instance;
    }
}

//静态内部类
class s3 {
    private static class pl5{
        private static final s3 INSTANCE=new s3();
    }
    private s3(){

    }
    public static final s3 getInstance(){
        return pl5.INSTANCE;
    }
}

//枚举
enum  s4{
   INSTANCE;
   public void anyMethod(){

   }

}


