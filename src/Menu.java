import java.util.Scanner;
public class Menu {
     void menu () {
String type ;
String nom ;
        Scanner scan = new Scanner(System.in);

         System.out.println("quel type de personnage voulez-vous créer? magicien || guerrier");
         String typeChoice = scan.nextLine();

         if (typeChoice.equals("guerrier")) {
             System.out.println("Votre Personnage Type est guerrier");
         }else if (typeChoice.equals("magicien")){
                 System.out.println("Votre Personnage Type est magicien");
             }
         else {
             System.out.println("Vous avez rien choisi, Merci de Choisir entre ces types magicien || guerrier");

             String retypeChoice = scan.nextLine();
             System.out.println("Merci pour votre modification");
         }

         System.out.println("quel est le nom de personnage voulez-vous utiliser ?");
         String nomChoice = scan.nextLine();

         if (nomChoice.equals(nomChoice)) {
             System.out.println("le nom choisi est " + nomChoice );
             Personnage choix = new Personnage();

         }else {
             Personnage def = new Personnage();
         }
     }



    Personnage guerrier = new Personnage(
            "fighter",
            "guerrier"

    );

    EquipementOffensif offensifg = new EquipementOffensif(
            "guerrier",
            10,
            "fighter"
    );

    EquipementDefensif defensifg = new EquipementDefensif(
            "guerrier",
            10,
            "fighter"
    );


    Personnage magicien = new Personnage(
            "magman",
            "magicien"
    );
    EquipementOffensif offensifm = new EquipementOffensif(
            "magicien",
            15,
            "magman"
    );

    EquipementDefensif defensifm = new EquipementDefensif(
            "guerrier",
            10,
            "fighter"
    );

}
