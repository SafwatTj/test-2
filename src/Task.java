public class Task {
    private int number;
    private String title;
    private String description;

    // Konstruktor mit Validierung
    public Task(int number, String title, String description) {
        if (number < 0) {
            throw new IllegalArgumentException("Die Aufgabennummer muss positiv sein.");
        }
        this.number = number;
        this.title = title;
        this.description = description;
    }

    // Überschreiben der toString-Methode, um die Aufgabe formatiert auszugeben
    @Override
    public String toString() {
        return String.format("%02d. %s [%s]", number, title, description);
    }

    // Getter für die Nummer der Aufgabe
    public int getNumber() {
        return number;
    }
}
