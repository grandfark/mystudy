package kr.or.kosa.dto;

public class MemoDTO {//model
	private String id, email ,content;

	public MemoDTO(){}//차후 usebean 객체 생성목적
	
	public MemoDTO(String id, String email, String content) {
		super();
		this.id = id;
		this.email = email;
		this.content = content;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "MemoDTO [id=" + id + ", email=" + email + ", content=" + content + "]";
	}
	
}
