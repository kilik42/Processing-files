package learningFileReader;

import java.io.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file =  new File("myfile.txt");
		BufferedReader buffered = null;
		try {
			FileReader fileReader = new FileReader(file);
			buffered = new BufferedReader(fileReader);
			
			String line = buffered.readLine();
			
			while(line != null){
				System.out.println(line);
				line = buffered.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("get file name " + file.getName());
		} finally {
			try {
				buffered.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
