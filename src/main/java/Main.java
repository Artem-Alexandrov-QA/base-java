public class Main {

    public static void main(String[] args) {

        SpartakPlayer spartakPlayer = new SpartakPlayer();
        ZenitPlayer zenitPlayer = new ZenitPlayer();
        DinamoPlayer dinamoPlayer = new DinamoPlayer();

        setPlayer(spartakPlayer, "Александр Соболев", "Нападающий", 24, 20);
        setPlayer(zenitPlayer, "Михаил Кержаков", "Вратарь", 26, 19);
        setPlayer(dinamoPlayer, "Антон Шунин", "Вратарь", 31, 29);
    }

    private static <T extends FootballPlayer> void setPlayer(T team, String name, String position,
                                                             Integer age, Integer countMatch) {
        team.setName(name);
        team.setPosition(position);
        team.setAge(age);
        team.setCountMatchToSeason(countMatch);
        FootballPlayer.sayCountry();
        team.sayCity();
        team.sayHeight();
        team.sayClub();
        System.out.println("Возраст:" + team.getAge());
        System.out.println("Позиция:" + team.getPosition());
        team.workLeg();
        System.out.println("Количество матчей в сезоне:" + team.getCountMatchToSeason());
        System.out.println(invitation(team));
    }

    private static String invitation(FootballPlayer player) {
        return (player.countMatchToSeason >= 20) ? "Вы приглашены, на ближайшие сборы национальной команды\n"
                : "Извините,мы не готовы вас пригласить на сборы - нужно больше матчей за сезон\n";
    }
}

