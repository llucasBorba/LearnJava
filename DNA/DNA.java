package DNA;
/*a DNA.java program that determines whether there is a protein in a strand of DNA.

A protein has the following qualities:

It begins with a “start codon”: ATG.
It ends with a “stop codon”: TGA.
In between, each additional codon is a sequence of three nucleotides.
*/

public class DNA {


    public void ckeckProtein(String dna){
        if(dna.length() % 3 == 0 && dna.startsWith("ATG")){
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
        dna.ckeckProtein(dna1);
        dna.ckeckProtein(dna1);

    }
}
