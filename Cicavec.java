package sk.kosickaakademia.martinek.ruka;

public class Cicavec implements JeKoitelny {
    public String getTyp() {
        return typ;
    }

    private String typ = "cicavec";

    @Override
    public void koj() {
        System.out.println("kojim");
    }
}
