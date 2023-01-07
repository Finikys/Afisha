import org.example.AfishaManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void AllTest() {
        String film1 =  "Film I";
        String film2 =  "Film II";
        String film3 =  "Film III";
        String film4 =  "Film IV";
        String film5 =  "Film V";
        String film6 =  "Film VI";
        String film7 =  "Film VII";
        String film8 =  "Film VIII";
        String film9 =  "Film IX";
        String film10 =  "Film X";
        String film11 =  "Film XI";
        String film12 =  "Film XII";

        AfishaManager manager = new AfishaManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = { "Film I","Film II","Film III","Film IV","Film V","Film VI","Film VII","Film VIII","Film IX","Film X","Film XI","Film XII"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LastTestOver() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";
        String film9 = "Film IX";
        String film10 = "Film X";
        String film11 = "Film XI";
        String film12 = "Film XII";

        AfishaManager manager = new AfishaManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = {"Film XII", "Film XI", "Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LastTestMin() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";

        AfishaManager manager = new AfishaManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);

        String[] expected = {"Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void LastTest() {
        String film1 = "Film I";
        String film2 = "Film II";
        String film3 = "Film III";
        String film4 = "Film IV";
        String film5 = "Film V";
        String film6 = "Film VI";
        String film7 = "Film VII";
        String film8 = "Film VIII";
        String film9 = "Film IX";
        String film10 = "Film X";

        AfishaManager manager = new AfishaManager();
        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {"Film X", "Film IX", "Film VIII", "Film VII", "Film VI", "Film V", "Film IV", "Film III", "Film II", "Film I"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }







}
