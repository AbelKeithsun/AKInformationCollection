package club.ak.work.service.exc;

public class UserNotFoundException extends ServiceException{
	private static final long serialVersionUID = 6847386122839047088L;
	private String message;

	public UserNotFoundException(String message) {
		super(message);
		this.message = message;
	}

	public UserNotFoundException() {
		super();
	}

	public UserNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
