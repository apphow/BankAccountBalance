package bankaccount;

class InsufficientFundException extends Exception {

    private String message;

    public InsufficientFundException (String message) {
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
