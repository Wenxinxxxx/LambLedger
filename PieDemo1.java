package com;

import java.util.Random;

import javafx.scene.chart.PieChart;

public class PieDemo1 extends PieChart {

	public PieDemo1() {
        String[] xColumns = {"A", "B", "C", "D", "E"};
        Random random = new Random();
        
        for (int i = 0; i < xColumns.length; i++) {
        	this.getData().add(new PieChart.Data(xColumns[i], Double.valueOf(random.nextInt(1000) + 1)));
		}
        for (PieChart.Data data : this.getData()) {
            data.nameProperty().bind(data.pieValueProperty().asString(data.getName()+":"+"%.0f"));
        }

        this.setStyle("-fx-background-color: white; -fx-padding: 20;");
        for (PieChart.Data slice : this.getData()) {
            slice.getNode().setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
        }
	}
}
