import javafx.application.Application;
import javafx.stage.Stage;

public class MyFirstApplication extends Application {
    @Override
    public void init() throws Exception{
        System.out.println("Before");
    }
    @Override
    public void start(Stage stage) {
        stage.setTitle("Hello World");
        stage.show();



    }
    @Override
    public void stop() throws Exception{
        System.out.println("After");
    }
}
