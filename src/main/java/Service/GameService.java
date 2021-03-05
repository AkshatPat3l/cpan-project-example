package Service;


import model.GameAdd;
import model.Games;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@ApplicationScoped
public class GameService implements GameManager {
    private List<Games> games;

    @PostConstruct
    public void addedGames(){
        games = new ArrayList<>();
        games.add(new GameAdd("COD:Modern Warfare",40.99,10, Games.Producer.ACTIVISION));
        games.add(new GameAdd("Watchdogs",0.00,40, Games.Producer.RIOT));
        games.add(new GameAdd("Valorant",19.99,30, Games.Producer.UBISOFT));
    }
    @Override
    public List<Games> getGames() {
       return games;
    }

    @Override
    public void add( GameAdd game) {
        games.add(game);
    }

    @Override
    public void sort() {
        Collections.sort(games, new Comparator<Games>() {
            @Override
            public int compare(Games o1, Games o2) {
               return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void delete(String name) {
        for(int i = 0; i < games.size(); i++){
            if(games.get(i).getName().equals(name)){
                games.remove(i);
            }
        }
    }
}
