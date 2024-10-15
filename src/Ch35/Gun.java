package Ch35;

public abstract class Gun {
	public int bulletCnt;
	public int power;
	
	public abstract void fire(Unit unit);
	public abstract void reload(int bullet);
	
}
