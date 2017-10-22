package com.javacode.utils;

/**
 * Simple code how to use generic methods.
 *
 * @author lpache
 */
import java.util.logging.Logger;

public class TestClassGenericMethodBound extends Generic {
	private static final Logger LOG = Logger.getLogger(TestClassGenericMethodBound.class.getName());

	public static void main(String[] args) {
		TestClassGenericMethodBound testClass = new TestClassGenericMethodBound();
		validId(testClass);
	}

	public static <U extends IDGeneric> U validId(U obj) {
		try {
			LOG.info("ID from super class: " + obj.getClass().getSuperclass().getMethod("getId", (Class<?>[]) null));
		} catch (NoSuchMethodException | SecurityException e) {
			LOG.warning(e.getMessage());
		}
		return obj;
	}
}

class IDGeneric {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

class Generic extends IDGeneric {
	private String name;
	private String mail;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
}
