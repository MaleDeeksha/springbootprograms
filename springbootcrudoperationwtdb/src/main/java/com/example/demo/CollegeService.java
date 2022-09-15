package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollegeService {
private static Map<Integer, College>mapCollege=new HashMap();
private static int index=2;
static {
	College c1=new College(1, "GPW", "6302681446","JOGIPET");
	College c2=new College(2, "scient","9704709725","ibp");
	mapCollege.put(1, c1);
	mapCollege.put(2, c2);
}
public static List<College>getCollegeDetails(){
	return new ArrayList<>(mapCollege.values());
}
public static College getCollegeDetailsById(int collegeId) {
	return mapCollege.get(collegeId);
}
public static College addCollegeDetails(College col) {
index+=1;
	col.setCollegeId(index);
	mapCollege.put(index,col);
	return col;
}
public static College removeColegeDetailsById(int collegeId) {
	return mapCollege.remove(collegeId);
}
public static College update(int collegeId,College col) {
//dex+=1;
	col.setCollegeId(collegeId);
	mapCollege.put(collegeId,col);
	return col;
}
}
