package UnitTest.TestUnit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


import UnitTest.TestUnit.Entity.*;
import UnitTest.TestUnit.Manager.Manager;

import org.junit.Test;

public class TestManager {
	
	@Test
	public void TC01_CreateStudent_Success() {
		Student student = new Student("SE150999", "Phuc Long", "Spring", "C");
		Manager manager = new Manager();
		
		boolean result = manager.createStudent(manager.list, student);
		assertTrue(result);
	}
	
	@Test
	public void TC02_CreateStudent_Failed_DuplicateID() {
		Student student = new Student("SE150905", "Phuc Long", "Spring", "C");
		Manager manager = new Manager();
		
		boolean result = manager.createStudent(manager.list, student);
		assertFalse(result);
	}
	
	@Test
	public void TC03_FindStudent_Success() {
		String id = "SE150905";
		Manager manager = new Manager();
		boolean result = manager.findStudentByID(id, manager.list);
		assertTrue(result);
	}
	
	@Test
	public void TC04_FindStudent_Failed_NoIDExist() {
		String id = "SA150905";
		Manager manager = new Manager();
		boolean result = manager.findStudentByID(id, manager.list);
		assertFalse(result);
	}
	
	@Test
	public void TC05_UpdateStudent_Success() {
		String id = "SE150905";
		Manager manager = new Manager();
		boolean result = manager.updateStudentByID(id, manager.list);
		assertTrue(result);
	}
	
	@Test
	public void TC06_UpdateStudent_Failed_NoIDExist() {
		String id = "SA150905";
		Manager manager = new Manager();
		boolean result = manager.updateStudentByID(id, manager.list);
		assertFalse(result);
	}
	
	@Test
	public void TC07_DeleteStudent_Success() {
		String id = "SE150905";
		Manager manager = new Manager();
		boolean result = manager.deleteStudentByID(id, manager.list);
		assertTrue(result);
	}
	
	@Test
	public void TC08_DeleteStudent_Failed_NOIDExist() {
		String id = "SA150905";
		Manager manager = new Manager();
		boolean result = manager.deleteStudentByID(id, manager.list);
		assertFalse(result);
	}
	
	@Test
	public void TC09_CreateStudent_Failed_IdBlanked() {
		Student student = new Student(" ", "Phuc Long", "Spring", "C");
		Manager manager = new Manager();
		
		boolean result = manager.createStudent(manager.list, student);
		assertFalse(result);
	}
	
	@Test
	public void TC010_UpdateStudent_Failed_InformationUnchanged() {
		String id = "SA150905";
		Manager manager = new Manager();
		boolean result = manager.updateStudentByID(id, manager.list);
		assertFalse(result);
	}
}
