package Decorator;

public class EncryptTransformer extends TransformerDecorator{

	public EncryptTransformer(MessageTransformer msgt) {
		super(msgt);
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return super.getMessage();
	}

	@Override
	public String formatMessage() {
		return msgt.formatMessage().replaceAll( "A", "q" )
	            .replaceAll( "E", "s" )
	            .replaceAll( "I", "k" )
	            .replaceAll( "O", "h" )
	            .replaceAll( "U", "r" );
	}

}
