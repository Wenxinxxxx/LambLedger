package com;

import java.util.Random;

import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;

public class BarDemo1 extends VBox {


	public BarDemo1() {
        CategoryAxis xAxis = new CategoryAxis();

        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> barChart = new BarChart<>(xAxis, yAxis);

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("");
        String[] xColumns = {"A", "B", "C", "D", "E"};
        Random random = new Random();

        for (String day : xColumns) {
            series.getData().add(new XYChart.Data<>(day, random.nextInt(10000) + 1)); 
        }
        barChart.getData().add(series);
        barChart.lookupAll(".chart-bar").forEach(bar -> bar.setStyle("-fx-bar-fill: #ADD8E6;"));
        this.getChildren().add(barChart);
	}
}
