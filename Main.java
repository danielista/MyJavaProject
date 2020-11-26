package sk.kosickaakademia.martinek.ruka;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Cicavec cicavec1 = new Medved();
        Cicavec cicavec2 = new Lev();


        if (cicavec1 instanceof Medved){
            System.out.println("toto je medved (cicavec1)");
        }

        if (cicavec2 instanceof JeKoitelny){
            System.out.println("toto je lev (cicavec2)");
            System.out.println("mozno kojiť");
            cicavec2.koj();
        }
        System.out.println();


        try {
            //Creating a list of letters
            List<Character> list = new ArrayList<>();
            String name = "DANIELMARTINEK";
            for (int i = 0; i < name.length(); i++) {
                if (list.contains(name.charAt(i))) {
                    continue;
                } else list.add(name.charAt(i));
            }



        for(Character meno: list)
            System.out.print(meno);
        //Sorting the list
        Collections.sort(list);


        System.out.println();
        for(Character meno:list)
            System.out.print(meno);
    }catch (IndexOutOfBoundsException ex){
        System.out.println("Error: " + ex);
    }










    }
}


/*

               _.-._
              | | | |_
              | | | | |
              | | | | |
            _ |  '-._ |
            \`\`-.'-._;
             \    '   |
              \  .`  /
               |    |

---'   ____)
      (_____)
      (_____)
      (____)
---.__(___)

    _______
---'   ____)____
          ______)
          _______)
         _______)
---.__________)

    _______
---'   ____)____
          ______)
       __________)
      (____)
---.__(___)
 */
