package ex01collection.set;

import java.util.HashSet;
import java.util.Set;

class Person {// extends Object{
	String name;
	int age;

	public Person(String name, int age) {// super가 자동생성되면
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]\n";
	}

	@Override
	public boolean equals(Object obj) {//5. 밑의 Person의 이름과 나이 특성을 가져온다.
		if (obj instanceof Person) {// 모든 타입을 다 받아주는 자료형 오브젝트가 디폴트이다.

			Person temp = (Person) obj;

			return name.equals(temp.name) && age == temp.age;//6. 멤버변수와 비교하여 같은지 확인하고 이름과 나이 항목들이 같은 값을 가지고 있으면 중복으로 처리한다.
		}// 이름과 나이의 주소 값을 비교하여 동일하면 하나만 출력한다.
		return false;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
}// Person end

public class HashSetEx2 {
	public static void main(String[] args) {
		Set set = new HashSet();
		// set에 위반 되지만 equals를 오버라이드 한다.

		set.add(new Person("park", 30));//1. 이름이 다르니 다른 주소를 배정받는다.
		set.add(new Person("kims", 10));//2. 이름이 같으면 다 같은 주소로 배정 받는다.
		set.add(new Person("kims", 10));//3. 문자열의 특성상 900번지 다 같은 주소를 받는데 뒤에 나이가 다르기에 다 나오게 된다.
		set.add(new Person("kims", 89));//4. 나이라는 특성이 주어지면 920 910 930 이런식으로 다 다른 주소가 배정된다.
		set.add(new Person("kims", 10));

		set.add(new String("park"));
		set.add(new String("park"));

		System.out.println(set);
	}
}