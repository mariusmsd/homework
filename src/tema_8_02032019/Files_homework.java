package tema_8_02032019;

import java.io.*;
import java.nio.file.*;
import java.util.stream.Stream;


public class Files_homework {

	public static void main(String[] args) {
		
		Path path= Paths.get("/Users/mariusdobre/eclipse-workspace/");
//		Path path= Paths.get("/Users/mariusdobre/eclipse-workspace/sdas");
		Path pathfile1=Paths.get("/Users/mariusdobre/eclipse-workspace/History_of_Java.txt");
		Path pathfile2=Paths.get("/Users/mariusdobre/eclipse-workspace/History_of_Java copy.txt");
		
//		getAllNames(path);
//		getAllFiles_ext(path);
//		getExists(path);
//		getRWPermissions(path);
//		getType(path);
//		getType(pathfile1);
		getLastModified(pathfile1);
	}	

	public static void getAllNames(Path p) {

		File[] files = new File(p.toString()).listFiles();
		for (File file : files) {
			System.out.println(file.getName());
		}
	}
	
	public static void getAllFiles_ext(Path p) {

		File[] files = new File(p.toString()).listFiles();
		for (File file : files) {
			if (file.getName().endsWith(".txt")) {
				System.out.println(file.getName());
			}
		}
	}
	
	public static void getExists(Path p) {

		File file=p.toFile();
		if(file.exists()) {
			System.out.println("Path exists");
		} else System.out.println("Path doesn't exists");
	}
	
	public static void getRWPermissions(Path p) {

		File file=p.toFile();
		if(file.canRead()) {
			System.out.println("Directory has read permission");
			if(file.canWrite()) {
				System.out.println("Directory has write permission");
			} else {
				System.out.println("Directory hasn't write permission");
			}
		} else System.out.println("Directory hasn't read permission");
	}
	
	public static void getType(Path p) {

		File file = p.toFile();
		if (file.isDirectory()) {
			System.out.println("This path: " + p + " points to a directory");
		} else {
			if (file.isFile()) {
				System.out.println("This path: " + p + " points to a file");
			}
		}
	}
	
	public static void compareLexic(Path p1,Path p2) {
		File file1 = p1.toFile();
		File file2 = p1.toFile();
		try (BufferedReader reader1 = new BufferedReader(new FileReader(file1));
			 BufferedReader reader2 = new BufferedReader(new FileReader(file2));){
			
			Stream<String> streamOfLines1 = reader1.lines();
			Stream<String> streamOfLines2 = reader2.lines();
						
		}
					
		catch (IOException ex) {
			System.out.println("I can't find the file, where it is????");
		}
		
	}
	public static void getLastModified(Path p) {

		try {
			System.out.println(Files.getLastModifiedTime(p).toInstant());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

	

}
