import java.util.Random;
import java.util.HashMap;

public class AbilityRoll {
        // HashMap<String, String> abilityRollScores = new HashMap<String, String>();

        public int sixSidedRoll;
        public int abilityRoll;

        public AbilityRoll(Character myChar) {
                String[] abilities = { "strength", "dexterity", "constitution", "intelligence", "wisdom", "charisma" };

                HashMap<String, Integer> abilityRollScores = new HashMap<String, Integer>();

                for (String ability : abilities) {
                        System.out.println("Rolling for " + ability + " ...");

                        switch (ability) {
                                case "strength":
                                        System.out.println(ability + " is " + abilityRoll + ".");
                                        myChar.strength = abilityRoll;
                                        abilityRollScores.put("strength", myChar.strength);
                                        break;
                                case "dexterity":
                                        System.out.println(ability + " is " + abilityRoll + ".");
                                        myChar.dexterity = abilityRoll;
                                        abilityRollScores.put("dexterity", myChar.dexterity);
                                        break;
                                case "constitution":
                                        System.out.println(ability + " is " + abilityRoll + ".");
                                        myChar.constitution = abilityRoll;
                                        abilityRollScores.put("constitution", myChar.constitution);
                                        break;
                                case "intelligence":
                                        System.out.println(ability + " is " + abilityRoll + ".");
                                        myChar.intelligence = abilityRoll;
                                        abilityRollScores.put("intelligence", myChar.intelligence);
                                        break;
                                case "wisdom":
                                        System.out.println(ability + " is " + abilityRoll + ".");
                                        myChar.wisdom = abilityRoll;
                                        abilityRollScores.put("wisdom", myChar.wisdom);
                                        break;
                                case "charisma":
                                        System.out.println(ability + " is " + abilityRoll + ".");
                                        myChar.charisma = abilityRoll;
                                        abilityRollScores.put("charisma", myChar.charisma);
                                        break;
                                default:
                                        System.out.println("You need better dice.");
                                        // need a custom exception here
                        }
                }
                System.out.println(abilityRollScores);
        }

        // roll one six-sided die
        public int rollSixSided() {
                Random objGenerator = new Random();
                int randomSixSidedNum = objGenerator.nextInt(6);
                return randomSixSidedNum;
        }

        // roll for abilities
        // Simulation of rolling three six-sided die for each ability
        public int rollForAbility() {
                for (int die = 0; die <= 2; die++) {
                        sixSidedRoll = rollSixSided();
                        abilityRoll += sixSidedRoll;
                }
                return abilityRoll;
        }

}
