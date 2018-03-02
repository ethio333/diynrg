package backend;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * A wrapper class containing the version and developer information
 * for fkmd
 * @author mike briden
 * 2/27/2018
 */
public class About {
	private String version; // current version of diynrg
	private String date; // date of last update
	private String name1; // dev 1
	private String name2; // dev 2
	private String name3; // dev 3
	private String name4; // dev 4
	private String website; // website
	/**
	Read the given file into data.
	*/
	public About() {
		
		File inFile = new File("version.txt") ;
		
		try {
			Scanner in = new Scanner( inFile ) ;
			while (in.hasNext() ) {
				version = in.nextLine();
				date= in.nextLine();
				name1= in.nextLine();
				name2= in.nextLine();
				name3= in.nextLine();
				name4= in.nextLine();
				website= in.nextLine();
				
			}
			in.close();
		} catch (IOException io ) {
			System.out.println(io) ;
		}
	}
	
	/**
	 * shows the current version
	 * @return version
	 */
	public String displayVersion(){
		return version;
	}
	
	/**
	 * shows the date of last update
	 * @return date
	 */
	public String displayDate() {
		return date;
	}
	
	/**
	 * display name of dev1
	 * @return name1
	 */
	public String displayName1(){
		return name1;
	}
	
	/**
	 * name of dev2
	 * @return name2
	 */
	public String displayName2(){
		return name2;
	}
	
	/**
	 * name of dev3
	 * @return name3
	 */
	public String displayName3(){
		return name3;
	}
	
	/**
	 * name of dev4
	 * @return name4
	 */
	public String displayName4(){
		return name4;
	}
	
	/**
	 * Display website
	 * @return website
	 */
	public String displayWebsite() {
		return website;
	}
	
	

}
