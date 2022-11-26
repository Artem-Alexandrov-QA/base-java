public class DinamoPlayer extends FootballPlayer {

    String city = "Самара";
    public DinamoPlayer(int countMatchToSeason) {
        super(countMatchToSeason);
    }
    public DinamoPlayer(String name) {
        super(name);
    }

    void sayHeight(){
        System.out.println("Меня зовут " +name+" и у меня рост 170 см");
    }
    @Override
    public void sayCity(){
        System.out.println(city);
    }

    public void workLeg() {
        System.out.println("Рабочая нога:Правая");
    }
}
