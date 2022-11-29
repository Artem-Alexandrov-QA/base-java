public class DinamoPlayer extends FootballPlayer {

    private static final String CITY = "Самара";
    private static final String CLUB = "Динамо";

    @Override
    public void sayHeight() {
        System.out.println("Меня зовут " + name + " и у меня рост 170 см");
    }

    @Override
    public void sayClub() {
        System.out.println("Клуб: " + CLUB);
    }

    @Override
    public void sayCity() {
        System.out.println("Город: " + CITY);
    }

    @Override
    public void workLeg() {
        System.out.println("Рабочая нога: Правая");
    }
}
