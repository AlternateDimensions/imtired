public class Elephant extends Animal{

    public Elephant(String food, boolean nocturnal, double aveLifeSpan)
    {
    super(food, nocturnal, aveLifeSpan);
    }

    public void trumpet(){
        System.out.println("The elephant blows a trumpet!");
    }

    public void forage(){
        System.out.println("The elephant forages for food!");
    }
}
