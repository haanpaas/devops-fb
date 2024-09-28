package com.arcada.devops.haanpaas.assgn3;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class AppTest {

	App app;
	
	@BeforeAll
	public void setUp() throws Exception
	{
		app = new App(); 
	}
	
	@AfterAll
	public void tearDown() throws Exception {}
	

    @Test
    public void testGetDataSetPositive() {
    	HashMap<String, String[]> dataSet = app.getDataSet();
    	assertTrue(!(dataSet.isEmpty()));
    }
    @Test
    public void testGetDataSetNegative() {
    	HashMap<String, String[]> dataSet = app.getDataSet();
    	assertFalse(dataSet.isEmpty());
    }
	
    @Test
    public void testGetFriendsPositive() {
    	String[] friends = {"Alice","Charlie","Eve"};
    	assertArrayEquals(friends, app.getFriends("John"));
    }
    @Test
    public void testGetFriendsNegative() {
    	String[] friends = {"Alice","Charlie","Eve"};
    	assertFalse(Arrays.equals(friends, app.getFriends("Bob")));
    }
    @Test
    public void testGetFriendsNull() {
    	assertNull(app.getFriends("bdbfd"));
    }
    
}
