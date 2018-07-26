package club.ak.work.service.exc;

public class DataWriteFailedException extends ServiceException{
	
	private static final long serialVersionUID = 2501818508729343252L;
	private String message;

	public DataWriteFailedException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
