package docx;

import java.io.File;

public class FileFinder {

	public static void main(String[] args) {

		File folder = new File("D:\\");
		File[] listOfFiles = folder.listFiles();

		for (File file : listOfFiles) {
			if (file.isFile() && 
					(file.getName().substring(file.getName().lastIndexOf('.') + 1).equals("docx"))) {
				System.out.println(file);
			}
		}
	}
	// File[] paths = File.listRoots();
	// for(File directory:paths){
	// getFile(directory.toString());
	// }
	// }
	//
	// public static void getFile(String directoryName) {
	// File directory = new File(directoryName);
	// File[] fList = directory.listFiles();
	// if(fList!=null){
	// for (File file : fList) {
	// if (file.isFile()) {
	// System.out.println(file.toString());
	// } else if (file.isDirectory()) {
	// getFile(file.getAbsolutePath());
	// }
	// }
	// }
	//
	// }
}
