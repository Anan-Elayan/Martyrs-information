package Martyrs;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;

public class LocationPane extends Pane {
	
	private Button btnInsert = new Button("Insert");
	private Button btnDelete = new Button("Delete");
	private Button btnUpdate = new Button("Update ");
	private Button btnSearch = new Button("Load Martyrs ");

	private Button btnNewSavenew = new Button("Update Now");
	private Label lblLocatione = new Label("Location");
	private Label lblNewName = new Label("New\nLocation");
	
	private TextField txtNewName = new TextField();
	public static TextField txtLocation = new TextField();

	private String btnStyle = "-fx-background-color:black;" + "-fx-border-color:white;"
			+ "-fx-background-radius:10 50 10 50;" + "-fx-border-radius:10 50 10 50;" + "-fx-text-fill:f2bd12";
	private Font font = Font.font("Arial Black", FontPosture.REGULAR, 10);
	

	public LocationPane() {

		lblLocatione.setStyle("-fx-text-fill:cd9b05;-fx-font-size:15");
		lblLocatione.setLayoutX(25);
		lblLocatione.setLayoutY(61);
		txtLocation.setPrefHeight(25);
		txtLocation.setPrefWidth(370);
		txtLocation.setLayoutX(90);
		txtLocation.setLayoutY(59);

		btnInsert.setStyle(btnStyle);
		btnInsert.setFont(font);
		btnInsert.setPrefHeight(27);
		btnInsert.setPrefWidth(102);
		btnInsert.setLayoutX(400);
		btnInsert.setLayoutY(400);

		btnDelete.setStyle(btnStyle);
		btnDelete.setFont(font);
		btnDelete.setPrefHeight(27);
		btnDelete.setPrefWidth(102);
		btnDelete.setLayoutX(275);
		btnDelete.setLayoutY(400);

		btnUpdate.setStyle(btnStyle);
		btnUpdate.setFont(font);
		btnUpdate.setPrefHeight(27);
		btnUpdate.setPrefWidth(102);
		btnUpdate.setLayoutX(25);
		btnUpdate.setLayoutY(400);

		btnSearch.setStyle(btnStyle);
		btnSearch.setFont(font);
		btnSearch.setPrefHeight(27);
		btnSearch.setPrefWidth(102);
		btnSearch.setLayoutX(150);
		btnSearch.setLayoutY(400);
		
		setActions();
		
		this.setLayoutX(20);//pane
		this.getChildren().addAll();
		lblNewName.setStyle("-fx-text-fill:cd9b05; -fx-font-size:15");
		lblNewName.setLayoutX(25);
		lblNewName.setLayoutY(98);

		txtNewName.setPrefHeight(25);
		txtNewName.setPrefWidth(370);
		txtNewName.setLayoutX(90);
		txtNewName.setLayoutY(98);

		btnNewSavenew.setStyle(btnStyle);
		btnNewSavenew.setLayoutX(95);
		btnNewSavenew.setLayoutY(150);
		btnNewSavenew.setPrefWidth(350);

		txtNewName.setVisible(false);
		lblNewName.setVisible(false);
		btnNewSavenew.setVisible(false);
		this.getChildren().addAll(lblNewName, txtNewName, btnNewSavenew, lblLocatione, txtLocation, btnInsert,
				btnDelete, btnSearch, btnUpdate);

	}

	
	// method that have all actions in location scene
	private void setActions() {
		
		
		btnInsert.setOnAction(e2 -> {//  action insert (add new location)

			txtNewName.setVisible(false);
			lblNewName.setVisible(false);
			btnNewSavenew.setVisible(false);

			if (txtLocation.getText().trim().isEmpty()) {
				new Warning("\t    oooops!! \n Please write the Location");
				return;
			}
			if (GUI.data.search(txtLocation.getText()) == null){ // not exit location input
				NodeDoubleLinkedList node = new NodeDoubleLinkedList(txtLocation.getText()); // Create new node in double linked list with location input
				GUI.data.addNodeSorted(node);// node double added sorted
				new Warning("Added Successfully");

			} else {
				new Warning("The Location is Existing");
			}
		});

		
		
		
		btnDelete.setOnAction(e2 -> { // action delete (remove location)
			txtNewName.setVisible(false);
			lblNewName.setVisible(false);
			btnNewSavenew.setVisible(false);

			if (txtLocation.getText().trim().isEmpty()) { // empty text filed
				new Warning("\t    oooops!! \n Please write the Location");
			} else {
				NodeDoubleLinkedList node = new NodeDoubleLinkedList(txtLocation.getText());

				if (GUI.data.search(node.getLocation()) != null) { //exit this node 
					GUI.data.removeObj(node);
					new Warning("Deleted Successfully");

				} else {
					new Warning("Not Found Location");//not exit this location
				}
				//GUI.data.printList();
			}
		});

		
		
		btnUpdate.setOnAction(e2 -> { // action update in location scene
			txtNewName.setVisible(true);
			lblNewName.setVisible(true);
			btnNewSavenew.setVisible(true);

			btnNewSavenew.setOnAction(e -> { // action save 
				if (txtLocation.getText().trim().isEmpty()) {
					new Warning("\t    oooops!! \n Please Enter The Data");
					return;
				}

				String location = txtLocation.getText().trim();
				if (location.isEmpty()) { // if is empty
					new Warning("Please enter the old name of the location");
					return;
				}
				NodeDoubleLinkedList locationNode = GUI.data.search(location);
				if (locationNode != null) { /// exit node
					String newLocation = txtNewName.getText().trim();
					
					if (newLocation.isEmpty()) {//second text filed is empty
						new Warning("Please enter the new name");
						return;
					} 
					else {
						if (GUI.data.search(newLocation) != null) { // new name = anther old location
							new Warning(newLocation + " is already exists");
							return;
						}
						locationNode.setLocation(newLocation);//set new name to beast name
						//System.out.println(locationNode.getLocation());
						new Warning("Updated Succsessfully");
						txtNewName.setVisible(false);
						lblNewName.setVisible(false);
						btnNewSavenew.setVisible(false);
						txtNewName.clear();
						txtLocation.setText(newLocation);
					}
				} else {
					new Warning("There are no location with name: " + location);
				}
			});

		});

		
		
		btnSearch.setOnAction(ew -> {  // action to search a search 
			txtNewName.setVisible(false);
			lblNewName.setVisible(false);
			btnNewSavenew.setVisible(false);
			String location = LocationPane.txtLocation.getText().trim();
			if (location.isEmpty()) {
				new Warning("Please enter the lcoation");//text filed name location is empty
				return;
			}
			NodeDoubleLinkedList locationNode = GUI.data.search(location);
			if (locationNode != null) {//exit node
				this.getChildren().clear();//clear pane
				this.getChildren().add(new MartyrPane(locationNode));// go to page martyrs
			} else {
				new Warning(location + " not exists");
			}
		});
	}
}
