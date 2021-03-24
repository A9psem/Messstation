import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Parent;

public class App extends Application
{
    
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Model model = new Model();
    
        Controller c = new Controller();
        c.setModel(model);
        Messwert m1 = new Messwert("10:00", "1.1.10", 1, 2);
        c.aktualisieren(m1);
        c.allesAusgeben();
       
    }

}
