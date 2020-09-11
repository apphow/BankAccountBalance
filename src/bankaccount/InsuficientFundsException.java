package bankaccount;

public class InsuficientFundsException extends Exception {

    private String message;

    public InsuficientFundsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
