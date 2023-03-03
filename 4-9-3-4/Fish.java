/*
 * Activity 4.9.3
 */
public class Fish extends LakeObject
{
    @Override
    public String say()
    {
      return "You now have a fish!";
    }

    @Override
    public int getCost(){
      return super.getCost()*super.getWeight();
    }
}