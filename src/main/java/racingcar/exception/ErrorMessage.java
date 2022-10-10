package racingcar.exception;

public enum ErrorMessage {
    INVALID_CAR_NAME_NULL("The car name cannot be null"),
    INVALID_CAR_NAME_LENGTH("Check the length of the car name"),
    INVALID_CAR_NAME_EMPTY("The car name cannot be empty");

    private final String errorMessage;

    ErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getValue() {
        return "[ERROR] " + this.errorMessage;
    }
}
