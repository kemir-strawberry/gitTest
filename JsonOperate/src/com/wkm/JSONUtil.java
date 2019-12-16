package com.wkm;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPObject;

public class JSONUtil {

	public static void main(String[] args) {
		 /*Map<String,String> map = new HashMap<>();
		 map.put("person", "[{\"name\":\"jack\"},{\"name\":\"jack\"}]");
		 map.put("tree","[\"name\":\"zhangsan\"]");
		 map.put("age", "12");
		 
		 System.out.println(toJSONString(map));
		 
		 System.out.println(toJSONString(map));
		 Map<String, String> map1 = (Map<String, String>) JSONObject.parse(toJSONString(map));
		 
		// System.out.println(map1.get("person"){0});
		 
		 JSONArray array = JSONArray.parseArray(map1.get("person"));

		 JSONArray array1 = JSONArray.parseArray(map1.get("tree"));

		 for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(0));
		}
		 
		 for (int i = 0; i < array1.size(); i++) {
				System.out.println(array.get(0));
			
		 }*/
		 
		 
		 Map<String, Object> result = new HashMap<>();
		 result.put("code", 2000);
		 result.put("message", "操作成功");
		 
		 Map<String, Object> resMap = new HashMap<>();
		 resMap.put("id", "12345667");
		 resMap.put("jps", "jps");
		 
		 Map<String, Object> dataMap = new HashMap<>();
		 dataMap.put("statusCode", 6000);
		 dataMap.put("message", "成功");
		 
		 resMap.put("data", dataMap);
		 result.put("result", resMap);
		 
		String mapStr = JSON.toJSONString(result);
		
		System.out.println(mapStr);
		
		//JSONObject jsonObject = new JSONObject(result);
		
		JSONObject jsonObject = JSONObject.parseObject(mapStr);
		
		System.out.println(((JSONObject)jsonObject.get("result")).get("data"));
		
		
		
		System.out.println("modify");
		Map<String, Object> map = jsonObject.getInnerMap();
		
		System.out.println(jsonObject.containsKey("code"));
		
		System.out.println(map.get("result"));
		
		if(jsonObject.containsKey("code") && jsonObject.getInteger("code")==2000) {
			System.err.println(jsonObject.get("result").toString());
		}
	}
	
	public static String toJSONString(Map<String, String> map) {
		return JSON.toJSONString(map); 
	}
}