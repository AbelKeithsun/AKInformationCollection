package club.ak.work.service.exc;

public class UsernameNotFound extends ServiceException{
	
	private static final long serialVersionUID = -5358858813086964424L;
	private String message;
	public UsernameNotFound() {
		super();
	}

	public UsernameNotFound(String message) {
		super(message);
		this.message=message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
