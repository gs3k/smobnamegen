import java.applet.*;
import java.awt.*;


public class nameGen extends Applet {

	public static void main(String[] args) {

		String[] firstName = {"Porter", "Albert", "Rufus", "Julio", "Squank", "Jorge", "Jeffy", "Olly", "Swamy", "Reed", "Dillern", "Wagner", "Keith", "Doddy", "Terry", "Carlos", "Chuck", "Chichi", "Chachi", "Penelope", "Xander", "Edwin", "Eduardo", "Alfonso", "Winston", "Toby", "Alfred", "Bruce", "Morty", "Denton", "Charlie", "Wong", "Wang", "Vaughn", "Davion", "Warren", "Laqueefa", "Lauren", "Leonard", "Jackson", "Franz", "Dingus", "Martin", "Dipso", "Chandler", "Pizzle", "Darrel", "Cragg", "Johnny", "Peter", "Davey", "Lonny", "Flavtarian", "Jamal", "Shaqueefa", "Morris", "Mark", "Borf", "Mork", "Micky", "Carl", "Jord", "Frank", "Camtron", "Carlton", "Stentin", "Rob", "Polly"};

		String [] lastNameOne = {"Wolf", "Spit", "Speed", "Ooze",
"Licker", 
"Frump", "Spinkle", "Mingle", "Bork", "Dendo", "Hurf", "Stank", "Stinky", "Dirty", "Pork", "Freizen", "Spank", "Dick", "Dong", "Spork", "Sludge", "Slime", "Booger", "Niggy", "Clam", "Piss", "Shit", "Fart", "Dumpster", "Dumpster", "Mink", "Blob", "Winkle", "Piss", "Hollow", "Smelly", "Grundle", "Broken"};

		String[] lastNameTwo = {"howell", "funnel",  "bucket", 
"knuckles", 
"toes", "pecker", "butt", "nickers", "burger", "pants", "dripper", "coon", "logg", "bottom", "feetz", "wagon", "flicker", "chucker", "warden", "boy", "cheese", "snizzle", "stick", 
"stein", "wintz", "stern", "rash", "schmidt", "fideous", "funker", "dong", "wang", "wad", "piss", "stench", "odor", "tooth"};

		int firstNameLength = firstName.length;
		int lastNameOneLength = lastNameOne.length;
		int lastNameTwoLength = lastNameTwo.length;

		int rand1 = (int) (Math.random() * firstNameLength);
		int rand2 = (int) (Math.random() * lastNameOneLength);
		int rand3 = (int) (Math.random() * lastNameTwoLength);

		String fullName = firstName[rand1] + " " + lastNameOne[rand2] + lastNameTwo[rand3];
		System.out.println(fullName + ", Welcome to Stench Mob! ...You lucky mother fucker");
	}	
}
