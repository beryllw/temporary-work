package cn.beryll.wang.classloader;

public class SubClass extends SuperClass{
    static {
        System.out.println("SubClass init");
    }
}
