package club.ak.work.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ResponseResult implements Serializable{
	
	private static final long serialVersionUID = 7488634012944339568L;
	private Integer state;
	private String message;
	private Throwable throwable;
	private List<Map<String,Object>> datas;
	public ResponseResult() {
		super();
	}
	
	public ResponseResult(Integer state, String message) {
		super();
		this.state = state;
		this.message = message;
	}
	
	public ResponseResult(Integer state, String message, Throwable throwable, List<Map<String, Object>> datas) {
		super();
		this.state = state;
		this.message = message;
		this.throwable = throwable;
		this.datas = datas;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Throwable getThrowable() {
		return throwable;
	}
	public void setThrowable(Throwable throwable) {
		this.throwable = throwable;
	}
	public List<Map<String, Object>> getDatas() {
		return datas;
	}
	public void setDatas(List<Map<String, Object>> datas) {
		this.datas = datas;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datas == null) ? 0 : datas.hashCode());
		result = prime * result + ((message == null) ? 0 : message.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((throwable == null) ? 0 : throwable.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResponseResult other = (ResponseResult) obj;
		if (datas == null) {
			if (other.datas != null)
				return false;
		} else if (!datas.equals(other.datas))
			return false;
		if (message == null) {
			if (other.message != null)
				return false;
		} else if (!message.equals(other.message))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (throwable == null) {
			if (other.throwable != null)
				return false;
		} else if (!throwable.equals(other.throwable))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ResponseResult [state:" + state + ", message:" + message + ", throwable:" + throwable + ", datas:"
				+ datas + "]";
	}
	
	
}
