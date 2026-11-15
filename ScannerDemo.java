
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	private static int counter = 1;

	public static void main(String args[]) {
		String file1 = args.length > 0 ? args[0] : "prog1.jay";
		TokenStream ts = new TokenStream(file1);
		System.out.println(file1);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
