package com.FullStack.student.controller;

public class TypeNotFoundException extends RuntimeException {

	TypeNotFoundException(Long id) {
			super("Could not find employee " + id);
		}
}