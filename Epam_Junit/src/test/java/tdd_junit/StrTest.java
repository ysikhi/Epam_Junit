package tdd_junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StrTest {
Str c=new Str();
	@Test
	public void testAccept() {
	assertEquals("BCD",c.accept("ABCD"));	
	assertEquals("CD",c.accept("AACD"));
	assertEquals("",c.accept(""));	
	assertEquals("BAA",c.accept("AABAA"));	
	assertEquals("BCD",c.accept("BACD"));
	assertEquals("BBAA",c.accept("BBAA"));
	assertEquals("",c.accept("AA"));	
	}
}
