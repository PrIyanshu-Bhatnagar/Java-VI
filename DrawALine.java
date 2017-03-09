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

public class DrawALine extends Application
{
    double x1, x2, y1, y2;
    Line line;
    Circle circle;
    Text textA;
    Pane pane;
    Scene scene;
    Color circleColor = new Color(0.1, 0.2, 0.3, 1.0); //(Red, Green, Blue, Opacity)
    Color lineColor = new Color(0.0, 1.0, 0.0, 1.0);

    public void start (Stage stage)
    {
        line = new Line();
        //line.setStartX(100); Don't need when Properties are set!
        //line.setStartY(100);
        //line.setEndX(200);
        //line.setEndY(200);

        circle = new Circle();
        //circle.setCenterX(100);
       // circle.setCenterY(100);
        circle.setRadius(40);

        textA = new Text(100, 200, "Hello");
        textA.setStroke(Color.RED);

        pane = new Pane();
        //Properties of Line
        line.startXProperty().bind(pane.widthProperty().divide(2));
        line.startYProperty().bind(pane.heightProperty().divide(2));
        line.endXProperty().bind(pane.widthProperty());
        line.endYProperty().bind(pane.heightProperty());
        line.setStroke(lineColor);

        //Properties of Circle
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.radiusProperty().bind(pane.widthProperty().divide(3));
        circle.setFill(circleColor);

        pane.getChildren().addAll(line, circle, textA);
        scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }
}