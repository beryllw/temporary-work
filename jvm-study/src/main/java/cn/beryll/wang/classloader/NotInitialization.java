package cn.beryll.wang.classloader;

public class NotInitialization {
    public static void main(String[] args) {
//        System.out.println(SuperClass.value);
        SuperClass[] superClasses = new SuperClass[10];
    }
}
