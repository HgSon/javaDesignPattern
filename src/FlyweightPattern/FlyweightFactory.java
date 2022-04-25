package FlyweightPattern;

import com.sun.xml.internal.ws.binding.FeatureListUtil;

import java.util.Map;
import java.util.TreeMap;

public class FlyweightFactory {
	Map<String, Flyweight> pool;

	public FlyweightFactory() {
		pool = new TreeMap<>();
	}

	public Flyweight getFlyweight(String key) {
		//없으면 생성, 있으면 재사용 => 계속 재성성하느라 사용되는 메모리를 아낌
		Flyweight flyweight = pool.get(key);

		if(flyweight == null) {
			flyweight = new Flyweight(key);
			pool.put(key, flyweight);
			System.out.println("새로 생성 " + key);
		} else {
			System.out.println("재사용 " + key);
		}

		return flyweight;
	}
}
