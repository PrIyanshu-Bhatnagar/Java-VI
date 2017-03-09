import javafx.scene.*;
import javafx.scene.line.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.pane.*;
import javafx.scene.paint.*;
import javafx.scene.event.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.application.*;

public class DrawALine extends Application
{
    double x1, x2, y1, y2;
    Line line;
    Pane pane;
    Scene scene;

    public void start (Stage Stage)
    {
        line = new Line();
        line.setStartX(100);
        line.setStartY(100);
        line.setEndX(200);
        line.setEndY(200);
        pane = new Pane();
        pane.getChildren().add(line);
        scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}