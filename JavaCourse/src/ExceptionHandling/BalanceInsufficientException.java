package ExceptionHandling;

public class BalanceInsufficientException extends Exception {
	
	public BalanceInsufficientException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return super.getMessage();
	}

}
