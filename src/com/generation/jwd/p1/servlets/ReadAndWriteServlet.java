package com.generation.jwd.p1.servlets;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//CLASS USER WITH PRIVATE VARIABLES
class User implements Serializable{

	private static final long serialVersionUID = 1L;
	private String userName;
	private String password;

//CLASS CONSTRUCTOR
	User(String nom,String pas){
		this.userName = nom;
		this.password = pas;
	}   

//PUBLIC ACCESSORS
	public String getUserName()
		{return userName;}
	public String getPassword()
		{return password;}
	@Override
	public String toString() {
		return "Username:" + userName + "\nPassword: " + password;
}
}


/*-------------------------------------------------------------------------*/


public class ReadAndWriteServlet {

	public static void main(String[] args) {

		User userBorja = new User("Borja", "123");
		User UserMario = new User("Mario", "321");
		
		
////////////Write objects to file////////////
		try {
			FileOutputStream writeLocation = new FileOutputStream(new File("falseDatabase.dat"));
			ObjectOutputStream writeObject = new ObjectOutputStream(writeLocation);


			writeObject.writeObject(userBorja);
			writeObject.writeObject(UserMario);
			
//			System.out.println("< The object has been saved correctly >");
//			System.out.println("");

			writeObject.close();
			writeLocation.close();

			FileInputStream readLocation = new FileInputStream(new File("falseDatabase.dat"));
			ObjectInputStream readObject = new ObjectInputStream(readLocation);

////////////Read objects////////////
			User pr1 = (User) readObject.readObject();
			User pr2 = (User) readObject.readObject();

			System.out.println(pr1.toString());
			System.out.println(pr2.toString());
//			System.out.println("");	
//			System.out.println("< The object has been readed correctly >");
				

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