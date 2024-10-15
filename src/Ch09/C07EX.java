package Ch09;


class Profile{
	//속성
	private String name;
	private String addr;
	private String job;
	private String major;
	
	
	//생성자
		//1)디폴트생성자 삽입
		//2)모든 인자 받는 생성자 삽입 -> 각멤버에 대입
		//3)모든 인자 받는 생성자 삽입(가변인자사용할것) -> , 를기준으로 잘라내어 각속성에 저장
		//ex, "홍길동,대구,프로그래머,컴퓨터공학" ->[홍길동,대구,프로그래머,컴퓨터공학]
	
	public Profile() {}
	
	public Profile(String name, String addr, String job, String major) {
		this.name = name;
		this.addr = addr;
		this.job = job;
		this.major = major;
	}
	
	public Profile(String ...str) {
		for(String stri : str) {
			String[] result = stri.split(",");
			this.name = result[0];
			this.addr = result[1];
			this.job = result[2];
			this.major = result[3];
			
			//
			//this.name=arg[0];
		}
		
	}
	
	//기능
	//1) 속성은 private으로 설정, getter and setter 삽입
	//2) toString  재정의 
	//3) boolean isContain(String findstr) 함수 완성하기
	
	


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "Profile [name=" + name + ", addr=" + addr + ", job=" + job + ", major=" + major + "]";
	}

	boolean isContain(String findstr) {
		//findstr의 문자열이 각멤버인 name,addr,job,major 중 하나라도 포함되어 있으면 true 리턴
		//아니면 false 리턴
		if(name.contains(findstr)||addr.contains(findstr)||job.contains(findstr)||major.contains(findstr)) {
			return true;
		}
		return false;
	}
	//4)
	boolean isEquals(String str) {
		//all로 받은 문자열을 , 단위로 잘라내어(split(",")) 각각 나눠진 문자열이
		//name,addr,job,major 와 일치 하면 true
		//아니면 false 를 리턴
		String result[] = str.split(",");
		if(result[0].equals(name)&&result[1].equals(addr)&&result[2].equals(job)&&result[3].equals(major)) {
			return true;
		}
		return false;
		
	}


	
}


public class C07EX {

	public static void main(String[] args) {
		Profile hong = new Profile("홍길동,대구,프로그래머,컴퓨터공학");
		System.out.println(hong.toString());
		System.out.println("길동 포함여부 : " + hong.isContain("길동"));	//true
		System.out.println("컴퓨터 포함여부 : " + hong.isContain("컴퓨터"));	//true
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,대구,프로그래머,컴퓨터공학"));//false
		System.out.println("프로필 일치여부 : " + hong.isEquals("홍길동,울산,프로그래머,컴퓨터공학"));//false

	}

}
