import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class JavaFXExample extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create a Pane to hold all elements
        Pane root = new Pane();

        // Create a Text element
        Text text = new Text(50, 50, "Hi, Pawan Yadav");
        text.setFill(Color.BLACK); // Set text color

        // Create a Circle
        Circle circle = new Circle(100, 100, 50); // Center (100,100) and radius 50
        circle.setFill(Color.RED); // Fill color

        // Add elements to the Pane
        root.getChildren().addAll(text, circle);

        // Create a Scene
        Scene scene = new Scene(root, 300, 200); // Set scene size: 300x200

        // Set up the Stage (window)
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show(); // Display the window
    }

    public static void main(String[] args) {
        launch(args); // Launch the JavaFX application
    }
}
