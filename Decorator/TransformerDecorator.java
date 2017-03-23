package Decorator;

public abstract class TransformerDecorator implements MessageTransformer{
	
	protected MessageTransformer msgt;
	
	
	public TransformerDecorator(MessageTransformer msgt){
		this.msgt = msgt;
	}
	
	@Override
	public String getMessage() {
		return msgt.getMessage();
	}

	@Override
	public String formatMessage() {
		return msgt.getMessage();
	}

	
	
	

}
