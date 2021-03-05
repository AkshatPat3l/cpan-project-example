import Service.GameService;
import interceptor.Logged;
import model.GameAdd;
import model.Games;
import javax.enterprise.inject.Model;
import javax.inject.Inject;
import java.util.List;

@Model
public class GameInventory {
    private String name;
    private double price;
    private int quantity;
    private Games.Producer producer;

    @Inject
    private GameService gameInfo;


    public List<Games> getAddedGames(){
        return gameInfo.getGames();
    }

    @Logged
    public void addGame() {

        gameInfo.add(new GameAdd(name, price, quantity, producer));

    }

    public void deleteGame(){

        gameInfo.delete(name);

    }

    public void sortGame(){

        gameInfo.sort();

    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }

    public int getQuantity() { return quantity; }

    public void setQuantity(int quantity) { this.quantity = quantity; }

    public Games.Producer getProducer() { return producer; }

    public void setProducer(Games.Producer producer) { this.producer = producer; }

    public GameService getGameInfo() { return gameInfo; }

    public void setGameInfo(GameService gameInfo) { this.gameInfo = gameInfo; }

}
