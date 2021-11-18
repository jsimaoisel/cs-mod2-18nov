import java.net.URL;

public class Example {
    public static void main(String[] args) throws Exception {
        String envVar = System.getenv("VAR");
        String other = aFunction(envVar);
        URL url = new URL(other);
    }

    public static String aFunction(String v) {
        return v;
    }
}