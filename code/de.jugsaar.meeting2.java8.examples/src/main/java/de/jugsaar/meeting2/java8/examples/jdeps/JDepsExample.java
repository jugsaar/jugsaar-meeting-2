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
package de.jugsaar.meeting2.java8.examples.jdeps;

/**
 * <pre>
 * C:\Program Files\Java\jdk1.8.0\bin>jdeps
 * Usage: jdeps <options> <classes...>
 * where <classes> can be a pathname to a .class file, a directory, a JAR file,
 * or a fully-qualified classname or wildcard "*".  Possible options include:
 *   -s         --summary                 Print dependency summary only
 *   -v         --verbose                 Print additional information
 *   -V <level> --verbose-level=<level>   Print package-level or class-level dependencies
 *                                        Valid levels are: "package" and "class"
 *   -c <path>  --classpath=<path>        Specify where to find class files
 *   -p <pkg name> --package=<pkg name>   Restrict analysis to classes in this package
 *                                        (may be given multiple times)
 *   -e <regex> --regex=<regex>           Restrict analysis to packages matching pattern
 *                                        (-p and -e are exclusive)
 *   -P         --profile                 Show profile or the file containing a package
 *   -R         --recursive               Recursively traverse all dependencies
 * --version                 Version information
 * 
 * C:\Program Files\Java\jdk1.8.0\bin>jdeps ..\jre\lib\rt.jar ..\jre\lib\jce.jar
 * 
 * <pre>
 * 
 * @author Thomas Darimont
 * @see http 
 *      ://www.tutorials.de/java/394183-java-8-jdeps-integriertes-tool-zur-analyse-von-abhaengigkeiten-von-jar-archiven
 * .html
 */
public class JDepsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
