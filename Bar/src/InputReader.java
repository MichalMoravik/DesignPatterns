import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReader {
	// declaring the only instance
	private static BufferedReader instance;

	//	constructor not accessible for other classes - cannot be instantiate in a different class
	private InputReader() {}

	// The only instance can be created via this method.
	// if the instance is not instantiated yet, it will be done here, but only once (at the very beginning)
	private static BufferedReader getInputReader() {
		if (instance == null)
		{
			System.out.println("****");
			instance = new BufferedReader(new InputStreamReader(System.in));}
		return instance;
	}

	public static String getAnswer(String... questions) throws IOException {
		BufferedReader reader = getInputReader();
		for (String q :questions) {
			System.out.println(q);
		}
		return reader.readLine();
	}
}
