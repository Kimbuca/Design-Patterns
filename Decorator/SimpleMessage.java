package Decorator;

public class SimpleMessage implements MessageTransformer{
	
	private String msg;
	
	public SimpleMessage(String msg){
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		return this.msg;
	}

	@Override
	public String formatMessage() {
		return this.msg;
	}

}
