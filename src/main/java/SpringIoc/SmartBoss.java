package SpringIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jie on 2015/8/26.
 */
@Component
public class SmartBoss {

    private BookingService bookingService;

    @Autowired
    public void setBookingService(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    public BookingService getBookingService() {
        return bookingService;
    }

    public void goSomewhere() {
        bookingService.bookFlight();
    }
}