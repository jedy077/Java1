interface Parserable {
	public abstract void parse(String fileName);
}

class ParserManager {
	public static Parserable getParser(String type){
		if (type.equals ("XML")) {
			return new XMLParser();
		} else {
			Parserable p = new HTMLParser();
			return p ;
		}
	}
}


class XMLParser implements Parserable {
	public void parse(String fileName) {
		/* 구문 분석 작업을 작성 */	
		System.out.println(fileName  + " - ML parsing completed");
	}
}

class HTMLParser implements Parserable {
	public void parse(String fileName){
		System.out.println( fileName + " - HTML parsing completed ");
	}
}


class ParserTest {
	public static void main (String[] args){
		Parserable parser = ParserManager.getParser("XML");
		parser.parse("document.xml");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2.html");
	}
}
