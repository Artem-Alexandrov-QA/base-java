public class SpartakPlayer extends FootballPlayer {

    private static final String CLUB = "Спартак";

    @Override
    public void sayHeight() {
        System.out.println("Меня зовут " + name + " и у меня рост 170 см");
    }

    @Override
    public void sayClub() {
        System.out.println("Клуб: " + CLUB);
    }

    @Override
    public void workLeg() {
        System.out.println("Рабочая нога: Левая");
    }
}

