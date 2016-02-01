package monday;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class FileUtils {

	private final File mFile;
	private final Path mPath;

	public FileUtils(File file, Path path) {
		this.mFile = file;
		this.mPath = path;
	}

	public File getFile() {
		return mFile;
	}

	public Path getPath() {
		return mPath;
	}

	public String readFrom(File file) throws IOException {

		String result = "";
		FileInputStream fileInput = new FileInputStream(file);
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		String line = null;
		while (fileInput.read() != -1) {

			line = reader.readLine();

			if (line != null) {
				result = result + line + "\n";
			}
		}
		fileInput.close();
		reader.close();
		return result;

	}

	public String readFrom(Path path) throws IOException {
		/*
		 * String result = ""; FileInputStream fileInput = new
		 * FileInputStream(path.toFile()); FileReader fileReader = new
		 * FileReader(path.toFile()); BufferedReader reader = new
		 * BufferedReader(fileReader); String line = null; while
		 * (fileInput.read() != -1) {
		 * 
		 * line = reader.readLine();
		 * 
		 * if (line != null) { result = result + line + "\n"; } }
		 * fileInput.close(); reader.close(); return result;
		 */
		return readFrom(path.toFile());
	}

	public void writeTo(File file, String input) throws IOException {
		FileOutputStream fileOutput = new FileOutputStream(file);
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		writer.write(input);
		fileOutput.close();
		writer.close();
	}

	public void writeTo(Path path, String input) throws IOException {
		writeTo(path.toFile(), input);
	}

	public static void main(String[] args) throws IOException {

		File file = new File("/home/vasil/Desktop/test.txt");
		Path path = file.toPath();

		FileUtils fileUtil = new FileUtils(file, path);

		System.out.println(fileUtil.readFrom(file));
	}
}
