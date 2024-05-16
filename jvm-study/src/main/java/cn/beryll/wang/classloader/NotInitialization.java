package cn.beryll.wang.classloader;

public class NotInitialization {
    public static void main(String[] args) {
        demo2();
    }

    public static void demo1() {
        //[Loaded cn.beryll.wang.classloader.SuperClass from file:/Users/wangjunbo/IdeaProjects/temporary-work/jvm-study/target/classes/]
        //[Loaded cn.beryll.wang.classloader.SubClass from file:/Users/wangjunbo/IdeaProjects/temporary-work/jvm-study/target/classes/]
        System.out.println(SubClass.value);
    }

    public static void demo2() {
        //[Loaded cn.beryll.wang.classloader.SuperClass from file:/Users/wangjunbo/IdeaProjects/temporary-work/jvm-study/target/classes/]
        SuperClass[] superClasses = new SuperClass[10];
    }

    public static void demo3() {
        // 常量传播优化，转化为对NotInitialization自身常量池的引用
        System.out.println(ConstClass.HELLOWORLD);
    }
}
