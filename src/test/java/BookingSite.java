import StepObject.BookingSteps;
import Utils.ChromeRunner;
import com.sun.net.httpserver.Authenticator;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static DataObject.BookingData.destination;

@Listeners(Utils.TestLister.class)
public class BookingSite extends ChromeRunner {
 @Test(retryAnalyzer = Authenticator.Retry.class,priority = 0)
 @Severity(SeverityLevel.CRITICAL)
 @Description("Select and search booking atributes")
    public void case3() {
        BookingSteps steps = new BookingSteps();
        steps
                .ChooseDestination(destination)
                .Checkinbtn()
                .selectdate()
                .Checkoutbtn()
                .selectdate()
                .Guestsbtn()
                .AddNumberOfAdults()
                .AddNumberOfChildren()
                .SelectAge()
                .AgeOFChildrenSection()
                .AddRoom()
                .DeleteRoom()
                .SearchInformation();
    }

    @Test(retryAnalyzer = Authenticator.Retry.class,priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check price filter,Choose hotel and room case")
    public void case4() {
        BookingSteps steps=new BookingSteps();
        steps
                .SearchInformation()
                .MainTitle()
                .CheckFilter()
                .SelectHotel()
                .SwitchWindow()
                .ChooseRoom()
                .RoomInformation()
                .NextButtonElement()
                .CloseInformationBar()
                .PriceDetails()
                .ClosePriceDetailsBar()
                .ReserveRoom();

    }
}

