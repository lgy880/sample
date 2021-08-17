package multi.com.f.dto;

public class MemberDto {
	private String id;
	private String pw;
	private String name;
	private String email;
	private int auth;

	public MemberDto(String id, String pw, String name, String email, int auth) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.auth = auth;
	}

	public MemberDto() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getAuth() {
		return auth;
	}

	public void setAuth(int auth) {
		this.auth = auth;
	}

}
