package excel;

import java.util.ArrayList;
import java.util.List;

public class ExcelReader {
    public List<String[]> readExcelData() {
        // Simulate reading rows from Excel
        List<String[]> rows = new ArrayList<>();
        rows.add(new String[]{"ID", "Name", "Department"});
        rows.add(new String[]{"1", "Alice", "Engineering"});
        rows.add(new String[]{"2", "Bob", "Sales"});
        return rows;
    }
}
