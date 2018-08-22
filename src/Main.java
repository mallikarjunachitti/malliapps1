

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		try {
			FileInputStream s=new FileInputStream("f.txt");
			
			ObjectInputStream s1=new ObjectInputStream(s);
			Student ss=(Student)s1.readObject();
			System.out.println(ss.getSid()+ss.getSname());
			System.out.println("success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
