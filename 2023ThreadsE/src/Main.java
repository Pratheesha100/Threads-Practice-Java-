
public class Main {

	public static void main(String[] args) {
		 int TUsers = 5;
		 ResourceManager rm = new ResourceManager(TResources);
		 for (int i = 1; i <= TUsers; i++){
		 UserThread  userThread  =  new  UserThread(i,rm);
		 userThread . start ( ) ;
		 }

	}

}
