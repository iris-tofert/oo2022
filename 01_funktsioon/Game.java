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
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
