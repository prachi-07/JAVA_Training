package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.swing.SpringLayout.Constraints;

public class DynamicReflection {

	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";
		
		//Manually loading the class
		Class custClass = Class.forName(qcn);
		
		//Getting the Parameterised constructor
		Constructor custConst = custClass.getConstructor(String.class);
		
		//Instantiating with parameterized constructor
		Object obj = custConst.newInstance("Prachi");
		System.out.println(obj);
		
		//Getting private method of clas with name and param types
		Method printMethod = custClass.getDeclaredMethod("print", null);
		
		//Calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
	}

}
