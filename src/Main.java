import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Task> taskList1 = new ArrayList<>();  // Erstellen einer leeren Liste für Task
        taskList1.add(new Task(1, "Aufgabe Nr. 1", "Implementiere Aufgabe #1")); // Aufgabe zur Liste hinzufügen
        taskList1.add(new Task(2, "Aufgabe Nr. 2", "Implementiere Aufgabe #2"));
        taskList1.add(new Task(3, "Aufgabe Nr. 3", "Implementiere Aufgabe #3"));

        List<Task> taskList2 = List.of( // Erstellen einer Task-Liste direkt mit Daten
                new Task(4, "Aufgabe Nr. 4", "Implementiere Aufgabe 4"),
                new Task(5, "Aufgabe Nr. 5", "Implementiere Aufgabe 5"),
                new Task(6, "Aufgabe Nr. 6", "Implementiere Aufgabe 6"),
                new Task(7, "Aufgabe Nr. 7", "Implementiere Aufgabe 7")
        );

        List<String> technologies1 = List.of("Java", "Go", "MySQL");
        List<String> technologies2 = List.of("Java", "C++", "MySQL", "Go");

        List<Programmer> programmers = List.of(
                new Programmer("Jack", technologies1),
                new Programmer("Lena", technologies2),
                new Programmer("Nick", List.of("Java", "Go", "MySQL"))
        );

        // Ausgabe aller Programmierer
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println("-------------------    Allen wurde Aufgabe Nr. 1 hinzugefügt");

        // Hinzufügen von Aufgabe Nr. 1 zu allen Programmierern
        for (Programmer programmer : programmers) {
            programmer.addTask(taskList1.get(0));
        }

        // Ausgabe nach dem Hinzufügen der Aufgabe
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        System.out.println("-------------------    Lena wurde Aufgabe Nr. 2 hinzugefügt");
        programmers.get(1).addTask(taskList1.get(1));  // Aufgabe Nr. 2 nur für Lena hinzufügen

        // Ausgabe nach dem Hinzufügen von Aufgabe Nr. 2
        for (Programmer programmer : programmers) {
            System.out.println(programmer);
        }

        // Überprüfen, ob Lena die Aufgabe Nr. 2 hat
        System.out.println("Hat Lena Aufgabe Nr. 2?");
        System.out.println(programmers.get(1).checkTaskByNumber(2));

        // Überprüfen, ob Jack die Aufgabe Nr. 2 hat

         }
     }