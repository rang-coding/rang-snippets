package com.rang.snippets.file.txt;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.io.FileUtils;

import com.google.common.io.Resources;

/**
 * This class contains multiple examples of how to read a txt-file from the
 * project's resource-folder.
 */
public class ResourceTxtFileReader {

	/**
	 * Reads txt-file as byte-array from resources using java-native Non-blocking
	 * I/O (nio).
	 * 
	 * @param name Path to resource-file
	 * @return File as byte-array
	 * @throws IOException        File cannot be read
	 * @throws URISyntaxException {@link URL} cannot be parsed to {@link URI}
	 * @since 1.7
	 */
	public static byte[] readFileFromResourcesAsByteArray(String name) throws IOException, URISyntaxException {

		ClassLoader classLoader = ResourceTxtFileReader.class.getClassLoader();
		URL url = classLoader.getResource(name);

		URI uri = url.toURI();
		Path path = Paths.get(uri);

		return Files.readAllBytes(path);
	}

	/**
	 * Reads txt-file as one {@link String} from resources using java-native
	 * Non-blocking I/O (nio).
	 * 
	 * @param name Path to resource-file
	 * @return File as String
	 * @throws IOException        File cannot be read
	 * @throws URISyntaxException {@link URL} cannot be parsed to {@link URI}
	 * @since 1.7
	 */
	public static String readFileFromResourcesAsString(String name) throws IOException, URISyntaxException {

		ClassLoader classLoader = ResourceTxtFileReader.class.getClassLoader();
		URL url = classLoader.getResource(name);

		URI uri = url.toURI();
		Path path = Paths.get(uri);

		return Files.readString(path, StandardCharsets.UTF_8);
	}

	/**
	 * Reads txt-file line by line as {@link String} from resources using
	 * java-native Non-blocking I/O (nio).
	 * 
	 * @param name Path to resource-file
	 * @return File-lines as List of Strings
	 * @throws IOException        File cannot be read
	 * @throws URISyntaxException {@link URL} cannot be parsed to {@link URI}
	 * @since 1.7
	 */
	public static List<String> readFileFromResourcesByLines(String name) throws IOException, URISyntaxException {

		ClassLoader classLoader = ResourceTxtFileReader.class.getClassLoader();
		URL url = classLoader.getResource(name);

		URI uri = url.toURI();
		Path path = Paths.get(uri);

		return Files.readAllLines(path, StandardCharsets.UTF_8);
	}

	/**
	 * Reads txt-file as byte-array from resources using library apache commons-io.
	 * 
	 * @param name Path to resource-file
	 * @return File as byte-array
	 * @throws IOException File cannot be read
	 */
	public static byte[] readFileFromResourcesAsByteArray2(String name) throws IOException {

		ClassLoader classLoader = ResourceTxtFileReader.class.getClassLoader();
		URL url = classLoader.getResource(name);

		File file = new File(url.getFile());
		return FileUtils.readFileToByteArray(file);
	}

	/**
	 * Reads txt-file as one {@link String} from resources using library apache
	 * commons-io.
	 * 
	 * @param name Path to resource-file
	 * @return File as String
	 * @throws IOException File cannot be read
	 */
	public static String readFileFromResourcesAsString2(String name) throws IOException {

		ClassLoader classLoader = ResourceTxtFileReader.class.getClassLoader();
		URL url = classLoader.getResource(name);

		File file = new File(url.getFile());
		return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
	}

	/**
	 * * Reads txt-file line by line as {@link String} from resources using library
	 * apache commons-io.
	 * 
	 * @param name Path to resource-file
	 * @return File-lines as List of Strings
	 * @throws IOException File cannot be read
	 */
	public static List<String> readFileFromResourcesByLines2(String name) throws IOException {

		ClassLoader classLoader = ResourceTxtFileReader.class.getClassLoader();
		URL url = classLoader.getResource(name);

		File file = new File(url.getFile());
		return FileUtils.readLines(file, StandardCharsets.UTF_8);
	}

	/**
	 * Reads txt-file as byte-array from resources using library google guava.
	 * 
	 * @param name Path to resource-file
	 * @return File as byte-array
	 * @throws IOException File cannot be read
	 */
	public static byte[] readFileFromResourcesAsByteArray3(String name) throws IOException {

		URL url = Resources.getResource(name);
		return Resources.toByteArray(url);
	}

	/**
	 * Reads txt-file as one {@link String} from resources using library google
	 * guava.
	 * 
	 * @param name Path to resource-file
	 * @return File as String
	 * @throws IOException File cannot be read
	 */
	public static String readFileFromResourcesAsString3(String name) throws IOException {

		URL url = Resources.getResource(name);
		return Resources.toString(url, StandardCharsets.UTF_8);
	}

	/**
	 * Reads txt-file line by line as {@link String} from resources using library
	 * google guava.
	 * 
	 * @param name Path to resource-file
	 * @return File-lines as List of Strings
	 * @throws IOException File cannot be read
	 */
	public static List<String> readFileFromResourcesByLines3(String name) throws IOException {

		URL url = Resources.getResource(name);
		return Resources.readLines(url, StandardCharsets.UTF_8);
	}

	/**
	 * Gets {@link URL} of given resource-file and prints out all its details.
	 * 
	 * @param name Path to resource-file
	 * @throws URISyntaxException {@link URL} cannot be parsed to {@link URI}
	 */
	public static void printOutResourceInfo(String name) throws URISyntaxException {
		ClassLoader classLoader = ResourceTxtFileReader.class.getClassLoader();
		URL url = classLoader.getResource(name);

		System.out.println("-----");
		System.out.println("Url:         " + url.toString());
		System.out.println("Uri:         " + url.toURI());
		System.out.println("Authority:   " + url.getAuthority());
		System.out.println("DefaultPort: " + url.getDefaultPort());
		System.out.println("File:        " + url.getFile());
		System.out.println("Host:        " + url.getHost());
		System.out.println("Path:        " + url.getPath());
		System.out.println("Port:        " + url.getPort());
		System.out.println("Protocol:    " + url.getProtocol());
		System.out.println("Query:       " + url.getQuery());
		System.out.println("Ref:         " + url.getRef());
		System.out.println("UserInfo:    " + url.getUserInfo());
	}

	/**
	 * Runner demonstrating usage of above methods.
	 *
	 * @param args unused
	 */
	public static void main(String[] args) throws Exception {

		String name = "files/example.txt";

		// Read file as Byte-array
		byte[] bytesNative = readFileFromResourcesAsByteArray(name);
		byte[] bytesCommons = readFileFromResourcesAsByteArray2(name);
		byte[] bytesGuava = readFileFromResourcesAsByteArray3(name);
		System.out.println("Case 1 - Read file as byte[] - " //
				+ "native: " + bytesNative.length + " bytes   " //
				+ "commons: " + bytesCommons.length + " bytes   " //
				+ "guava: " + bytesGuava.length + " bytes");

		// Read file as full string
		String stringNative = readFileFromResourcesAsString(name);
		String stringCommons = readFileFromResourcesAsString2(name);
		String stringGuava = readFileFromResourcesAsString3(name);
		System.out.println("Case 2 - Read file as String - " //
				+ "native: " + stringNative.length() + " chars   " //
				+ "commons: " + stringCommons.length() + " chars   " //
				+ "guava: " + stringGuava.length() + " chars");

		// Read file as full string
		List<String> linesNative = readFileFromResourcesByLines(name);
		List<String> linesCommons = readFileFromResourcesByLines2(name);
		List<String> linesGuava = readFileFromResourcesByLines3(name);
		System.out.println("Case 3 - Read file as Lines  - " //
				+ "native:   " + linesNative.size() + " lines   " //
				+ "commons:   " + linesCommons.size() + " lines   " //
				+ "guava:   " + linesGuava.size() + " lines");

		// TODO Example of reading large files using InputStream or BufferedReader

		// Print out file content
		System.out.println("-----");
		linesNative.forEach(System.out::println);

		// Methods printing additional info (perhaps helpful)
		// printOutResourceInfo(name);

		System.out.println("-----");
		System.out.println("DONE!");
	}
}
