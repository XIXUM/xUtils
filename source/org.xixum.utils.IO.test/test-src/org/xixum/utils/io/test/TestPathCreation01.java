/**
 * (c) XIXUM.ORG - all rights reserved
 * @author felix.schaller
 */
package org.xixum.utils.io.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.xixum.utils.data.lists.IAppendable;
import org.xixum.utils.io.filesystem.LocalDevice;
import org.xixum.utils.io.filesystem.File;
import org.xixum.utils.io.filesystem.IFile;
import org.xixum.utils.io.filesystem.IHost;
import org.xixum.utils.io.filesystem.IUncDevice;
import org.xixum.utils.io.filesystem.Path;

public class TestPathCreation01 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPathCreation_absolute01() {
		String path = "C:\\Users\\schaller\\Projekte\\Eclipse_PluginDev\\Utils\\org.xixum.utils.IO\\META-INF\\MANIFEST.MF";
		Path testPath = new Path(path);
		assertNotNull(testPath);
		
		assertTrue(testPath.getLastPathElement() instanceof File);
		assertTrue(testPath.getPathElement(0) instanceof LocalDevice);
	}
	
	@Test
	void testPathCreation_relative01() {
		String path = "testData\\testFile.txt";
		
		Path testPath = new Path(path);
		assertFalse(testPath.isAbsolute());
		assertFalse(testPath.isRoot());
		assertNotNull(testPath);
	}

	@Test
	void testPathCreation_unc01() {
		String path = "xixum150.jpg";
		
		Path testPath = new Path(path);
		assertTrue(testPath.getLastPathElement() instanceof IFile);
		assertTrue(testPath.getPathElement(0) instanceof IHost);
		assertTrue(testPath.getPathElement(1) instanceof IUncDevice);
		
		assertNotNull(testPath);
	}
	
}
