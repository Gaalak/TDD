package Java.genericite.exogenericite.primarykeys;


import Java.genericite.exogenericite.primarykeys.Database;
import Java.genericite.exogenericite.primarykeys.Player;

import java.net.IDN;

// Créer une classe Database
// Créer les classes Player, Cat, Dog, Game
// Instancier une database par type afin de pouvoir les y stocker
// Important : Ces classes ont tous un identifiant unique en base, tel que :
// Player est identifié par son nom unique
// Cat et Dog par leur numéro de sécurité
// Game par son nom
// ATTENTION -> La classe Database doit fonctionner aussi bien pour les Player que pour les Cat
public class MainPrimaryKey {
    public static void main(String[] args) {


        var player = new Player();
        var playersDatabase = new Database<Player, String>();
        var catsDatabase = new Database<Cat, Integer>();
        var dogsDatabase = new Database<Dog, Integer>();
        var gamesDatabase = new Database<Game, String>();
        playersDatabase.add(player,"Dofus");
        System.out.println(playersDatabase.getValues());
        System.out.println(playersDatabase.get("Dofus"));
    }
}
