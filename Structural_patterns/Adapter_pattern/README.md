
---

### ✅ Here's a complete `README.md` file for your project:

```markdown
# Adapter Pattern – Excel to JSON Converter

## 📌 Overview

This project demonstrates the **Adapter Design Pattern** by converting tabular Excel-style data into JSON format using an adapter class.

It bridges incompatible interfaces by adapting an existing `ExcelReader` to a target interface `JsonDataReader`.

---

## 🏗️ Project Structure

```
```
src/
├── adapter/
│   └── ExcelToJsonAdapter.java       # The adapter class implementing JSON conversion
├── excel/
│   └── ExcelReader.java              # Simulates reading Excel-like data
├── json/
│   └── JsonDataReader.java           # Target interface expected by JSON clients
├── demo.java                         # The client/main class to test the adapter
└── lib/
└── json-20231013.jar             # External library (only needed for org.json version)
```


----

## ▶️ How to Run

### ❗ Option 1: Using `org.json` (with JAR)
1. Download [`json-20231013.jar`](https://repo1.maven.org/maven2/org/json/json/20231013/json-20231013.jar) and place it in the `lib/` folder.
2. Compile:
   ```sh
   javac -cp ".;lib/json-20231013.jar" adapter/*.java excel/*.java json/*.java demo.java


3. Run:

   ```sh
   java -cp ".;lib/json-20231013.jar" demo
   ```

----

### ❗ Option 2: Pure Java version (no JSON library)

> If you've refactored the code to **not use `org.json`**, you can skip the JAR:

1. Remove all `org.json` imports and build JSON using `StringBuilder`.
2. Then compile and run:

   ```sh
   javac adapter/*.java excel/*.java json/*.java demo.java
   java demo
   ```

---

## 🧠 Design Pattern Used

**Adapter Pattern**

> Allows classes with incompatible interfaces to work together by converting the interface of one class (`ExcelReader`) into another (`JsonDataReader`).

---

## 🧪 Sample Output

```json
[
    {
        "ID": "1",
        "Name": "Alice",
        "Department": "Engineering"
    },
    {
        "ID": "2",
        "Name": "Bob",
        "Department": "Sales"
    }
]
```

---




