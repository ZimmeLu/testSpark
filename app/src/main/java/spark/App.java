/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package spark;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        Spark.get("/welcome"
        , (req, res) -> {
        return "Hallo Lukas, wie läufts? :)";
        });
        Spark.get("/goodbye"
        , (req, res) -> {
        return "Tschüss!";
        });
    }}
    

