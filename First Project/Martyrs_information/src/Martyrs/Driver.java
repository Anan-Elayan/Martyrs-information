package Martyrs;

import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.*;
public class Driver extends Application {

	GUI objGUI;

	@Override
	public void start(Stage MainStage) throws Exception {

		
		// First Window
		objGUI = new GUI(MainStage);
		MainStage.setResizable(false);
		MainStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
