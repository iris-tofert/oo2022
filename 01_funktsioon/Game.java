import java.util.Scanner;

public class Game {
    // main -> pakub
    public static void main(String[] args) {
        // sout pakub
        System.out.println("Hello World!");
        // String - sõnaline muutuja (nb suure tähega)
        // char - üks täht
        //double - 15kohaline arv (pärast koma)
        // float - 7kohaline arv (pärast koma)
        // int - täisarv 2.1 milj (enim kasutatud)
        // byte - 128kohaline
        // short - 32000kohaline
        // long - 9,223,372,036,854,775,807 suur arv
        //boolean - true or false kahendväärtus
        int worldHeight = 5;
        int worldWidth = 10;
        // Math.random() 0..0.9999
        int PlayerCoordinateY = generateRandomCoordinates(worldHeight);
        int PlayerCoordinateX = generateRandomCoordinates(worldWidth);
        System.out.println(PlayerCoordinateX);
        int EnemyCoordinateY = generateRandomCoordinates(worldHeight);
        int EnemyCoordinateX = generateRandomCoordinates(worldWidth);

        printMap(worldHeight,worldWidth, PlayerCoordinateY, PlayerCoordinateX, EnemyCoordinateY, EnemyCoordinateX);

        //klasside tegemine
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {  //ei võrdu != ei tööta klasside puhul, kuna mälukohad on erinevad, tuleb kasutada !.equals
            //kontrollib ühte muutujat mingite väärtuste vastu
            switch (input) {
                case "a":
                    PlayerCoordinateX--;
                    break;
                case "s":
                    PlayerCoordinateY++;
                    break;
                case "d":
                    PlayerCoordinateX++;
                    break;
                case "w":
                    PlayerCoordinateY--;
                    break;
            }

            printMap(worldHeight,worldWidth, PlayerCoordinateY, PlayerCoordinateX, EnemyCoordinateY, EnemyCoordinateX);
            input = scanner.nextLine(); //joon all tähendab muutuvas seisundis olev muutuja
        }
    }
    // int -- sama tüüp, mis peab olema funktsiooni sees return järgi
    public static int generateRandomCoordinates(int worldSize) {
        return (int) (Math.random()*(worldSize-2))+1;

    }
    // deklareerin kõik muutujad mis funktsiooni sees on
    public static void printMap(int worldHeight, int worldWidth, int PlayerCoordinateY, int PlayerCoordinateX, int EnemyCoordinateY, int EnemyCoordinateX) {
        // fori tsükkel pakub
        char symbol;            //deklareerib üks kord, mitte iga kord läbi tsükli
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                // || on või
                if (y == 0|| y== worldHeight-1) { //primitiiv or andmebaasipäring (ehk lihtsad asjad vasakule)
                    symbol = '-';
                } else if (x == 0 || x == worldWidth-1) {
                    symbol = '|';
                }else {
                    symbol = ' ';
                }
                if (PlayerCoordinateY == y && PlayerCoordinateX == x) {
                    symbol = 'x';
                }
                if (EnemyCoordinateY == y && EnemyCoordinateX == x) {
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }

    }
}
