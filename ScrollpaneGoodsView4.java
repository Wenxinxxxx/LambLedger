package com;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Separator;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ScrollpaneGoodsView4 extends ScrollPane{

	SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
	public ScrollpaneGoodsView4() {
		this.setStyle("-fx-border-width: 0; -fx-background-color: transparent; -fx-padding: 0;");

		VBox vbox=new VBox();
		vbox.setStyle("-fx-background-color:white");
		vbox.setSpacing(10);
		for (int i = 0; i < 8; i++) {
			HBox hbox=new HBox();
			hbox.setSpacing(4);
			ImageView iv=new ImageView();
			Image image = new Image(getClass().getResourceAsStream("../image/7.png"));
			iv.setImage(image);
			iv.setPreserveRatio(false);
			iv.setFitWidth(80);
			iv.setFitHeight(80);
			hbox.getChildren().add(iv);
			VBox vb=new VBox();
			vb.setSpacing(2);
			vb.getChildren().add(new Label("Title goes here"));
			vb.getChildren().add(new Label("Caption line 1 here........................................................"));
			vb.getChildren().add(new Label("Caption line 2 here........................................................"));
			hbox.getChildren().add(vb);
			vbox.getChildren().add(hbox);
			Separator sep=new Separator();
			vbox.getChildren().add(sep);
		}
		
		this.setContent(vbox);
	}
}
