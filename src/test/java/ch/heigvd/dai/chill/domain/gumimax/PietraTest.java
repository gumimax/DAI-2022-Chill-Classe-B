package ch.heigvd.dai.chill.domain.gumimax;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PietraTest {


    @Test
    void thePriceAndNameForPietraShouldBeCorrect() {
        Pietra beer = new Pietra();
        assertEquals(beer.getName(), Pietra.NAME);
        assertEquals(beer.getPrice(), Pietra.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPietra() {
        Bartender jeanne = new Bartender();
        String productName = "ch.heigvd.dai.chill.domain.gumimax.Pietra";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jeanne.order(request);
        BigDecimal expectedTotalPrice = Pietra.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}


