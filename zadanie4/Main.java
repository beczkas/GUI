/**
 *
 *  @author Kr&oacute;likowski Stanis&#x142;aw S14117
 *
 */

package zadanie4;


public class Main {
  public static void main(String[] args)
  {
    Spiewak s1 = new Spiewak("Carrey"){
      String spiewaj(){
        return "oooooooooooo";
      }
    };

    Spiewak s2 = new Spiewak("Houston"){
      String spiewaj(){
        return "a4iBBiii";
      }
    };

    Spiewak s3 = new Spiewak("Madonna"){
      String spiewaj(){
        return "aAa";
      }
    };

    Spiewak sp[] = {s1, s2, s3};

    for (Spiewak s : sp)
      System.out.println(s);


    System.out.println("\n" + Spiewak.najglosniej(sp));
  }
}
