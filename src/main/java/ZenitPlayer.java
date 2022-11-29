public class ZenitPlayer extends FootballPlayer {

    private static final String CLUB = "Зенит";

    @Override
    public void sayHeight() {
        System.out.println("Меня зовут " + name + " и у меня рост 180см");
    }

    @Override
    public void sayClub() {
        System.out.println("Клуб: " + CLUB);
    }

    @Override
    public void workLeg() {
        System.out.println("Рабочая нога: Правая");
    }
}
