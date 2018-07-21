import java.util.ArrayList;


public class Person {

    private ArrayList<String> weapons = new ArrayList<String>();
    String name;


    public Person(String name){
        this.name = name;


    }


    public void addWeapon(String item){

        weapons.add(item);

    }
    public void getWeapons(){

        for(String item : this.weapons){

            System.out.println("You collected a " + item);
        }


    }


}
