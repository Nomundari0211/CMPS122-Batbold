package  ErrorHandling;
import java.util.ArrayList;

public class ErrorHandling {
    String errorMessage;
    int errorCode;
    String lastError;
    private ArrayList<String> errorLog;

    public ErrorHandling(
        String errorMessage,
        int errorCode,
        String lastError 
        ) {
            this.errorMessage =  "Invalid";
            this.errorCode = errorCode;
            this.lastError = lastError;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void setLastError(String lastError) {
        this.lastError = lastError;
    }

    public void start() {
        System.out.println(errorMessage);
    }

}