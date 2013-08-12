/*
 * Copyright 2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.jugsaar.meeting2.java7.examples.unsafe;

import java.lang.reflect.Field;

import sun.misc.Unsafe;

/**
 * @author Thomas Darimont
 * @see http://www.tutorials.de/java/346227-pointer-spielereien-java.html
 */
public class UnsafeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {

		Unsafe unsafe = getUnsafe();

		String[] data = { "AAA", "BBB", "CCC" };

		long arrayBaseOffset = unsafe.arrayBaseOffset(String[].class);
		long arrayIndexWidth = unsafe.arrayIndexScale(String[].class);

		long index = 2; // "CCC"

		Object o = unsafe.getObject(data, arrayBaseOffset + index * arrayIndexWidth);
		System.out.println(o);

	}

	/**
	 * @return
	 * @throws NoSuchFieldException
	 * @throws IllegalAccessException
	 */
	private static Unsafe getUnsafe() throws NoSuchFieldException, IllegalAccessException {
		Field theUnsafeField = Unsafe.class.getDeclaredField("theUnsafe");
		theUnsafeField.setAccessible(true);
		Unsafe unsafe = (Unsafe) theUnsafeField.get(null);
		return unsafe;
	}

}
