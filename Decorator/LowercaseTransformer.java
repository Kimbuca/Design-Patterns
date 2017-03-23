package Decorator;

public class LowercaseTransformer extends TransformerDecorator{

	public LowercaseTransformer(MessageTransformer msgt) {
		super(msgt);
	}

	@Override
	public String getMessage() {
		return msgt.getMessage();
	}

	@Override
	public String formatMessage() {
		return msgt.formatMessage().toLowerCase();
	}
	
	

}
