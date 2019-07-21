package Labwork;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UnitConverTer extends Application {

    ComboBox from;
    ComboBox to;

    @Override
    public void start(Stage primaryStage) {
        ComboBox option = new ComboBox(FXCollections.observableArrayList("Length", "Mass", "Temperature",
                "Time"));
        option.setValue("Length");
        ComboBox cb1 = new ComboBox(FXCollections.observableArrayList("Kilometre", "Metre", "Centimetre",
                "Mile", "Foot", "Inch"));
        ComboBox cb2 = new ComboBox(FXCollections.observableArrayList("Kilogram", "Gram", "Pound",
                "Tonne"));
        ComboBox cb3 = new ComboBox(FXCollections.observableArrayList("Celsius", "Fahrenheit", "Kelvin"));
        ComboBox cb4 = new ComboBox(FXCollections.observableArrayList("Second", "Minute", "Hour", "Day"));
        from = new ComboBox(cb1.getItems());
        from.setValue("Kilometre");
        from.setVisibleRowCount(5);
        to = new ComboBox(cb1.getItems());
        to.setValue("Metre");
        to.setVisibleRowCount(5);
        Text msg = new Text("0.00 metre");
        TextField tf = new TextField();
        tf.setText("0");
        tf.setAlignment(Pos.CENTER);
        Button convert = new Button();
        convert.setText("Convert");

        option.setOnAction((event) -> {
            Object op = option.getValue();
            System.out.println(op.toString());
            switch (op.toString()) {
                case "Length":
                    from.setItems(cb1.getItems());
                    from.setValue("Kilometre");
                    to.setItems(cb1.getItems());
                    to.setValue("Metre");
                    break;
                case "Mass":
                    from.setItems(cb2.getItems());
                    from.setValue("Kilogram");
                    to.setItems(cb2.getItems());
                    to.setValue("Gram");
                    break;
                case "Temperature":
                    from.setItems(cb3.getItems());
                    from.setValue("Celsius");
                    to.setItems(cb3.getItems());
                    to.setValue("Fahrenheit");
                    break;
                default:
                    from.setItems(cb4.getItems());
                    from.setValue("Minute");
                    to.setItems(cb4.getItems());
                    to.setValue("Second");
                    break;
            }
        });

        convert.setOnAction((event) -> {
            String rem = from.getValue().toString();
            String tar = to.getValue().toString();
            double value = Double.parseDouble(tf.getText());
            double cv = convert(value, rem, tar);
            msg.setText(String.format("%.2f %s", cv, tar.toLowerCase()));
        });

        HBox hb = new HBox(10, from, new Text("="), to);
        hb.setAlignment(Pos.CENTER);
        VBox vb = new VBox(5, option, hb, tf, convert, msg);
        vb.setAlignment(Pos.CENTER);

        Scene scene = new Scene(vb, 300, 250);

        primaryStage.setTitle("Unit Converter");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    double convert(double value, String from, String to) {
        switch (from) {
            case "Kilometre":
                value *= 1000;
                break;
            case "Centimetre":
                value /= 100;
                break;
            case "Mile":
                value *= 1609.344;
                break;
            case "Foot":
                value /= 3.281;
                break;
            case "Inch":
                value /= 39.37;
                break;
            case "Gram":
                value /= 1000;
                break;
            case "Pound":
                value /= 2.205;
                break;
            case "Tonne":
                value *= 1000;
                break;
            case "Fahrenheit":
                value = (value - 32) * 5 / 9;
                break;
            case "Kelvin":
                value -= 273.15;
                break;
            case "Second":
                value /= 60;
                break;
            case "Hour":
                value *= 60;
                break;
            case "Day":
                value *= 1440;
        }
        switch (to) {
            case "Kilometre":
                return value / 1000;
            case "Centimetre":
                return value * 100;
            case "Mile":
                return value / 1609.344;
            case "Foot":
                return value * 3.281;
            case "Inch":
                return value * 39.37;
            case "Gram":
                return value * 1000;
            case "Pound":
                return value * 2.205;
            case "Tonne":
                return value / 1000;
            case "Fahrenheit":
                return (value * 9 / 5) + 32;
            case "Kelvin":
                return value + 273.15;
            case "Second":
                return value * 60;
            case "Hour":
                return value / 60;
            case "Day":
                return value / 1440;
        }
        return value;
    }

    public static void main(String[] args) {
        launch(args);
    }

}
