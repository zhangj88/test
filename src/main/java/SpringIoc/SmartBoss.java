package SpringIoc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by jie on 2015/8/26.
 */
@Configuration
@Component
public class SmartBoss implements Boss{

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