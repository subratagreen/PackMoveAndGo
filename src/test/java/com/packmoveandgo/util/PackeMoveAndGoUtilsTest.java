package com.packmoveandgo.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class PackeMoveAndGoUtilsTest {

	@Test
	public void testGeneratePassword() {
		String password = PackeMoveAndGoUtils.generatePassword();
		assertNotNull(password);
	}
}
