import java.util.Scanner;



public class Main {

    public static void main(String[] args){

        Person jojo = new Person("Jojo");

        Scanner sc = new Scanner(System.in);

        String[] weaponsList = {"bat", "sword", "dog", "rocket", "hammer"};

        for(int i = 0; i < weaponsList.length; i++){

            System.out.println("Do you want to collect a "+ weaponsList[i]);

            String response = sc.nextLine();

                if(response.equals("yes")){

                    jojo.addWeapon(weaponsList[i]);
                }

        }

        jojo.getWeapons();

    }
}
