package SpringIoc;

import org.springframework.stereotype.Component;

/**
 * Created by jie on 2015/8/26.
 */
@Component
public class QunarBookingService implements BookingService {
    public void bookFlight() {
        System.out.println("book fight by Qunar!");

    }
}