import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
//			System.out.println();
//			Scanner input = new Scanner(System.in);
//			System.out.println("enter some text ");
//			String enteredText = input.nextLine();
//			System.out.println(enteredText);
		
		
		File file = new File("myfile.txt");
		Scanner input = new Scanner(file);
		while(input.hasNextLine()){
			String line = input.nextLine();
			System.out.println(line);
		}
		input.close();
		
		MyUtils myUtil = new MyUtils();
		try {
			myUtil.subtract10FromLargerNumber(15);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	}

	
