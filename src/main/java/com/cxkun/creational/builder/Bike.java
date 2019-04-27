package com.cxkun.creational.builder;

public class Bike {
    private Frame frame;
    private Seat seat;
    private Tire tire;

    public Frame getFrame() {
        return frame;
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void desc() {
        if (frame != null) {
            frame.desc();
        }
        if (seat != null) {
            seat.desc();
        }
        if (tire != null) {
            tire.desc();
        }
    }
}
