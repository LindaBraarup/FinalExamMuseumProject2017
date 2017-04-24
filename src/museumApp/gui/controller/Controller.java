/*
 * Erhvervsakademi Sydvest, Computer Science 2016-2017, Carlos F. Ognissanti
 * To change this header, choose Tools | Templates
 * and open the template in the editor.
 */
package museumApp.gui.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;
import museumApp.main.MuseumApp;

/**
 *
 * @author Yuki
 */
public abstract class Controller implements Initializable
  {

    @FXML
    protected BorderPane borderPane;
    protected MuseumApp mainApp;

    public void setMainApp(MuseumApp mainApp)
      {
        this.mainApp = mainApp;
      }

    public MuseumApp getMainApp()
      {
        return mainApp;
      }

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
      {
      }

  }
