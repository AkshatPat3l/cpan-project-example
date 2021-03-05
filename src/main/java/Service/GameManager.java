package Service;

import model.GameAdd;
import model.Games;

import java.util.List;

public interface GameManager {

    List<Games> getGames();

    void add(GameAdd games);

    void sort();

    void delete(String name);

}
