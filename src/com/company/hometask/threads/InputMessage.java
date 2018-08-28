package com.company.hometask.threads;

public class InputMessage {
    private String message;
    private boolean modified;

    InputMessage(String message) {
        this.message = message;
        this.modified = false;
    }

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        if (!this.message.equals(message)) {
            this.message = message;
            this.modified = true;
        }
    }

    public boolean isModified() {
        return modified;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }


}
