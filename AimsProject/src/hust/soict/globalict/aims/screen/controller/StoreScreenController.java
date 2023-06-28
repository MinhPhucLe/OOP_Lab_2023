package hust.soict.globalict.aims.screen.controller;

import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.screen.Main;
import hust.soict.globalict.aims.store.Store;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.*;

import java.util.*;
public class StoreScreenController {
    @FXML
    private BorderPane root;
    @FXML
    private GridPane grid;
    private Store store;
    public StoreScreenController(Store store){
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/StoreScreen.fxml"));
        loader.setController(this);
        this.store = store;
        try {
            root = loader.load();
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
    public void add(VBox box){
        box.getChildren().add(root);
    }

    public void setGrid(){
        ArrayList<Media>items = store.getItemInStore();

        int col = 0 , row = 1;
        grid.setPadding(new Insets(10,10,10,10));
        for(Media item : items){
            MediaController controller = new MediaController(item);
            controller.setTitle(item.getTitle());
            controller.setType();
            controller.setPlayButton();
            if(col == 3){
                col = 0;
                row++;
            }
            controller.add(grid,col++,row);
        }
    }
    @FXML
    public void showStore(ActionEvent event){ Main.callPage("store");}
    @FXML
    public void showCart(ActionEvent event){
        Main.callPage("cart");
    }
    @FXML
    public void showAddBook(ActionEvent event){
        Main.callPage("add-book");
    }
    @FXML
    public void showAddCD(ActionEvent event){
        Main.callPage("add-cd");
    }
    @FXML
    public void showAddDVD(ActionEvent event){
        Main.callPage("add-dvd");
    }
}