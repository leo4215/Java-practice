package model.entities;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import model.exceptions.DomainException;

public class Reservation {

    private Integer roomNumber;
    private LocalDate checkin;
    private LocalDate checkout;

    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Reservation(Integer roomNumber, LocalDate checkin, LocalDate checkout) {
        if (checkin.isAfter(checkout)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.roomNumber = roomNumber;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

    public LocalDate getCheckin() {
        return checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public long duration() {
        Duration duration = Duration.between(checkin.atStartOfDay(), checkout.atStartOfDay());      
        return duration.toDays();
    }   

    public void updateDates(LocalDate checkin, LocalDate checkout) {
        if (checkin.isBefore(LocalDate.now()) || checkout.isBefore(LocalDate.now())) {
            throw new DomainException("Reservation dates for update must be future dates");
        } 
        if (checkin.isAfter(checkout)) {
            throw new DomainException("Check-out date must be after check-in date");
        } 
        this.checkin = checkin;
        this.checkout = checkout;
    }

    @Override
    public String toString() {
        return "Room "
            + roomNumber
            + ", check-in: "
            + checkin.format(fmt)
            + ", check-out: "
            + checkout.format(fmt)
            + ", " 
            + duration() 
            + " nights";
    }
}