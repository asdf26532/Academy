package quiz;

public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void showInfo() {
		System.out.printf("%s (%d세)\n", name, age);
	}

	public void eat(String food) {
		String msg = "\n%s(이)가 %s(을)를 먹는다\n";
		System.out.printf(msg, name, food);
	}

	public void talkTo(Person tar) {
		String msg = "\n%s(이)가 %s에게 대화를 건다\n";
		System.out.printf(msg, name, tar.name);
	}
	
	public String getName() {
		return name;
	}
}
