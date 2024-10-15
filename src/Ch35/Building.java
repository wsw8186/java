package Ch35;

public abstract class Building {
	public int hp;
	public int shield;
	public int ammor;
	
	public abstract void BuildStructure();
	public abstract void underAttack(Unit unit);
}
