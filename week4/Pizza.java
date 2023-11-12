// package "CSCI 1935".week4;
import java.util.Scanner;
import java.util.ArrayList;

public class Pizza {
    private String Size;
    private int Num_toppings;
    private String[] toppings;
    private int topping_index = 0;
    private double total;

    public Pizza(String size, int number_of_toppings){
        Size = size;
        Num_toppings = number_of_toppings;
        toppings = new String[Num_toppings];
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= Num_toppings; i++){
            System.out.println("Enter toppings: ");
            String topp = scan.nextLine();
            this.addtoppings(topp);
        }
    }

    public set_Size(int new_size){
        Size = new_size;
    }

    public int get_Size(){
        return Size;
    }

    public set_Num_toppings(int asdd){
        Num_toppings = asdd;
    }

    public int get_Num_toppings(){
        return Num_toppings;
    }

    public static addtoppings(String xxx){
        //add xxx into String[] toppings
        toppings[topping_index] = xxx;
        topping_index++;
    }

    public double calcCost(){
        if (Size.equals("small")){
            total += (10 + Num_toppings * 1);
        } else if (Size.equals("medium")){
            total += (11 + Num_toppings * 1.25);
        } else {
            total += (12 + Num_toppings * 1.5);
        }
        return total;
    }

    // public String toString(){
    //     return "Size: " + Size + "\n" + "Number of toppings: " + Num_toppings + "\n" + "toppings" + toppings + "\n" + "total cost" + total + "\n";
    // }
}
