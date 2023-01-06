public class ExceptionInvalidRange extends Exception {
    // Constructeur par défaut c
    public ExceptionInvalidRange() {
        super();
    }

    // constructeur avec un paramètre s de type String
    // s : est un message d'erreur associé à l'exception
    public ExceptionInvalidRange(String s) {
        super(s);
    }
}
