package net.javaguides.springboot.controller;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFClientAnchor;
import org.apache.poi.hssf.usermodel.HSSFPatriarch;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtils;
import org.jfree.chart.JFreeChart;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
//@RequestMapping("/excel")
public class Controller {

    @GetMapping("/pie-chart")
    @ResponseBody
    public void generatePieChartExcel() throws IOException {
     //   return "Pie Chart Excel generated successfully!";
    	
    	 try (HSSFWorkbook workbook = new HSSFWorkbook()) {
             HSSFSheet sheet = workbook.createSheet("Pie Chart");

             // Create a row for the data
             HSSFRow dataRow = sheet.createRow(0);

             // Sample data
             Map<String, Double> data = Map.of(
                     "Category 1", 30.0,
                     "Category 2", 20.0,
                     "Category 3", 50.0
             );

             // Populate data into the row
             int cellIndex = 0;
             for (Map.Entry<String, Double> entry : data.entrySet()) {
                 HSSFCell cell = dataRow.createCell(cellIndex++);
                 cell.setCellValue(entry.getKey());

                 cell = dataRow.createCell(cellIndex++);
                 cell.setCellValue(entry.getValue());
             }

             // Create a drawing patriarch
             HSSFPatriarch drawing = sheet.createDrawingPatriarch();

             // Create a JFreeChart pie chart
             JFreeChart pieChart = ChartFactory.createPieChart("Pie Chart", null, true, true, false);
             int width = 300;    // Width of the chart image
             int height = 200;   // Height of the chart image

             // Save the chart as an image
             String chartImageFile = "PieChartImage.png";
             ChartUtils.writeChartAsJPEG(new FileOutputStream(chartImageFile), pieChart, width, height);

             // Add the chart image to the Excel workbook
             int col = 4; // Column to place the chart image
             int row = 1; // Row to place the chart image
             int dx1 = 0; // X coordinate of the top-left point of the cropping area
             int dy1 = 0; // Y coordinate of the top-left point of the cropping area
             int dx2 = 1023; // X coordinate of the bottom-right point of the cropping area
             int dy2 = 255;  // Y coordinate of the bottom-right point of the cropping area
             int pictureIndex = workbook.addPicture(ChartUtils.encodeAsPNG(pieChart.createBufferedImage(width, height)), HSSFWorkbook.PICTURE_TYPE_PNG);
             HSSFClientAnchor anchor = new HSSFClientAnchor(dx1, dy1, dx2, dy2, (short) col, row, (short) (col + 5), row + 10);
             drawing.createPicture(anchor, pictureIndex);

             // Write the output to a file
             try (FileOutputStream fileOut = new FileOutputStream("PieChartExample.xls")) {
                 workbook.write(fileOut);
             }
         } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
