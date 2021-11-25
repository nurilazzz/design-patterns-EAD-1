package kz.adapter.task2;

import java.util.Scanner;

public class Task2Demo {
    public static void main(String[] args) {
        StockDataProvider provider = new StockDataProvider();
        Application application = new Application();
        AnalyticsLibrary library = new AnalyticsLibrary();

        XML data = provider.getData();

        boolean status = true;
        while (status) {
            System.out.println(" 1 - do simple charts with XML provided by StockDataProvider");
            System.out.println(" 2 - do 3d charts with XML provided by StockDataProvider");
            System.out.println(" 3 - do 3d charts with JSON getted somewhere");
            System.out.print(">>> ");
            int choose = new Scanner(System.in).nextInt();
            switch (choose) {
                case 1:
                    application.doCharts(data);
                    break;
                case 2:
                    AdapterXMLtoJSON xmlToJson = new AdapterXMLtoJSON();
                    xmlToJson.setXml(data);
                    application.do3dCharts(xmlToJson, library);
                    break;
                case 3:
                    JSON jsonData = new DataJSON(); // get somewhere
                    application.do3dCharts(jsonData, library);
                    break;
                case 4:
                default:
                    status = false;
                    break;
            }
        }
    }
}
