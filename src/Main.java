import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner myObj = new Scanner(System.in);
        System.out.println("1. Enter username");

        String userName = myObj.nextLine();
        System.out.println("Username is: " + userName);  // Output user input

        String displayInfo = myObj.nextLine();
        System.out.println("2.character information " + displayInfo);

        String modifyInfo = myObj.nextLine();
        System.out.println("3. Modify character information " + modifyInfo);

        String quit = myObj.nextLine();
        System.out.println("4. Quit " + quit);



    }
}

//    public static void main(String[] args) {
//
//        Personnage guerrier = new Personnage(
//                "fighter",
//                "arme",
//                "bouclier",
//                10,
//                10
//                );
//        System.out.println(guerrier.getEquipementDefensif());
//
//        Personnage magicien = new Personnage(
//           "magic",
//                "sort",
//                "philtre",
//                6,
//                15
//        );
//
//    }


