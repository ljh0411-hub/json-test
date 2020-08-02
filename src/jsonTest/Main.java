package jsonTest;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import jsonClass.Address;
import jsonClass.Person;

/**
 * @description: 
 * @author: ljh
 * @date: Created in 2020��4��27�� ����4:03:20

 */
public class Main {
	//Map����-> json����
	public static void mapToJson() {
		Map<String,String> map = new HashMap<>();
		map.put("s01","zs");
		map.put("s02","ls");
		map.put("s03","ww");
		JSONObject json = new JSONObject(map);
		System.out.println(json);
		//{"s02":"ls","s01":"zs","s03":"ww"}
	}
	
	//JavaBean -> Json
	public static void javaBeanToJson() {
		Person per = new Person();
		per.setName("����");
		per.setAge(20);
		Address address = new Address();
		address.setHomeAdress("�Ĵ�");
		address.setSchoolAdress("����");
		per.setAddress(address);
		
		JSONObject json = new JSONObject(per);
		System.out.println(json);
		/* {"address":{"homeAdress":"�Ĵ�","schoolAdress":"����"},
		    "name":"����",
		    "age":20}
		*/
	}
	
	//String -> Json
	public static void stringToJson() {
		String str = "{\"s02\":\"ls\",\"s01\":\"zs\",\"s03\":\"ww\"}";
		JSONObject json = new JSONObject(str);
		System.out.println(json);	
	}
	
	//
	
	
	public static void main(String[] args) {
		mapToJson();
		javaBeanToJson();
		stringToJson();
	}

}
