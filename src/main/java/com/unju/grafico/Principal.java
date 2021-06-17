/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unju.grafico;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
/**
 *
 * @author D.C
 */
public class Principal {

    public static void main(String[] args) {

        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Internacional", new Double(70));
        datos.setValue("Sociedad", new Double(15));
        datos.setValue("Cronica social", new Double(10));
        datos.setValue("Deportes", new Double(5));

        JFreeChart grafico = ChartFactory.createPieChart(// graf de tipo circular
                "Visitas de las redes sociales",// título																		
                datos, // datos
                true, // incluir referenciasXX
                true, false);

        ChartPanel panel = new ChartPanel(grafico);

        JFrame ventana = new JFrame("Grafica estadístico de uso en particular");
        ventana.setVisible(true);
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.add(panel);
    }
    
}
