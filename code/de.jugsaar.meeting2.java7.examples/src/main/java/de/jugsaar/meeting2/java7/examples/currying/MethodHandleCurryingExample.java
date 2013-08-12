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
package de.jugsaar.meeting2.java7.examples.currying;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

/**
 * @author Thomas Darimont
 * @see http://www.tutorials.de/java/392397-java-7-currying-mit-methodhandles.html
 */
public class MethodHandleCurryingExample {

	public static void main(String[] args) throws Throwable {
		MethodHandles.Lookup lookup = MethodHandles.lookup();
		MethodHandle sum = lookup.findStatic(Integer.class, "sum",
				MethodType.methodType(int.class, new Class[] { int.class, int.class }));
		// Currying
		MethodHandle plus1 = MethodHandles.insertArguments(sum, 0, 1);
		int result = (int) plus1.invokeExact(2);
		System.out.println(result); // Output: 3
	}
}
