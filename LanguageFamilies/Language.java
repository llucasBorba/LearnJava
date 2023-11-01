package LanguageFamilies;

public class Language{

protected String name;
protected int numSpeakers;
protected String regionsSpoken;
protected String wordOrder;

public Language(String name, int numSpeakers, String regionsSpoken, String wordOrder){

        this.name = name;
        this.numSpeakers = numSpeakers;
        this.regionsSpoken = regionsSpoken;
        this.wordOrder = wordOrder;
        }

public void getInfo(){
        System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".");
        System.out.println("The language follows the word order:" + wordOrder+ ".");


        }

public static void main(String[] args){
        Language spanish = new Language("Spanish", 100000, "America", "Verb-Object");
        spanish.getInfo();

        }
}
