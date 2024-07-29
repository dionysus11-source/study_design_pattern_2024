package dynamic_proxy;

import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {
	HashMap<String, Person> datingDB = new HashMap<String, Person>();
    public static void main(String[] args) {
        MatchMakingTestDrive test = new MatchMakingTestDrive();
        test.drive();
    }

    public MatchMakingTestDrive() {
        initializeDatabase();
    }

    public void drive() {
        Person kim = getPersonFromDatabase("kim java");
        Person ownerProxy = getOwnerProxy(kim);
        System.out.println("이름:  " + ownerProxy.getName());
        ownerProxy.setInterests("볼링, 바둑");
        System.out.println("본인 프록시에 관심 사항을 등록합니다.");
        try {
            ownerProxy.setGeekRating(10);
        } catch (Exception e) {
            System.out.println("본인 프록시에는 괴짜 지수를 매길 수 없습니다.");
        }
        System.out.println("괴짜 지수 " + ownerProxy.getGeekRating());

        Person nonOwnerProxy = getNoneOwnerProxy(kim);
        System.out.println("이름:  " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("볼링, 바둑");
        } catch (Exception e) {
            System.out.println("타임 프록시에는 관심 사항을 등록할 수 없습니다.");
        }
        nonOwnerProxy.setGeekRating(3);
        System.out.println("타인 프록시에 괴짜 지수를 매깁니다.");
        System.out.println("괴짜 지수 " + ownerProxy.getGeekRating());
    }

	private Person getPersonFromDatabase(String name) {
		return (Person)datingDB.get(name);
	}

    private void initializeDatabase() {
		Person joe = new PersonImpl();
		joe.setName("kim java");
		joe.setInterests("cars, computers, music");
		joe.setGeekRating(7);
		datingDB.put(joe.getName(), joe);

		Person kelly = new PersonImpl();
		kelly.setName("Kelly Klosure");
		kelly.setInterests("ebay, movies, music");
		kelly.setGeekRating(6);
		datingDB.put(kelly.getName(), kelly);
	}

    private Person getOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new OwnerInvocationHandler(person));
    }
    
    private Person getNoneOwnerProxy(Person person) {
        return (Person) Proxy.newProxyInstance(
            person.getClass().getClassLoader(),
            person.getClass().getInterfaces(),
            new NonOwnerInvocationHandler(person));
    }
    
}
