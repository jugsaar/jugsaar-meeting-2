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
package de.jugsaar.meeting2.java7.examples.objectSize;

import java.lang.instrument.Instrumentation;

import net.shipilev.tools.objectlayout.ObjectLayout;
import de.jugsaar.meeting2.javaagent.Agent;

/**
 * @author Thomas Darimont
 */
public class DetermineObjectSizeExample {

	static class O {

		String s;
		String s1;
		String s2;
		String s3;

		long l0;
		long l1;
	}

	public static void main(String[] args) throws Exception {

		O o = new O();

		Instrumentation inst = Agent.getInstrumentation();
		System.out.printf("Object Size by Instrumentation is is: %s%n", inst.getObjectSize(o));

		System.out.printf("Object Size by ObjectLayout is is: %s%n", ObjectLayout.sizeOf(o));
	}

}
