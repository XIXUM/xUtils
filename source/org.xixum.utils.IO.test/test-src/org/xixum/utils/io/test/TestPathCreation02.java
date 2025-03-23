/**
 * (c) XIXUM.ORG - all rights reserved
 */

package org.xixum.utils.io.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.xixum.utils.io.filesystem.Path;

/**
 * @author schaller
 *
 */
public class TestPathCreation02 {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPathCreation_absolute_nonexist01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\org.xixum.utils.IO\\META-INF\\MAFEST.MF";
		Path testPath = new Path(path);
		
		assertTrue(testPath.exists());

	}
	
	@Test
	void testPathCreation_relativeTo_exist01() {
		String path = "..\\org.xixum.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		
		assertTrue(testPath.exists());

	}
	
	@Test
	void testPathCreation_relative_exist01() {
		String path = "META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		
		assertTrue(testPath.exists());

	}
	
	@Test
	void testPathCreation_unc01() {
		String path = "xixum150.jpg";	
		Path testPath = new Path(path);
		
		assertTrue(testPath.exists());

	}
	
	@Test
	void testPathCreation_exist01() {
		String path = "Utils\\org.xixum.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		
		assertTrue(testPath.exists());
	
	}

}