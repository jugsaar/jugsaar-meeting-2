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
package de.jugsaar.meeting2.java7.examples.hsdb;

import sun.jvm.hotspot.HSDB;

/**
 * @author Thomas Darimont
 * @see http://www.tutorials.de/java/387020-mit-debugger-interne-hotspot-jvm-informationen-auslesen-java-7-a.html
 * @see https://www.usenix.org/legacy/events/jvm01/full_papers/russell/russell_html/index.html
 * @see http://www.oraclejavamagazine-digital.com/javamagazine/20120708?pg=41#pg41
 */
public class HotspotDebuggerExample {

	public static void main(String[] args) {

		// Sonst via:
		// sudo java -cp "/Library/Java/JavaVirtualMachines/jdk1.8.0.jdk/Contents/Home/lib/sa-jdi.jar" sun.jvm.hotspot.HSDB

		HSDB.main(args);
	}
}
