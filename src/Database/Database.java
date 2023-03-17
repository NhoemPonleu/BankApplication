package Database;

import com.istad.CreditCard;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Database {
    public static CreditCard creditCard(){
        CreditCard  creditCard=new CreditCard("djk",400.0,"Save");
        creditCard.setPinn(129);
        creditCard.setLimitAmount(8000.0);
        creditCard.setInvalidAccount(LocalDate.now()
                        .plus(1, ChronoUnit.DAYS));

        return creditCard;
    }
}
