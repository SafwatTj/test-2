import java.util.ArrayList;
import java.util.List;

public class Programmer {

    private String name;
    private List<Task> tasks;
    private List<String> technologies;

    // Konstruktor
    public Programmer(String name, List<String> technologies) {
        this.name = name;
        this.technologies = technologies;
        tasks = new ArrayList<>();
    }

    // Überschreiben der toString-Methode, um Programmiererinformationen auszugeben
    @Override
    public String toString() {
        return name + " " + technologies + " tasks=" + tasks;
    }

    // Methode zum Hinzufügen einer Aufgabe, die Duplikate verhindert
    public void addTask(Task task) {
        if (!checkTaskByNumber(task.getNumber())) {
            tasks.add(task);
        } else {
            System.out.println("Task mit Nummer " + task.getNumber() + " ist bereits vorhanden.");
        }
    }

    // Gibt die Liste der Aufgaben zurück
    public List<Task> getTasks() {
        return tasks;
    }

    // Überprüft, ob der Programmierer eine Aufgabe mit der angegebenen Nummer hat
    public boolean checkTaskByNumber(int number) {
        // Verbesserter for-each-Loop
        for (Task task : tasks) {
            if (task.getNumber() == number) {
                return true;
            }
        }
        return false;
    }
}
