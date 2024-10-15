package Ch35;

public class Factory extends Building implements ICanFly {

	AddOn addOn;
	
	Factory(){}
	
	void setAddOn(AddOn addOn) {
		this.addOn = addOn;
	}
	
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void lend() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void BuildStructure() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void underAttack(Unit unit) {
		// TODO Auto-generated method stub
		
	}

}
