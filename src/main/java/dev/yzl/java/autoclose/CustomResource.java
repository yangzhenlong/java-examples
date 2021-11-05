package dev.yzl.java.autoclose;

public class CustomResource implements AutoCloseable {

    private String name;

    public CustomResource(String name) {
        this.name = name;
    }

    public void use() {
        System.out.println(this.name + " 正在使用中...");
    }

    @Override
    public void close() throws Exception {
        System.out.println("资源已被关闭...");
    }

    @Override
    public String toString() {
        return "CustomResource{" +
                "name='" + name + '\'' +
                '}';
    }
}
