package com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;

public class MutiLineDemo1 extends VBox {


	public MutiLineDemo1() {
		SimpleDateFormat s=new SimpleDateFormat("yyyy");
        CategoryAxis xAxis = new CategoryAxis();

        NumberAxis yAxis = new NumberAxis();

        LineChart<String, Number> barChart = new LineChart<>(xAxis, yAxis);

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("A");
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("B");
        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("C");
        String[] xColumns = {"1", "2", "3", "4", "5"};
        Random random = new Random();

        for (String day : xColumns) {
            series.getData().add(new XYChart.Data<>(day, random.nextInt(10000) + 1)); 
            series2.getData().add(new XYChart.Data<>(day, random.nextInt(10000) + 1)); 
            series3.getData().add(new XYChart.Data<>(day, random.nextInt(10000) + 1)); 
        }
        barChart.getData().addAll(series,series2,series3);
        this.getChildren().add(barChart);
	}
}
