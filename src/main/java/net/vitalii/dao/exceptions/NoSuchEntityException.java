package net.vitalii.dao.exceptions;

public class NoSuchEntityException extends DaoBusinessException {
    public NoSuchEntityException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoSuchEntityException(String message) {
        super(message);
    }
}
