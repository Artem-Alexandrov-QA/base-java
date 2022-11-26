public class NationalTeam {
    void invitation(SpartakPlayer spartak) {
        if (spartak.countMatchToSeason >= 20) {
            System.out.println("Вы приглашены, на ближайшие сборы национальной команды\n");
        } else {
            System.out.println("Извините,мы не готовы вас пригласить на сборы - нужно больше матчей за сезон");
        }
    }

    public void invitation(ZenitPlayer zenit) {
        if (zenit.countMatchToSeason >= 20) {
            System.out.println("Вы приглашены, на ближайшие сборы национальной команды");
        } else {
            System.out.println("Извините,мы не готовы вас пригласить на сборы - нужно больше матчей за сезон\n");
        }
    }

    public void invitation(DinamoPlayer dinamo) {
        if (dinamo.countMatchToSeason >= 20) {
            System.out.println("Вы приглашены, на ближайшие сборы национальной команды");
        } else {
            System.out.println("Извините,мы не готовы вас пригласить на сборы - нужно больше матчей за сезон");
        }
    }
}
