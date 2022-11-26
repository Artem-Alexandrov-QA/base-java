public class ZenitPlayer extends FootballPlayer {

    public ZenitPlayer(String name) {
        super(name);
    }

    void sayHeight() {
        System.out.println("Меня зовут " + name + " и у меня рост 180см");
    }

    public void workLeg() {
        System.out.println("Рабочая нога:Правая");
    }
}
