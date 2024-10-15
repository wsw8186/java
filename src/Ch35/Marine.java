package Ch35;

public class Marine extends Unit{
	public int damageVal;
	public Gun myGun;
	
	Marine(){
		myGun = new Rifle();
	}
	
	public void setMyGun(Gun gun){
		this.myGun = gun;
	}
	
	@Override
	void move() {
		
		
	}

	@Override
	void UnderAttack(int damage) {
		
		
	}
	
	void attack(Unit unit) {
		
	}

}
