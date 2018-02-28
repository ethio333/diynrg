package backend;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class About {
	String version;
	String date;
	String name1;
	String name2;
	String name3;
	String name4;
	String website;
	
	/**
	Read the given file into the TA
	*/
	void About() {
		File inFile = new File("version.txt") ;
		try {
			Scanner in = new Scanner( inFile ) ;
			while (in.hasNext() ) {
				version = in.nextLine() ;
				date = in.nextLine() ;
				name1 = in.nextLine() ;
				name2 = in.nextLine() ;
				name3 = in.nextLine() ;
				name4 = in.nextLine() ;
				website = in.nextLine() ;
			}
			in.close();
		} catch (IOException io ) {
			System.out.println(io) ;
		}
	}
	
	/**
	 * shows the version
	 */
	String displayVersion(){
		return version;
	}
	
	String displayDate() {
		return date;
	}
	
	String displayName1(){
		return name1;
	}
	
	String displayName2(){
		return name2;
	}
	
	String displayName3(){
		return name3;
	}
	
	String displayName4(){
		return name4;
	}
	
	String displayWebsite() {
		return website;
	}
	
	public static void main(String[] args) {
		About abt = new About();
		System.out.println(abt.version);
		System.out.println(abt.date);
		System.out.println(abt.name1);
		System.out.println(abt.name2);
		System.out.println(abt.name3);
		System.out.println(abt.name4);
		System.out.println(abt.website);

	}
	
	

}
