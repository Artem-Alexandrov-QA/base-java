public class Main {

    public static void main(String[] args) {

//        HomeCats MusyaCat = new HomeCats (); //создали объект класса HomeCats, ему выделилась память (создали реального одного кота)
//        MusyaCat.name = "Муся";
//        MusyaCat.age = 2;
//        MusyaCat.sleepOnBed(); //нашли объект(кота) и вызвали метод
//        System.out.println(MusyaCat.name);
//        System.out.println(MusyaCat.age);

        HomeCats PonchCat = new HomeCats(); //создали объект класса HomeCats, ему выделилась память (создали реального одного кота)

        PonchCat.name = "Пончик";
        PonchCat.age = 5;
        PonchCat.weight = 4;

        PonchCat.sleepOnBed(); //нашли объект(кота) и вызвали метод
        PonchCat.sleepOnBed().sleepOnBed().sleepOnBed(); // может вызвать много раз т.к. return
        System.out.println(PonchCat.name);
        System.out.println(PonchCat.age);
        PonchCat.say(); //метод say наследовался от супер-класса Cats
        PonchCat.wool = "шикарной пушистости";
        PonchCat.sayWool();

        WildCats WildCats = new WildCats(); //создали объект класса WildCats, ему выделилась память (создали реального одного кота)

        WildCats.name = "Безымянный котик";
        WildCats.age = 5;
        WildCats.sleepOnGround(); //нашли объект(кота) и вызвали метод

        System.out.println(WildCats.name);
        System.out.println(WildCats.age);
        WildCats.sayWool();

        int PonchWeight = PonchCat.getWeight();
        System.out.println(PonchWeight + 3);

    }
}