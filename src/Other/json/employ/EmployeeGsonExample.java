package json.employ;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeGsonExample {
    public static void main(String[] args) throws IOException {
        Employee epm = createEmployee();

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String fileDate = new String(Files.readAllBytes(Paths.get("data/employ.json")));

        Employee emp1 = gson.fromJson(fileDate, Employee.class);

        System.out.println("Employee Object " + emp1);

        String jsonEmp = gson.toJson(epm);
        System.out.println(jsonEmp);
    }
    public static Employee createEmployee() {
        Employee emp = new Employee();
        emp.setId(100);
        emp.setName("David");
        emp.setPermanent(false);
        emp.setPhoneNumbers(new long[] { 123456, 987654 });
        emp.setRole("Manager");

        Address add = new Address();
        add.setCity("Bangalore");
        add.setStreet("BTM 1st Stage");
        add.setZipcode(560100);
        emp.setAddress(add);

        List<String> cities = new ArrayList<>();
        cities.add("Los Angleles");
        cities.add("New York");
        emp.setCities(cities);

        Map<String, String> props = new HashMap<String, String>();
        props.put("salary", "1000 Rs");
        props.put("age", "28 years");
        emp.setProperties(props);
        return emp;
    }
}
