package dev.yzl.java.autoclose;

public class TryWithResourcesTest {

    public static void main(String[] args) throws Exception {

        try (CustomResource resource = new CustomResource("自定义资源")) {
            resource.use();
        }
    }
}
