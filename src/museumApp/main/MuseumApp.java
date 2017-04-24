/*
 * Erhvervsakademi Sydvest, Computer Science 2016-2017, Carlos F. Ognissanti
 * To change this header, choose Tools | Templates
 * and open the template in the editor.
 */
package museumApp.main;

import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import museumApp.gui.controller.MainViewController;

/**
 *
 * @author Yuki
 */
public class MuseumApp extends Application
  {

    @Override
    public void start(Stage stage) throws IOException
      {
        initRootLayout(stage);
      }

    /**
     * Initializes the root layout.
     *
     * @param stage
     */
    public void initRootLayout(Stage stage)
      {
        try
        {
            FXMLLoader loader = new FXMLLoader(this.getClass().getResource("view/MainView.fxml"));
            Parent root = loader.load();
            // Give the controller access to the main app.
            MainViewController controller = loader.getController();
            controller.setMainApp(this);
            Scene scene = new Scene(root);
            stage.initStyle(StageStyle.UNDECORATED);
            stage.show();
            stage.setScene(scene);
//            stage.getIcons().add(new Image(""));
            stage.centerOnScreen();
            stage.setMaximized(true);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
      }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
      {
        launch(args);
      }

  }
