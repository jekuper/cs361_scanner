public class ParserDemo {

	public static void main(String[] args) {
		String file1 = args.length > 0 ? args[0] : "prog1.jay";
		TokenStream tStream = new TokenStream(file1);

		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());
	}
}