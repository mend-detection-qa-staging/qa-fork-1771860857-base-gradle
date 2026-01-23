import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Gson gson = new Gson();
        String json = gson.toJson(new Person("Alice", 30));
        System.out.println(json);
    }
    
    static class Person {
        String name;
        int age;
        
        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
}
```

**Project structure:**
```
my-project/
├── build.gradle
└── src/
    └── main/
        └── java/
            └── Main.java
