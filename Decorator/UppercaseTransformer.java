package Decorator;

public class UppercaseTransformer extends TransformerDecorator{

	public UppercaseTransformer(MessageTransformer msgt) {
		super(msgt);
	}

	@Override
	public String getMessage() {
		return super.getMessage();
	}

	@Override
	public String formatMessage() {
		return msgt.formatMessage().toUpperCase();
	}

}
