import java.util.ArrayList;

/*
 * Activity 4.9.2
 */
public class ZooKeeperRunner
{
  public static void main(String[] args)
  { 
    ArrayList<Animal> zoo = new ArrayList<Animal>();

    Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
    elephant.trumpet();

    Tiger tiger = new Tiger("meat", true, 17.0);
    tiger.swim();
    tiger.huntAlone();

    Giraffe giraffe = new Giraffe("leaves", false, 25.0);
    giraffe.eat();

    Hippo hippo = new Hippo("food", true, 99999.0);
    hippo.eat();

    Penguin penguin = new Penguin();
    penguin.fish();

    Owl owl = new Owl();
    owl.hunt();
    Owl owl2 = new Owl("mice,insects", true, 4.0);
    owl2.eat();

    System.out.println(zoo);
  }
}