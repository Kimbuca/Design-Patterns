package Decorator;

public class Main {
	
	
	public static void main(String[] args) {
		MessageTransformer sm = new SimpleMessage("Mensaje Simple");
		System.out.println("Base message:" + sm.getMessage());
		
		
		//I want now a transformer that converts to UpperCase and encypts.
		MessageTransformer sm2 = new EncryptTransformer(new UppercaseTransformer(sm));
		System.out.println(sm2.formatMessage());
		
		//I want now a transformer that converts to LowerCase and enclose in html.
		MessageTransformer sm3 = new HtmlTransformer(new LowercaseTransformer(sm));
		System.out.println(sm3.formatMessage());
	}

}
