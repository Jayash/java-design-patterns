package structural.proxy;

public class BookParserProxy implements Parser {

	private Parser parser;
	
	public Parser getParser() {
		return parser;
	}

	@Override
	public int getNumOfPages() {
		if(parser == null) {
			parser = new BookParser();
		}
		return parser.getNumOfPages();
	}
	
}
