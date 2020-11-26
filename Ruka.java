package sk.kosickaakademia.martinek.ruka;

public class Ruka {


    private int pocetPrstov = 5;
    char[] znaky = {'a','b','c'};
    long cislo = 9383892L;
    boolean prava;
    public int getPocetPrstov() {

        return pocetPrstov;
    }
    public Ruka(int kolkoPrstov){
        this.pocetPrstov = kolkoPrstov;
        if (this.pocetPrstov != 5) System.out.println("som nezvyčajná ruka ..nemám 5 prstov");
    }
    public Ruka(){
        pocetPrstov = 5;
    }




    public void odstranPrstZruky(){

        if (pocetPrstov>0){
            pocetPrstov = pocetPrstov-1;
            System.out.println("aaaaaaaaaaau");
        }else{
            System.out.println("už nemám fingers na tejto ruke" );
        }
    }

}
