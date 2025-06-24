import adapter.ExcelToJsonAdapter;
import excel.ExcelReader;
import json.JsonDataReader;

public class demo {
    public static void main(String[] args) {
        ExcelReader excelReader = new ExcelReader();
        JsonDataReader adapter = new ExcelToJsonAdapter(excelReader);

        String jsonData = adapter.getJsonData();
        System.out.println("Converted JSON:\n" + jsonData);
    }
}
