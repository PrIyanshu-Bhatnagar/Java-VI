import javafx.scene.*;
import javafx.scene.shape.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
//import javafx.scene.event.*;
import javafx.scene.canvas.*;
import javafx.scene.text.*;
import javafx.stage.Stage;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.application.*;
import javafx.scene.input.*;
import javafx.scene.text.*;

public class KeyEvents implements Application
{
    Pane pane = new Pane();
    Scene scene;
    Text text = new Text (200, 200, "H");

    public void start(Stage stage)
    {
        KeyHandler kh = new KeyHandler();
        text.setOnKeyPressed(kh);
        pane.getchildren().add(text);
        scene = new Scene (pane, 200, 200);
        stage.setTitle("KBD Events");
        stage.setScene(scene);
        stage.show();
        //text.requestFocus();
    }

    private class KeyHandler implements EventHandler
    {
        public void handle (KeyEvent ke)
        {
            switch (ke.getCode())
            {
                case UP:
                            text.setY (text.getY() - 10);
                        break;
                case DOWN:
                            text.setY (text.getY() + 10);
                        break;
                case LEFT:
                            text.setX (text.getX() - 10);
                        break;
                case RIGHT:
                            text.setX (text.getX() + 10);
                        break;
                default:
                            if (Character.isLetterOrDigit(ke.getText().charAt(0))) text.setText(ke.getText);
                        break;
            }
        }
    }
}
