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
package de.jugsaar.meeting2.java6.examples.bcel;

import java.awt.Desktop;
import java.io.File;

import com.sun.org.apache.bcel.internal.Repository;
import com.sun.org.apache.bcel.internal.classfile.JavaClass;
import com.sun.org.apache.bcel.internal.util.Class2HTML;

/**
 * @author Thomas Darimont
 * @see http
 *      ://www.tutorials.de/java-technology-news/266704-informationen-zu-java-klassen-mit-bcel-als-htmlcode-generieren
 *      -lassen.html
 */
public class ByteCodeHtmlViewerExample {

	public static void main(String[] args) throws Exception {

		File file = new File(".");
		JavaClass stringJavaClass = Repository.lookupClass(String.class);
		new Class2HTML(stringJavaClass, file.getAbsolutePath() + "/");
		Desktop.getDesktop().browse(new File(file, stringJavaClass.getClassName() + ".html").toURI());
	}
}
