package ar.com.ada.online.second.collections.HPgamebyDora;

import java.util.*;

public class GamePlay {
    private Character playerOne;
    private Character playerTwo;
    Scanner keyboard = new Scanner(System.in);

    public void ChoosePlayer() {
        System.out.println("Seleccione al jugador uno: ");
        playerOne = chooseCharacter();
        System.out.println("\n");
        System.out.println("Seleccione al jugador dos: ");
        playerTwo = chooseCharacter();
    }

    private Character chooseCharacter() {
        System.out.println("Seleccione 1 si quiere jugar como un MAGO");
        System.out.println("Seleccione 2 si quiere jugar como un ELFO");
        int answer = keyboard.nextInt();
        Character character = null;
        switch (answer) {
            case 1:
                character = chooseWizard();
                break;
            case 2:
                character = chooseElf();
                break;
        }
        return character;
    }

    public Wizard chooseWizard() {
        Wizard wizard = new Wizard();
        List<String> wizardsNames = Arrays.asList(
                "Harry Potter",
                "Draco Malfo",
                "Hermione Granger",
                "Albus Dumbledore",
                "Severus Snape"
        );

        System.out.println("Seleccione un mago de la lista: ");
        for (int i = 0; i < wizardsNames.size(); i++) {
            System.out.println("\t" + (i + 1) + " " + wizardsNames.get(i));
        }

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                String nameOne = wizardsNames.get(0);
                wizard.setName(nameOne);
                break;
            case 2:
                String nameTwo = wizardsNames.get(1);
                wizard.setName(nameTwo);
                break;
            case 3:
                String nameThree = wizardsNames.get(2);
                wizard.setName(nameThree);
                break;
            case 4:
                String nameFour = wizardsNames.get(3);
                wizard.setName(nameFour);
                break;
            case 5:
                String nameFive = wizardsNames.get(4);
                wizard.setName(nameFive);
                break;
            default:
                System.out.println("Debe elegir una opcion valida");
                wizard = null; //evaluar como hacer que se vuelva a presentar el menu si no se escogen las opciones válidas (un do while?)
        }
        Wand wand = selectionOfWand();
        wizard.setWizardsWand(wand);
        char location = getLocations(keyboard);
        wizard.setLocation(location);
        return wizard;
    }

    public char getLocations(Scanner keyboard) {
        System.out.println("Seleccione su ubicación:");
        System.out.println("A   B   C");
        char option = keyboard.next().charAt(0);
        return option;
    }

    public Elf chooseElf() {
        Elf elf = new Elf();
        List<String> elfNames = Arrays.asList(
                "Dobby",
                "Kreacher",
                "Hokey",
                "Winky"
        );

        System.out.println("Seleccione un Elfo de la lista: ");
        for (int i = 0; i < elfNames.size(); i++) {
            System.out.println("\t" + (i + 1) + " " + elfNames.get(i));
        }

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                String nameOne = elfNames.get(0);
                elf.setName(nameOne);
                break;
            case 2:
                String nameTwo = elfNames.get(1);
                elf.setName(nameTwo);
                break;
            case 3:
                String nameThree = elfNames.get(2);
                elf.setName(nameThree);
                break;
            case 4:
                String nameFour = elfNames.get(3);
                elf.setName(nameFour);
                break;
            default:
                System.out.println("Debe elegir una opcion valida");
                elf = null; //evaluar como hacer que se vuelva a presentar el menu si no se escogen las opciones válidas (un do while?)
        }
        char location = getLocations(keyboard);
        elf.setLocation(location);
        return elf;
    }

    public Wand selectionOfWand() {
        Wand wand = new Wand();
        Random rand = new Random(System.nanoTime());
        System.out.println("\nLa varita escoge al mago..."); //buscar el verdadero numero de poder de las varitas
        int random = rand.nextInt(7);
        int option = random;
        switch (option) {
            case 1:
                wand.setWandName("Varita de Sauco");
                wand.setWandPower(60);
                break;
            case 2:
                wand.setWandName("Varita de Pluma de fénix");
                wand.setWandPower(50);
                break;
            case 3:
                wand.setWandName("Varita de Fresno");
                wand.setWandPower(40);
                break;
            case 4:
                wand.setWandName("Varita de Madera de serpiente");
                wand.setWandPower(30);
                break;
            case 5:
                wand.setWandName("Varita de Abedul");
                wand.setWandPower(20);
                break;
            case 6:
                wand.setWandName("Varita de Espino");
                wand.setWandPower(10);
                break;
            default:
                wand.setWandName("Varita de Palisandro");
                wand.setWandPower(5);
                break;
        }
        System.out.println("Te ha escogido la " + wand.getWandName() + " que te añade " + wand.getWandPower() +
                " puntos de poder " + "\n");
        return wand;
    }

    public void loadSpellCharacters() {
        System.out.println("\n\tJugador 1... Escoge 6 hechizos: \n");
        chooseSpells(playerOne);
        System.out.println("\n\tJugador 2... Escoge 6 hechizos: \n");
        chooseSpells(playerTwo);
    }

    public void chooseSpells(Character character) {
        Set<Spell> spells = new HashSet<>();

        boolean aux;
        for (int i = 0; i < 6; i++) {
            do {
                aux = false;
                System.out.println("Por favor ingrese una categoria de hechizos: \n");
                System.out.println("\t1)Hechizos de Ataque\n");
                System.out.println("\t2)Hechizos de Sanacion\n");
                System.out.println("\t3)Hechizos de Recuperacion\n");
                int option = keyboard.nextInt();

                switch (option) {
                    case 1:
                        AttackSpell attackSpell = getAttackSpell(keyboard);
                        spells.add(attackSpell);
                        break;
                    case 2:
                        HealingSpell healingSpell = getHealingSpell(keyboard);
                        spells.add(healingSpell);
                        break;
                    case 3:
                        RecoverySpell recoverySpell = getRecoverySpell(keyboard);
                        spells.add(recoverySpell);
                        break;
                    default:
                        aux = true;
                        System.out.println("Opcion incorrecta.");
                }

            } while (aux);
        }
        character.setSpells(spells);
    }

    public AttackSpell getAttackSpell(Scanner keyboard) {

        System.out.println("\nHechizos de ataque:");
        System.out.println("\t1) Avada Kedravra: \n 100pts de daño, 90pts energia magica requerida.");
        System.out.println("\t2) Imperius: \n 90pts de daño, 80pts de energia magica requerida.");
        System.out.println("\t3) Cruciatus: \n 90pts de daño, 80pts de energia magica requerida.");
        System.out.println("\t4) Expulso: \n 25pts de daño, 15pts de energia magica requerida.");
        System.out.println("\t5) Expelliarmus: \n 20pts de daño, 10pts de energia magica requerida.");
        System.out.println("\t6) Sectum: \n 15pts de daño, 8pts de energia magica requerida.");
        System.out.println("\t7) Desmaius: \n 15pts de daño, 10pts de energia magica requerida.");
        System.out.println("\t8) Petrificus totalus: \n 10 pts de daño, 5pts de energia magica requerida.");

        AttackSpell spell = new AttackSpell();

        int option = keyboard.nextInt();
        switch (option) {
            case 1:
                spell.setName("Avada Kedravra");
                spell.setDamage(100);
                spell.setMagicPower(90);
                break;
            case 2:
                spell.setName("Imperius");
                spell.setDamage(90);
                spell.setMagicPower(80);
                break;
            case 3:
                spell.setName("Cruciatus");
                spell.setDamage(90);
                spell.setMagicPower(80);
                break;
            case 4:
                spell.setName("Expulso");
                spell.setDamage(25);
                spell.setMagicPower(15);
                break;
            case 5:
                spell.setName("Expelliarmus");
                spell.setDamage(20);
                spell.setMagicPower(10);
                break;
            case 6:
                spell.setName("Sectum");
                spell.setDamage(15);
                spell.setMagicPower(8);;
                break;
            case 7:
                spell.setName("Desmaius");
                spell.setDamage(15);
                spell.setMagicPower(10);
                break;
            case 8:
                spell.setName("Petrificus totalus");
                spell.setDamage(10);
                spell.setMagicPower(5);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
        return spell;
    }

    public HealingSpell getHealingSpell(Scanner keyboard) {

        System.out.println("\nHechizos de Sanacion: ");
        System.out.println("\t1) Anapneo: \n 20pts de sanacion, 15pts energia magica requerida.");
        System.out.println("\t2) Tergeo: \n 20pts de sanacion, 15pts de energia magica requerida.");
        System.out.println("\t3) Ferula: \n 15pts de sanacion, 10pts de energia magica requerida.");
        System.out.println("\t4) Reparifors: \n 10pts de sanacion, 5pts de energia magica requerida.");
        System.out.println("\t5) Episkey: \n 5pts de sanacion, 3pts de energia magica requerida.");
        System.out.println("\t6) Vulnera Sanentur: \n 5pts de sanacion, 3pts de energia magica requerida.");

        HealingSpell spell = new HealingSpell();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                spell.setName("Anapneo");
                spell.setRecovery(20);
                spell.setMagicPower(15);
                break;
            case 2:
                spell.setName("Tergeo");
                spell.setRecovery(20);
                spell.setMagicPower(15);
                break;
            case 3:
                spell.setName("Ferula");
                spell.setRecovery(15);
                spell.setMagicPower(10);
                break;
            case 4:
                spell.setName("Reparifors");
                spell.setRecovery(10);
                spell.setMagicPower(5);
                break;
            case 5:
                spell.setName("Episkey");
                spell.setRecovery(5);
                spell.setMagicPower(3);
                break;
            case 6:
                spell.setName("Vulnera Sanentur");
                spell.setRecovery(5);
                spell.setMagicPower(3);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
        return spell;
    }

    public RecoverySpell getRecoverySpell(Scanner keyboard) {

        System.out.println("\nHechizos de Recuperacion: ");
        System.out.println("\t1) Contorsione: \n 15pts de sanacion, 8pts energia magica requerida.");
        System.out.println("\t2) Taenia: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t3) Ventriculum: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t4) Cortisem detraho: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t5) Enervate: \n 15pts de sanacion, 8pts de energia magica requerida.");
        System.out.println("\t6) Reparifors: \n 15pts de sanacion, 8pts de energia magica requerida.");

        RecoverySpell spell = new RecoverySpell();

        int option = keyboard.nextInt();

        switch (option) {
            case 1:
                spell.setName("Contorsione");
                spell.setMagicPower(15);
                spell.setMagicPower(8);
                break;
            case 2:
                spell.setName("Taenia");
                spell.setMagicPower(15);
                spell.setMagicPower(8);
                break;
            case 3:
                spell.setName("Ventriculum");
                spell.setMagicPower(15);
                spell.setMagicPower(8);
                break;
            case 4:
                spell.setName("Cortisem detraho");
                spell.setMagicPower(15);
                spell.setMagicPower(8);
                break;
            case 5:
                spell.setName("Enervate");
                spell.setMagicPower(15);
                spell.setMagicPower(8);
                break;
            case 6:
                spell.setName("Reparifors");
                spell.setMagicPower(15);
                spell.setMagicPower(8);
                break;
            default:
                System.out.println("Opcion incorrecta.");
        }
        return spell;
    }

    public void gameStarting () {
    // Es un ciclo que durará hasta que uno de los jugadores muera y se realizará por turnos (magicEnergy = 0)
        // En cada turno, el jugador debe ver el estado de su personaje (
        // hacer la elección del hechizo que desea realizar (spellCasting())
        // y todo lo que conlleva este hechizo. Luego de cada turno, se debe validar si
        //  el oponente ya está muerto, en caso afirmativo, se debe terminar el ciclo y por ende el proceso
    }

    public void spellCasting () {
        //hacer la elección del hechizo que desea realizar
    }

    public void showWinner () {
        //Muestra por pantalla el nombre del jugador que ganó y el estado de los personajes de la
        // partida (ambos personajes).
    }

}

