package chapter07_OOP02;

interface HealAble {}

class Champion02{
	private final int maxHp;
	private int nowHp;
		
	Champion02(){
		this.nowHp = 1000;
		this.maxHp = 1000;
	}
	
	Champion02(int maxHp, int nowHp){
		this.maxHp = maxHp;
		this.nowHp = nowHp;
	}
	
	public int getMaxHp() {
		return maxHp;
	}
	
	public int getNowHp() {
		return nowHp;
	}
	
	public int incNowHp() {
		return nowHp++;
	}
}

class Sup extends Champion02{	
	Sup(){}
	
	Sup(int maxHp, int nowHp){
		super(maxHp, nowHp);
	}
}

class Ad extends Champion02{
	Ad(){}
	
	Ad(int maxHp, int nowHp){
		super(maxHp, nowHp);
	}
}
class Bard extends Sup implements HealAble{	
	Bard(){}
	
	Bard(int nowHp){
		super(1675, nowHp);
	}
	public String toString() {
		return"Bard";
	}
}

class Sivir extends Ad{	
	Sivir(int nowHp){
		super(1300, nowHp);
	}
	public String toString() {
		return"Sivir";
	}
}

class DrMundo extends Ad implements HealAble{
	 DrMundo(){}
	 
	 DrMundo(int nowHp){
			super(1300, nowHp);
		}
	 public String toString() {
			return"Dr.Mundo";
		}
 }

class Heal implements HealAble{
	public void heal(HealAble h){
		if(h instanceof Champion02) {
			Champion02 c = (Champion02) h;
			if(c.getNowHp() >= c.getMaxHp()) {
				System.out.println(c+" is already healthy");
			}
			else if(c.getNowHp() < c.getMaxHp() ) {
				System.out.println(c+" is healing now.");
				System.out.println(c.getNowHp());
				for(c.getNowHp(); c.getNowHp() < c.getMaxHp(); c.incNowHp()) {
					if((c.getMaxHp()-c.getNowHp())%100 == 0) {
						System.out.println(c.getNowHp());
					}
					else if(c.getMaxHp() - c.getNowHp() < 100) {
						System.out.println(c.getMaxHp());
						break;
					}
				}
			}
		}
	}
}
 
public class HealableTest {
	public static void main(String[] args) {
		Bard b = new Bard(1020);
		Sivir s = new Sivir(500); 
		DrMundo d = new DrMundo(1300);
		
		Heal h = new Heal();
		
//		h.heal(c);	heal메소드 사용 불가.
		h.heal(d);
		h.heal(b);
	}
}
