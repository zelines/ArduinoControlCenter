package TemHm;

   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tiago
 */
import java.util.List;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class LineChart_AWT extends ApplicationFrame
{
   public LineChart_AWT( String applicationTitle , String chartTitle )
   {
      super(applicationTitle);
      JFreeChart lineChart = ChartFactory.createLineChart(
         chartTitle,
         "Registo","temperatura",
         createDataset(),
         PlotOrientation.VERTICAL,
         true,true,false);
         
      ChartPanel chartPanel = new ChartPanel( lineChart );
      chartPanel.setPreferredSize( new java.awt.Dimension( 560 , 367 ) );
      setContentPane( chartPanel );
   }

   private DefaultCategoryDataset createDataset( )
   {
       ParseFaile pf=new ParseFaile();
       List<Integer> temp=pf.getTmp();
       List<Integer> hm=pf.getHm();
       
      DefaultCategoryDataset dataset = new DefaultCategoryDataset( );
      int i=0; 
      String ii;
       for(int t=0;t<temp.size();t++){
        System.out.println(temp.get(t));
         System.out.println(hm.get(t));
          System.out.println("ggggggggggggggggg");
    }
      for (Integer temp1 : temp) {
         // ii= new Integer(i).toString();
           dataset.addValue( temp1 , "temperatura" , new Integer(i).toString() );
           i++;
       }
      i=0;
      for (Integer temp1 : hm) {
         // ii= new Integer(i).toString();
           dataset.addValue( temp1 , "humidade" , new Integer(i).toString() );
           i++;
       }
      i=0;
   /*   dataset.addValue( 15 , "schools" , "1970" );
      dataset.addValue( 30 , "schools" , "1980" );
      dataset.addValue( 60 , "schools" ,  "1990" );
      dataset.addValue( 120 , "schools" , "2000" );
      dataset.addValue( 240 , "schools" , "2010" );
      dataset.addValue( 300 , "schools" , "2014" );*/
      return dataset;
   }
   public static void main( String args[] ) 
   {
       java.awt.EventQueue.invokeLater(new Runnable() {
        @Override
        public void run() {
        LineChart_AWT chart = new LineChart_AWT("School Vs Years" ,"Numer of Schools vs years");

         chart.pack();
         RefineryUtilities.centerFrameOnScreen( chart );
        chart.setVisible( true );
        }
   }      );
}}
 