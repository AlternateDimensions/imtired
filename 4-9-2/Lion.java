public class Lion extends Feline {

    public Lion(){}

    public Lion(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }

    public void huntInPack(){
        System.out.println("The lion hunts with its pack.");
    }
}
