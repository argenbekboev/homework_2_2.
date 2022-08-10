public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Printable[] printable = {createObject("Berserk"), createObject("Evangelion"), createObject("Hellsing")};
        for (Printable print : printable) {
            print.Print();
        }
    }

    public static Printable createObject(String className) {
        switch (className) {

            case "Berserk":
                Berserk berserk = new Berserk(1997, "Kentaro Miura", "25");
                return berserk;
            case "Evangelion":
                Evangelion evangelion = new Evangelion(1995, "Hideaki anno", "26");
                return evangelion;
            case "Hellsing":
                Hellsing hellsing = new Hellsing(2000, "Kota Hirano", "13");
                return hellsing;


        }
        return null;
    }
}


