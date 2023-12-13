package design_patterns.creational_design_patterns.prototype_registry.prototype_with_registry;

import java.util.Map;
import java.util.HashMap;

public class StudentRegistry {

    private Map<String, Student> studentMap = new HashMap<>();

    void register(String key, Student student) {
        studentMap.put(key, student);
    }

    Student get(String key){
        return studentMap.get(key).copy();
    }
}
