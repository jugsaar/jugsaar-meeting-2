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
package de.jugsaar.meeting2.java7.examples.interned;

import java.lang.reflect.Field;

/**
 * @author Thomas Darimont
 */
public class FunWithInternedStrings {

	static {

		try {
			Field valueField = String.class.getDeclaredField("value");
			valueField.setAccessible(true);
			valueField.set("holla", "hallo".toCharArray());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("hallo".equals("holla"));
	}

}
