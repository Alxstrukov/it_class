package lesson25_remind.exceptions;

public class CompetitionException extends Exception {
    private final String errorLine;

    public CompetitionException(Throwable cause, String errorLine) {
        super(cause);
        this.errorLine = errorLine;
    }

    public String getErrorLine() {
        return errorLine;
    }
}
