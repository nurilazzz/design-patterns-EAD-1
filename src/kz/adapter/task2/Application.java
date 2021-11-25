package kz.adapter.task2;

public class Application {
    public void doCharts(XML data){
        System.out.println("We've made charts on XML");
    }

    public void do3dCharts(JSON json, AnalyticsLibrary library){
        library.draw3dChartJSON(json);
    }
}
