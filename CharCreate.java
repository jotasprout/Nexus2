import java.util.*;

public class CharCreate {

    public CharCreate(){
        System.out.println("Are you old like me and tried to teach your children Dungeons & Dragons?");
        System.out.println("Felt even more stupid than when you try to help with their homework, right?");
        System.out.println("This app does all those newfangled calculations -- that make the game both more realistic but also more of a pain in the ass -- for you.");
        System.out.println("I'll sidestep the bummer that you don't get to roll the dice by saying, even if you didn't buy or lost your dice, the app takes care of that, too.");

        // SCANNER CREATION
        Scanner scan = new Scanner(System.in);

        System.out.println("We create your character by naming it -- you can always change the name later if you feel Dwarf parents would't really name their daughter Bernie.");
        System.out.println("What is your character's name?");
        String myName = scan.nextLine();
        Character newChar = new Character(myName);

        // HOW DO I GET THE CHARACTER I JUST CREATED TO USE THE AbilityRoll METHOD (or the other way around)
        // so the abilities get added to the character?
        // It works if I make it spaghetti code and spread it over several classes ... 


        scan.close();        
    }


}