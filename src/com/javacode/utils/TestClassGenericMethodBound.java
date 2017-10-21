
package com.javacod.utils;

public class TestClassGenericMethodBound extends Generic{

	public static void main(String[] args) {
		TestClassGenericMethodBound t = new TestClassGenericMethodBound();
		validId(t);
		
	}
	public static <U extends IDGeneric> U validId(U obj){
		obj.getId();
		return obj;
	}

}

class IDGeneric{
	public String getId(){
		return "ID";
	}
}

class Generic extends IDGeneric{
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
