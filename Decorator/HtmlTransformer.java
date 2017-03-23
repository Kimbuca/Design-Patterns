package Decorator;

public class HtmlTransformer extends TransformerDecorator{

	
	public HtmlTransformer(MessageTransformer msgt) {
		super(msgt);
	}
	
	
	public String getMessage() {
		return msgt.getMessage();
	}

	@Override
	public String formatMessage() {
		return "<html><body>" +msgt.formatMessage() +"</body></html>";
	}
	

}
