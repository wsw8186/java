package Ch15;

interface Remocon{
	int MAXVOL = 100; //수정불가 static final
	int MINVOL = 0;
	void On(); //추상메서드
	void Off();
	void setVol(int vol);
}

class Tv implements Remocon{
	int vol;
	
	@Override
	public void On() {
		System.out.println("TV를 켭니다");	
	}

	@Override
	public void Off() {
		System.out.println("TV를 끕니다");	
	}

	@Override
	public void setVol(int vol) {
		if(MAXVOL<=vol)
			this.vol = MAXVOL;
		else if(MINVOL>=vol)
			this.vol = MINVOL;
		else
			this.vol = vol;
		System.out.println("TV 볼륨 : " + this.vol);
	}
}

interface Browser{
	void SearchURL(String url);
}

class SmartTv extends Tv implements Browser{

	@Override
	public void SearchURL(String url) {
		System.out.println(url + " 로 이동합니다.");
	}
}

class Radio implements Remocon{
	int vol;
	
	@Override
	public void On() {
		System.out.println("RADIO를 켭니다");	
	}

	@Override
	public void Off() {
		System.out.println("RADIO를 끕니다");	
	}

	@Override
	public void setVol(int vol) {
		if(MAXVOL<=vol)
			this.vol = MAXVOL;
		else if(MINVOL>=vol)
			this.vol = MINVOL;
		else
			this.vol = vol;	
		System.out.println("RADIO 볼륨 : " + this.vol);
	}
}

public class C01InterfaceMain {
	
	public static void TurnOn(Remocon controller) {
		controller.On();
	}
	
	public static void TurnOff(Remocon controller) {
		controller.Off();
	}
	
	public static void setVolume(Remocon controller, int vol) {
		controller.setVol(vol);
	}
	
	public static void SearchWeb(Browser browser, String url) {
		browser.SearchURL(url);
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		SmartTv smartTv = new SmartTv();
		Radio radio = new Radio();
		TurnOn(tv);
		TurnOn(radio);
		TurnOn(smartTv);
		
		setVolume(tv,50);
		setVolume(radio,150);
		SearchWeb(smartTv,"www.naver.com");
		
		TurnOff(tv);
		TurnOff(radio);
		
	}
}
