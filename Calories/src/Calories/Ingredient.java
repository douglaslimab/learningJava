package Calories;
public class Ingredient {
    public String ingredient;
    public int quantity;
    public float calories;
    public float portionSize;
    public float calsPer100;
    
    public void caloriesPer100(){
         this.calsPer100 = quantity*calories/portionSize;
    }
}
