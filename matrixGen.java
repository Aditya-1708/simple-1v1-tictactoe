import java.io.IOException;
import java.util.*;
public class matrixGen {
	public static char mat[][]=new char[7][7];
	public static int m,n;
	public String name1,name2;
	public void initialize() {
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(i%2==0) {
					mat[i][j]='-';
				}
				else if (j%2==0) {
					mat[i][j]='|';
				}
				else mat[i][j]=' ';
			}
		}
	}
	public void change(int x,int y,char ch) {
		mat[x][y]=ch;
	}
	public void infocoordinates(int c) {
		Scanner sc=new Scanner(System.in);
		if(c%2!=0){
			System.out.println("enter the coordinates "+name1+" : ");
		}
		else 
			System.out.println("enter the coordinates "+name2+" : ");
		m=sc.nextInt();
		n=sc.nextInt();

		if(c%2==0) change(m,n,'o');
		else if(c%2!=0) change(m,n,'x');
	}
	public void clear() {
		 try {
		     String os = System.getProperty("os.name").toLowerCase();
		     ProcessBuilder processBuilder;
		     if (os.contains("win")) {
		    	 // For Windows
		    	 processBuilder = new ProcessBuilder("cmd", "/c", "cls");
		     } 
		     else {
		    	 // For macOS and Linux
		    	 processBuilder = new ProcessBuilder("clear");
		     }
		     Process process = processBuilder.inheritIO().start();
		     process.waitFor();
		 	} catch (IOException | InterruptedException e) {
		            e.printStackTrace();
		    }
	}
	public void display() {
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=6;j++) {
				if(j==0) {
					System.out.print("                       ");
				}
				System.out.print(" "+mat[i][j]);
			}
			System.out.println("");
		}
	}
	public void inputplayers() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name of the person who chooses O");
		name1=sc.nextLine();
		System.out.println("enter the name of the person who chooses X");
		name2=sc.nextLine();
	}
	public boolean windecider() {
		if((mat[1][1]=='o'&&mat[3][3]=='o'&&mat[5][5]=='o')||(mat[1][1]=='x'&&mat[3][3]=='x'&&mat[5][5]=='x')) {
			return true;
		}
		else if((mat[1][1]=='o'&&mat[1][3]=='o'&&mat[1][5]=='o')||(mat[1][1]=='x'&&mat[1][3]=='x'&&mat[1][5]=='x')) {
			return true;
		}
		else if((mat[3][1]=='o'&&mat[3][3]=='o'&&mat[3][5]=='o')||(mat[3][1]=='x'&&mat[3][3]=='x'&&mat[3][5]=='x')) {
			return true;
		}
		else if((mat[5][1]=='o'&&mat[5][3]=='o'&&mat[5][5]=='o')||(mat[5][1]=='x'&&mat[5][3]=='x'&&mat[5][5]=='x')) {
			return true;
		}
		else if((mat[1][1]=='o'&&mat[3][1]=='o'&&mat[5][1]=='o')||(mat[1][1]=='x'&&mat[3][1]=='x'&&mat[5][1]=='x')) {
			return true;
		}
		else if((mat[1][3]=='o'&&mat[3][3]=='o'&&mat[5][3]=='o')||(mat[1][3]=='x'&&mat[3][3]=='x'&&mat[5][3]=='x')) {
			return true;
		}
		else if((mat[5][5]=='o'&&mat[5][5]=='o'&&mat[5][5]=='o')||(mat[5][5]=='x'&&mat[5][5]=='x'&&mat[5][5]=='x')) {
			return true;
		}
		else return false;
	}
}
