package LearJava.LanguageFamilies;

public class SinoTibetan extends Language{

    public SinoTibetan(String name, int numSpeakers){

        super(name, numSpeakers, "Asia", "subject-object-verb");
        if( name.toLowerCase().contains("chinese")){
            this.wordOrder = "subject-verb-object";
        }
    }
}