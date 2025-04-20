package com;

import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class ScrollpaneGoodsView3 extends ScrollPane{

	SimpleDateFormat s=new SimpleDateFormat("yyyy-MM-dd");
	public ScrollpaneGoodsView3() {
		this.setStyle("-fx-border-width: 0; -fx-background-color: transparent; -fx-padding: 0;");

		VBox vbox=new VBox();
		vbox.setStyle("-fx-background-color:white");
		vbox.setSpacing(5);
		for (int i = 0; i < 5; i++) {
			HBox hbox=new HBox();
			hbox.setSpacing(10);
			for (int j = 0; j < 5; j++) {
				VBox vb=new VBox();
				vb.setSpacing(5);
				ImageView iv=new ImageView();
				Image image = new Image(getClass().getResourceAsStream("../image/5.png"));
				//Image image = new Image("file:c:\\head.png");

				iv.setImage(image);
				iv.setPreserveRatio(false);
				iv.setFitWidth(170);
				iv.setFitHeight(120);
				vb.getChildren().add(iv);
				vb.getChildren().add(new Label("  goods"));
				vb.getChildren().add(new Label("  "+s.format(new Date())));
				hbox.getChildren().add(vb);
			}
			vbox.getChildren().add(hbox);
		}
		
		
		this.setContent(vbox);
	}
}
