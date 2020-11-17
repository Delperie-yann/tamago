package tamagochiV2;

public class T33 {
	
	// Text menu of change()
		public static void menuChange() {
			System.out.println(T33.decoration[7]+"\n" + "Menu des paramêtres Tamago\n"
					+ "----------------------------------\n");
			System.out.println("(1) Changer le nom?");
			System.out.println("(2) Changer la couleur?");
			System.out.println("(3) Changer sa santer?");
			System.out.println("(4) Un Masque?");
			System.out.println("(5) Le type du Tamago?");
			System.out.println("(6) Fin des changements de style? (Plus de modification possible...)");
		}
		
		// Text Menu of interation()
		public static void actionMenu() {
			System.out.println(T33.decoration[7]
					+ "\nQue voulez vous faire faire à votre Tamago?"
					+ T33.decoration[7]+"\n");
			System.out.println("(1) ETAT");
			System.out.println("(2) Le Nourir?");
			System.out.println("(3) Le Laver?");
			System.out.println("(4) Le Soigner?");
			System.out.println("(5) Lui faire rencontrer des ami(e)s?");
			System.out.println("(6) Qu'il se repose?");
			System.out.println("(7) Lui faire faire du Sport?");
			System.out.println("(8) Le tuer?");
			System.out.println("(9) Lui teindre les poils?");
			System.out.println("(10) Qu'il se detende?");

		}
		
		// Repeat text
		static String textRepeat[] = {

				"[ Votre Tamago est",
				"Faut pas abuser non plus....",
				"\nJe n'ai pas compris...\n"

		};
		
		//Color list
		static String colorair[] = {

				"bleu", "blanc", "gris", "jaune", "marron", "noir", "orange", "rose", "rouge", "vert", "violet"

		};
		//State Text
		static String stateList[] = {

				"entrain de sauter de joie,", "malheureux", "propre", "sale", "bien portant", "blessé",

				"bien nourri", "affamé", "très sale", "social", "normal", "associal"

		};
		//Animal type and change
		static String nature[] = {

				"un tamago",
				"Chat",
				"Dragon",
				"Chien",
				"Choississez votre type d'animal :\n(1) un Dragon\n(2) un Chien\n(3) un Chat\n"
		};
		//Text of question
		static String question[]= {
				//0
				"Voulez vous crée votre personnage? \n'oui' ou 'non'",
				
				"Vous voulez changer un parametre?",
				
				"Changer la couleur de ton Tamago?\n" 
				+ "\"Vous ne pouvez choisir que des couleurs de base en minuscule exemple : marron, vert\n",
				
				"Tu veux partir avec moins de santer? Combien? 'max 100' ",		
				
				"Tu veux un masque? 'oui' ou 'non' ",
				
				//5
				"Tu es sur? 'oui' ou 'non'",
				
				"\nASSASSIN VOUS AVEZ TUER VOTRE TAMAGO!!!\n\n\n\n",
				
				"Qu'elle est la couleur pour ses poils?\n" 
				+ "Vous ne pouvez choisir que des couleurs de base en minuscule exemple : marron, vert",
				
				textRepeat[0] + " prêt à ce reproduire..."
				+ "Voulez vous jouer avec son enfant?\n (1)-Nouveau Tamago' ou '(2)-continuer'",
				
				
				"\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n"
				+ "\nUn nouveau bébé est née et à pris la place de ses parent dans votre coeur"
				+ "\nVous controlez ainsi le nouveau bébé...\n"
				+ "\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n",
				
				//10
				"Rentrer une couleur tout minuscule"
		};
		
		
		
		//Dragon Action Text
		static String textDragon[]= {
				"---------------------\nNourrir\n (1)-Mouton ou (2)-Vache?\n---------------------",
				"---------------------\n(1)-Les pâtes ou (2)-Les écailles?\n---------------------",
				"---------------------\n(1)-Repos dans la cave ou (2)-Hibernage millenaire?\n---------------------",
				"---------------------\n(1)-Chevalier de passage ou (2)-rdv du dolmen?\n---------------------",
				"---------------------\n(1)-Sieste ou (2)-Nuit? 1 ou 2\n---------------------",
				"---------------------\nVole acrobatique? (1) ou (2) heures",
				"---------------------\n Quoi?\n(1)-Pierre préferé ou (2)-Fumer\n"
		};
		//Cat Action Text
		static String textCat[]= {
				"---------------------\nNourrir\n (1)-Croquette ou (2)-Mourront?\n---------------------",
				"---------------------\n(1)-Les pâtes ou (2)-Le poils?\n---------------------",
				"---------------------\n(1)-Anti-tique ou (2)-Véterinaire?\n---------------------",
				"---------------------\n(1)-Copain de fenêtre ou (2)-Rdv des chats?\n---------------------",
				"---------------------\n(1)-Sieste ou (2)-Nuit? 1 ou 2\n---------------------",
				"---------------------\nPartie de chasse? (1) ou (2) heures",
				"---------------------\n Quoi?\n(1)-Coussin ou (2)-Fumer\n"
		};
		//Dog Action Text
		static String textDog[]= {
				"---------------------\nNourrir\n (1)-Croquette ou (2)-Reste de viande?\n---------------------",
				"---------------------\n(1)-Les pâtes ou (2)-Le poils?\n---------------------",
				"---------------------\n(1)-Anti-tique ou (2)-Véterinaire?\n---------------------",
				"---------------------\n(1)-Le voisin de grillage ou (2)-Balade au parc?\n---------------------",
				"---------------------\n(1)-Sieste ou (2)-Nuit? 1 ou 2\n---------------------",
				"---------------------\nJoue à la baballe? (1) ou (2) heures",
				"---------------------\n Quoi?\n(1)-Coussin ou (2)-Fumer\n"
		};
		
		//Decoration Ascii
		static String decoration[]= {
				"|__   __|                               \r\n"
						+ "    | | __ _ _ __ ___   __ _  __ _  ___  \r\n" + "    | |/ _` | '_ ` _ \\ / _` |/ _` |/ _ \\ \r\n"
						+ "    | | (_| | | | | | | (_| | (_| | (_) |\r\n" + "    |_|\\__,_|_| |_| |_|\\__,_|\\__, |\\___/ \r\n"
						+ "                              __/ |      \r\n" + "                             |___/       \n\n\n",
						
						"Bienvenue dans le Monde de Tamago\n" + "Le monde des petites bêtes vivantes\n"
								+ "Vous partez dans le jeu avec un Tamago \n\n"
								+ "------------------------------------------------------------------",
"            /           /                                               \r\n"
+ "                /' .,,,,  ./                                                 \r\n"
+ "               /';'     ,/                                                   \r\n"
+ "              / /   ,,//,`'`                                                 \r\n"
+ "             ( ,, '_,  ,,,' ``                                               \r\n"
+ "             |    /@  ,,, ;\" `                                               \r\n"
+ "            /    .   ,''/' `,``                                              \r\n"
+ "           /   .     ./, `,, ` ;                                             \r\n"
+ "        ,./  .   ,-,',` ,,/''\\,'                                             \r\n"
+ "       |   /; ./,,'`,,'' |   |                                               \r\n"
+ "       |     /   ','    /    |                                               \r\n"
+ "        \\___/'   '     |     |                                               \r\n"
+ "          `,,'  |      /     `\\                                              \r\n"
+ "               /      |        ~\\                                            \r\n"
+ "              '       (                                                      \r\n"
+ "             :                                                               \r\n"
+ "            ; .         \\--                                                  \r\n"
+ "          :   \\         ;",
"  ,_-~~~-,    _-~~-_\r\n"
+ " /        ^-_/      \\_    _-~-.\r\n"
+ "|      /\\  ,          `-_/     \\\r\n"
+ "|   /~^\\ '/  /~\\  /~\\   / \\_    \\\r\n"
+ " \\_/    }/  /        \\  \\ ,_\\    }\r\n"
+ "        Y  /  /~  /~  |  Y   \\   |\r\n"
+ "       /   | {Q) {Q)  |  |    \\_/\r\n"
+ "       |   \\  _===_  /   |\r\n"
+ "       /  >--{     }--<  \\\r\n"
+ "     /~       \\_._/       ~\\\r\n"
+ "    /    *  *   Y    *      \\\r\n"
+ "    |      * .: | :.*  *    |\r\n"
+ "    \\    )--__==#==__--     /\r\n"
+ "     \\_      \\  \\  \\      ,/\r\n"
+ "       '~_    | |  }   ,~'\r\n"
+ "          \\   {___/   /\r\n"
+ "           \\   ~~~   /\r\n"
+ "           /\\._._._./\\\r\n"
+ "          {    ^^^    }\r\n"
+ "           ~-_______-~\r\n"
+ "            /       \\",
"      _                        \r\n"
+ "       \\`*-.                    \r\n"
+ "        )  _`-.                 \r\n"
+ "       .  : `. .                \r\n"
+ "       : _   '  \\               \r\n"
+ "       ; *` _.   `*-._          \r\n"
+ "       `-.-'          `-.       \r\n"
+ "         ;       `       `.     \r\n"
+ "         :.       .        \\    \r\n"
+ "         . \\  .   :   .-'   .   \r\n"
+ "         '  `+.;  ;  '      :   \r\n"
+ "         :  '  |    ;       ;-. \r\n"
+ "         ; '   : :`-:     _.`* ;\r\n"
+ "      .*' /  .*' ; .*`- +'  `*' \r\n"
+ "      `*-*   `*-*  `*-*'",
"      ,-=-.       ______     _\r\n"
+ "     /  +  \\     />----->  _|1|_\r\n"
+ "     | ~~~ |    // -/- /  |_ H _|\r\n"
+ "     |R.I.P|   //  /  /     |S|\r\n"
+ "\\vV,,|_____|V,//_____/VvV,v,|_|/,,vhjwv/,",
"                                                                          \r\n"
+ "                                                                          \r\n"
+ "                                                                          \r\n"
+ "                                ████████                                  \r\n"
+ "                              ██        ██                                \r\n"
+ "                            ██▒▒▒▒        ██                              \r\n"
+ "                          ██▒▒▒▒▒▒      ▒▒▒▒██                            \r\n"
+ "                          ██▒▒▒▒▒▒      ▒▒▒▒██                            \r\n"
+ "                        ██  ▒▒▒▒        ▒▒▒▒▒▒██                          \r\n"
+ "                        ██                ▒▒▒▒██                          \r\n"
+ "                      ██▒▒      ▒▒▒▒▒▒          ██                        \r\n"
+ "                      ██      ▒▒▒▒▒▒▒▒▒▒        ██                        \r\n"
+ "                      ██      ▒▒▒▒▒▒▒▒▒▒    ▒▒▒▒██                        \r\n"
+ "                      ██▒▒▒▒  ▒▒▒▒▒▒▒▒▒▒  ▒▒▒▒▒▒██                        \r\n"
+ "                        ██▒▒▒▒  ▒▒▒▒▒▒    ▒▒▒▒██                          \r\n"
+ "                        ██▒▒▒▒            ▒▒▒▒██                          \r\n"
+ "                          ██▒▒              ██                            \r\n"
+ "                            ████        ████                              \r\n"
+ "                                ████████                                  \r\n"
+ "                                                                          \r\n"
+ "                                                                          \r\n"
+ "                                                                          \r\n",
"\n--------------------------------------------",

				
		};
}
