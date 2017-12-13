package com.generation.jwd.p1.servlets;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import com.generation.jwd.p1.beans.UserBean;
import com.generation.jwd.p1.beans.TaskBean;

public class ReadAndWriteServlet {

	public static void main(String[] args) {

		UserBean userBorja = new UserBean("Borja", "Perez","borja@gmail.es");
		UserBean UserMario = new UserBean("Mario", "Sanchez","mario@gmail.es");
		
		TaskBean taskBorja = new TaskBean("default", "default", "default", "default", "default", "default", "default", "default", "default");
		TaskBean taskMario = new TaskBean("default", "default", "default", "default", "default", "default", "default", "default", "default");
		
		
////////////Write objects to file////////////
		try {
			FileOutputStream writeLocation = new FileOutputStream(new File("falseDatabase.dat"));
			ObjectOutputStream writeObject = new ObjectOutputStream(writeLocation);


			writeObject.writeObject(userBorja);
			writeObject.writeObject(UserMario);
			
			System.out.println("< The object has been saved correctly >");
			System.out.println("");

			writeObject.close();
			writeLocation.close();

			FileInputStream readLocation = new FileInputStream(new File("falseDatabase.dat"));
			ObjectInputStream readObject = new ObjectInputStream(readLocation);

////////////Read objects////////////
			UserBean pr1 = (UserBean) readObject.readObject();
			UserBean pr2 = (UserBean) readObject.readObject();

			System.out.println("Name 1: "+pr1.getName());
			System.out.println("Surname 1: "+pr1.getSupername());
			System.out.println("Mail 1: "+pr1.getEmail());
			System.out.println("");
			System.out.println("Name 1: "+pr2.getName());
			System.out.println("Surname 1: "+pr2.getSupername());
			System.out.println("Mail 1: "+pr2.getEmail());
			System.out.println("");	
			System.out.println("< The object has been readed correctly >");
				

			readObject.close();
			readLocation.close();

////////////EXCEPTIONS////////////
		} catch (FileNotFoundException e) {
			System.out.println("Banana Error: File not found");
		} catch (IOException e) {
			System.out.println("Banana Error: Class not found");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}