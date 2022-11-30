package Dto;

//등록할때 사용할 클래스 : 사용자가 직접입력
public class RegisterRequest {
	private String email;
	private String password;
	private String confirmPassword;
	private String name;
		
	//getter /setter
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	//사용자정의 메소드
	public boolean isPasswordEqual() {
		return password.equals(confirmPassword);
		//비번  확인비번
	}
}
