/**
 *
 *  @author Królikowski Stanisław S14117
 *
 */

package zadanie4;


public abstract class Spiewak extends Thread{
    public String nazwisko;
    public static int lSpiewakow;
    public int nrStartowy;


    public Spiewak(String nazwisko){
        lSpiewakow++;
        this.nrStartowy = lSpiewakow;
        this.nazwisko = nazwisko;
    }

    abstract String spiewaj();

    public String toString(){
        return "("+ nrStartowy +")"+" " + nazwisko +": " + this.spiewaj();
    }

    public static Spiewak najglosniej(Spiewak[] spiewacy){

        int max = 0;

        Spiewak najglosniejszy = spiewacy[0];

        for(int i = 0; i < spiewacy.length; i++){
            String spiew = spiewacy[i].spiewaj();
            int counter = 0;

            for(int j = 0; j < spiew.length(); j++){
                if(Character.isUpperCase(spiew.charAt(j))){
                    counter++;
                }
            }

            if(max < counter){
                max = counter;
                najglosniejszy = spiewacy[i];
            }
        }

        return najglosniejszy;
    }


    }


