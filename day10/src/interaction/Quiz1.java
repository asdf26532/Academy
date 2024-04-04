package interaction;

class Unit {
	String name;
	int hp, atk;
	
	public Unit(String name, int hp, int atk) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
	}
	
	void showInfo() {
		String msg = "%s (hp %d, atk %d)\n";
		System.out.printf(msg, name, hp, atk);
	}
	
	void attack(Unit tar) {
		tar.hp -= atk;
		
		System.out.printf("\n%s가 %s를 공격\n", name, tar.name);
		tar.showInfo();
	}
}

public class Quiz1 {
	public static void main(String[] args) {
		// 아래 코드가 동작하게 클래스를 작성
		Unit war = new Unit("전사", 100, 10);		// 이름, hp, atk
		Unit wiz = new Unit("마법사", 70, 15);
		
		war.showInfo();		// 전사 (hp 100, atk 10)
		wiz.showInfo();		// 마법사 (hp 70, atk 15)
		
		war.attack(wiz);	// 전사가 마법사를 공격
							// 마법사 (hp 60, atk 15)
		
		wiz.attack(war);	// 마법사가 전사를 공격
							// 전사 (hp 85, atk 10)
		
	}
}
