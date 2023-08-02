package lesson27_xml_json._01_txt.exeptions;

import java.util.StringJoiner;

public class TxtException extends Exception {
    private String errorLine;

    public TxtException(String errorLine, Throwable cause) {
        super(cause);
        this.errorLine = errorLine;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", TxtException.class.getSimpleName() + "[", "]")
                .add("errorLine:'" + errorLine + "'")
                .toString();
    }
}
