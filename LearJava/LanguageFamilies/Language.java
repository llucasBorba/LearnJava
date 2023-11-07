package LearJava.LanguageFamilies;

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

                Language spanish = new Language("Spanish", 100, "America", "Verb-Object");
                Mayan chuj = new Mayan("Chuj", 61630);
                SinoTibetan mandarim = new SinoTibetan( "Mandarin Chinese", 900);
                SinoTibetan burmese = new SinoTibetan( "Burmese", 987);

                chuj.getInfo();
                spanish.getInfo();
                mandarim.getInfo();
                burmese.getInfo();

        }
}
