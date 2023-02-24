public class Feline extends Animal{

    public Feline(){}

    public Feline(String food, boolean nocturnal, double aveLifeSpan){
        super(food, nocturnal, aveLifeSpan);
    }


    public void roar(){
        System.out.println("The feline roared.");
    }

    public void growl(){
        System.out.println("The feline growled!");
    }
    
}
