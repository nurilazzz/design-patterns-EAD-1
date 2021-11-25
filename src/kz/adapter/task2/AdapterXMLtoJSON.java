package kz.adapter.task2;

public class AdapterXMLtoJSON implements JSON {
    XML xml;

    public void setXml(XML xml) {
        this.xml = xml;
    }

    @Override
    public void doSmthWithJSON() {
        xml.doSmthWithXML();
    }
}
