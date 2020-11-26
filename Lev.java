package sk.kosickaakademia.martinek.ruka;

public class Lev extends Cicavec {
    public void koj(){
        System.out.println("opatrne pri kojení.. nebezpečné zviera");
        super.koj();
        Ruka ruka2 = new Ruka();
        ruka2.odstranPrstZruky();
        System.out.print("mám toľko prstov: " + ruka2.getPocetPrstov());
    }
}
