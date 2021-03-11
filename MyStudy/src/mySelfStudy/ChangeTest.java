package mySelfStudy;

class Changes{
	int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	int changes;
	String str = "";
	
	Changes(){
		changes = 8090;
	}
	
	Changes(int changes){
		this.changes = changes;
	}

	public String getChanges(){
		for(int i=0; i<moneyUnit.length; i++) {
			str += moneyUnit[i]+"원:"+changes/moneyUnit[i]+"개 ";
			changes = changes%moneyUnit[i];
		}
		return str;
	}
}

public class ChangeTest {
public static void main(String[] args) {
		System.out.println(new Changes(123450).getChanges());
	}
}
