package dev.yzl.java.pass_by_value;

import dev.yzl.java.domain.Example;

/**
 * 值传递
 */
public class PassByValue {

    public static void main(String[] args) {
        // 1.基本类型，值拷贝，所以是值传递
        int a = 1;
        // 将a的值拷贝给形参intParam
        setIntegerValue(a);
        System.out.println(a); // 1

        // 2.对象类型，调用后对象的值发生变化，不是值拷贝，是引用传递？？？
        Example obj = new Example("zhangsan", 22);
        setName(obj);
        System.out.println(obj); // Example{name='lisi', age=22}

        /**
         * 解释：
         *  调用 setName(Example example)，相当于把 obj 对象的内存地址，拷贝一份给形参 example
         *  而 setName 内部改变的对象的内容，并未改变对象的地址
         *  所以：对象内存地址的传递，仍然是「值传递」，而对地址对应的值的改变，Java 方法传递是不管的，只需要管地址未改变。
         */
    }

    public static void setIntegerValue(int intParam) {
        intParam = 10;
    }

    public static void setName(Example example) {
        example.setName("lisi");
    }
}
