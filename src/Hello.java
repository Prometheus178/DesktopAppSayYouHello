import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Hello extends Application {
    TextField tf;
    Label response;
    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage myStage){
        myStage.setTitle("Hello");
        FlowPane rootNode = new FlowPane(10 , 10);
        rootNode.setAlignment(Pos.CENTER);
        Scene MyScene = new Scene(rootNode,500,300);
        myStage.setScene(MyScene);
        response = new Label("Enter name: ");
        Button bt = new Button("OK");
        tf = new TextField();
        tf.setPromptText("Enter a name...");
        tf.setOnAction((ae) -> response.setText("Enter pressed. Hi "+tf.getText()));
        bt.setOnAction((ae) -> response.setText("Button pressed. Hi " +tf.getText()));
        rootNode.getChildren().addAll(tf,bt,response);
        myStage.show();
    }
}