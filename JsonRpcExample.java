import com.googlecode.jsonrpc4j.JsonRpcHttpClient;
import java.net.URL;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class JsonRpcExample {

    public static void main(String[] args) throws Exception {
		
		// fill with github codespace link
		URI uri = URI.create("http://localhost:8080/jsonrpc"); 
		URL url = uri.toURL();
        JsonRpcHttpClient client = new JsonRpcHttpClient(url);

        Map<String, Object> namedParams = new HashMap<>();
        namedParams.put("milliseconds", 5);
        namedParams.put("seconds", 10);
		try {
			int sumResult = client.invoke("delay", namedParams, Integer.class);
			System.out.println(sumResult);
		} catch (Throwable e) {
			e.printStackTrace();
		}

    }
}