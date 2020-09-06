package behavioural.chainOfResponsibility.example1;

public class Request {
    private String useHandler;
    private String message;

    public Request(String useHandler, String message) {
        this.useHandler = useHandler;
        this.message = message;
    }

    public String getUseHandler() {
        return useHandler;
    }

    public void setUseHandler(String useHandler) {
        this.useHandler = useHandler;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
