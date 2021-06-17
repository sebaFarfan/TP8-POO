package grafico;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Farfan
 */
public class Grafico {

    public static void main(String[] args) {

        //crear conjunto de datos
        DefaultPieDataset datos = new DefaultPieDataset();
        datos.setValue("Windows", new Double(70));
        datos.setValue("iOS", new Double(15));
        datos.setValue("Linux", new Double(10));
        datos.setValue("Otros", new Double(5));

        //instanciar un gráfico
        JFreeChart grafico = ChartFactory.createPieChart(// graf de tipo circular
                "Sistemas operativos",// título																		
                datos, // datos
                true, // incluir referencias
                true, false);

        ChartPanel panel = new ChartPanel(grafico);

        //Creamos la ventana para mostrar el gráfico
        JFrame ventana = new JFrame("Grafica estadístico de uso");
        ventana.setVisible(true);
        ventana.setSize(1000, 800);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ventana.add(panel);
    }
}