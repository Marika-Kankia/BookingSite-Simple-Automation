package PageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class BookingPage {
    protected SelenideElement
    choosedestination=$(byAttribute("name", "q-destination")),
    date=$("._1ZtnNu"),
    currentmonth=$("._3LBdi8"),
    nextbtn=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/button[2]")),
    selectday=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/table/tbody/tr/td[contains(text(),'\"+date+\"')]\"")),
    checkoutbtn=$("._1yFrqc._1RdfF-"),
    checkoutdate=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[1]/div[2]/div[1]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[7]/button")),
    guests=$(byText("Guests")),
    addadultsquantity=$("._1wp43W", 0),
    addchildren=$("._1wp43W", 1),
    ageofchildsection=$("._2v9X4l"),
    selectage=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div[3]/div/div/select")),
    addaroom=$(".uolsaJ.WxdyDo"),
    deletearoom=$("._23Lf5I._3ZW5IO", 4),
    searchbtn=$(byXpath("//*[@id=\"main\"]/div[1]/div[2]/div/form/div[2]/div[3]/button")),
    maintitle=$("._3M-txP"),
    filterbtn=$("._1GKI32", 2),
    filteroption=$(byText("Price (low to high)")),
    selecthotel=$(By.id("2")),
    chooseroom=$(byText("Choose room")),
    roominformation=$(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[1]/div[2]/div[2]/button")),
    nextbuttonelement=$(byXpath("//*[@id=\"modal-panel-room-property-information13-0\"]/section/div/section/div/div/button[3]")),
    closeinformationbar=$(".modal-button.modal-button-close"),
    pricedetails=$(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/button")),
    closepricedetailsbar=$(byXpath("//*[@id=\"modal-panel-price-breakdown14-0\"]/header/button")),
    reserveroom=$(byXpath("//*[@id=\"roomsAndRates2\"]/section/ul/li[1]/div/div[2]/ul/li[2]/div/div[3]/form/button")),
    maintitle2=$(byText("Your choices for 2 guests"));
}
