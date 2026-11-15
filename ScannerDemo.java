
/**
 * @author scharffc
 * 
 */
public class ScannerDemo {

	private static int counter = 1;

	public static void main(String args[]) {
		String file1 = args.length > 0 ? args[0] : "prog1.jay";
		TokenStream ts = new TokenStream(file1);
		while (!ts.isEndofFile()) {
			Token tk = ts.nextToken();
			if (ts.isEndofFile() && tk.getValue().isEmpty())
				break;
			System.out.println("Token " + counter++ + " - Type: " + tk.getType() + " - Value: " + tk.getValue());
		}
	}
}
