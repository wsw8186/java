package CH36.Domain.Common.Dto;

public class SessionDto{
	private int sessionId;
	private String username;
	private String role;
	//디폴트생성자
	public SessionDto() {}
	public SessionDto(int sessionId, String username, String role) {
		super();
		this.sessionId = sessionId;
		this.username = username;
		this.role = role;
	}
	public int getSessionId() {
		return sessionId;
	}
	public void setSessionId(int sessionId) {
		this.sessionId = sessionId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "SessionDto [sessionId=" + sessionId + ", username=" + username + ", role=" + role + "]";
	}
	
	//모든인자 생성자
	//getter and setter
	//toString
	
}
