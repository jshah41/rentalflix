package io.egen.rentalflix;

import junit.framework.Test;
import org.junit.*;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import java.util.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
    {
List<Movie> testList=new ArrayList<Movie>();
	
	
	
	
	MovieService m=new MovieService();
	
	
	int testRent=1;
	
	
	public void test1(){
		boolean b=m.rentMovie(1, "jenish");
		assertEquals(true, b);	
		
	}
	
	
	
	public void test2(){
		m.create(new Movie(1, "ABCD", 2017, "English" ));
		testList.add(new Movie(1, "ABCD", 2017, "English" ));
		
		List<Movie> ans=m.findAll();
		
		assertEquals(testList.size(), ans.size());
		
		
	}

}
