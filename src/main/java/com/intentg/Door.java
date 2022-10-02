package com.intentg;

public class Door implements Checkable {

    private boolean isOpen = false;
    private boolean isLocked = true;



    public void open () {
        if (!isOpen()) {
            setOpen(true);
            System.out.println("___Дверь открыта");
        }
        else {
            System.out.println("Дверь уже открыта");
        }
    }

    public void close () {
        if (isOpen()) {
            setOpen(false);
            System.out.println("___Дверь закрыта");
        }
        else {
            System.out.println("Дверь уже закрыта");
        }
    }

    public void lock () {
        if (!isLocked()) {
            setLocked(true);
            System.out.println("___Дверь заблокированна");
        }
        else {
            System.out.println("Дверь уже заблокированна");
        }
    }

    public void unlock () {
        if (isLocked()) {
            setLocked(false);
            System.out.println("___Дверь разблокированна");
        }
        else {
            System.out.println("Дверь уже разблокированна");
        }
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
    @Override
    public void check() {
    }


}
