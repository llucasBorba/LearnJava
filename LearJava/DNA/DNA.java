package LearJava.DNA;
/*a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
*/


  // How I solve it just by reading the problem
public class DNA {


    public void ckeckProtein(String dna){
        if(dna.length() % 3 == 0 && dna.startsWith("ATG") && dna.endsWith("TGA")){
            System.out.println("Its a protein");
         }else
           System.out.println("Its NOT a protein");
    }
    public static void main(String[] args) {
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        DNA dna = new DNA();

        dna.ckeckProtein(dna1);
        dna.ckeckProtein(dna2);
        dna.ckeckProtein(dna3);

    }
}

        //How Codecademy would teach
 /*
public class DNA{

    public static void main (String[] args){
        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna1;

        System.out.println("Size: " + dna.length());
        System.out.println("Begind at: " + dna.indexOf("ATG"));
        System.out.println("Stop at: " + dna.indexOf("TGA"));

        if(dna.indexOf("ATG") == 0 && dna.indexOf("TGA") == dna.length() - 3 && dna.length() % 3 == 0){
            System.out.println("Its a protein");

        } else
            System.out.println("Its NOT a protein");
    }
}*/