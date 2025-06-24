package adapter;

import excel.ExcelReader;
import json.JsonDataReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class ExcelToJsonAdapter implements JsonDataReader {

    private final ExcelReader excelReader;

    public ExcelToJsonAdapter(ExcelReader excelReader) {
        this.excelReader = excelReader;
    }

    @Override
    public String getJsonData() {
        List<String[]> rows = excelReader.readExcelData();

        if (rows == null || rows.isEmpty()) return "[]";

        String[] headers = rows.get(0);
        JSONArray jsonArray = new JSONArray();

        for (int i = 1; i < rows.size(); i++) {
            JSONObject obj = new JSONObject();
            for (int j = 0; j < headers.length; j++) {
                obj.put(headers[j], rows.get(i)[j]);
            }
            jsonArray.put(obj);
        }

        return jsonArray.toString(4);
    }
}
