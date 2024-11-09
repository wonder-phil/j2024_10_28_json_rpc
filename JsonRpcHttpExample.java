//import jsonrpc4j.JsonRpcHttpClient;
import java.net.URL;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class JsonRpcHttpExample {

    public static void main(String[] args) throws Exception {
        JsonRpcHttpClient client = new JsonRpcHttpClient(new URL("http://localhost:8080/jsonrpc"));

        // Example 1: Positional parameters
        Object[] params = new Object[]{"Hello", "World!"};
        String result = client.invoke("concat", params, String.class);
        System.out.println(result); // Output: "Hello World!"

        // Example 2: Named parameters
        Map<String, Object> namedParams = new HashMap<>();
        namedParams.put("a", 5);
        namedParams.put("b", 10);
        int sumResult = client.invoke("add", namedParams, Integer.class);
        System.out.println(sumResult); // Output: 15
    }
}