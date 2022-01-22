package StepObject;

import PageObject.BookingPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;


public class BookingSteps extends BookingPage {
    @Step("Choose destination")
    public BookingSteps ChooseDestination(String destination){
        choosedestination.setValue(destination);
        return this;
    }
    @Step("Click checkin button")
    public BookingSteps Checkinbtn(){
        date.click();
        return this;
    }
    public void Selectdate(){
        String currentdate=$("._3LBdi8").getText();
        String expecteddate="November 2021";
        if (currentdate.equals(expecteddate)){
            System.out.println("Month is already selected");
        }else{
            for (int i=1;1<12;i++){
                nextbtn.click();
                if (expecteddate.equals(currentdate)){
                    System.out.println("Month is selected");
                    break;
                }
            }
        }
    }
    @Step("Select date")
    public BookingSteps selectdate(){
        Selectdate();
        return this;
    }
    @Step("Click checkout button")
    public BookingSteps Checkoutbtn(){
        checkoutbtn.click();
        return this;
    }
    @Step("Select more options")
    public BookingSteps Guestsbtn(){
        guests.click();
        return this;
    }
    @Step("Add number of adults")
    public BookingSteps AddNumberOfAdults(){
        addadultsquantity.click();
        return this;
    }
    @Step("Add number of children")
    public BookingSteps AddNumberOfChildren(){
        addchildren.click();
        return this;
    }
    @Step("Checking if age of children section is visible")
    public BookingSteps AgeOFChildrenSection(){
        Assert.assertTrue($("._2v9X4l").is(Condition.visible));
        return this;
    }
    @Step("Select children age")
    public BookingSteps SelectAge(){
        selectage.click();
        return this;
    }
    @Step("Add more room")
    public BookingSteps AddRoom(){
        addaroom.click();
        return this;
    }
    @Step("Delete added room")
    public BookingSteps DeleteRoom(){
        deletearoom.click();
        deletearoom.waitUntil(Condition.disappear,2000);
        return this;
    }
    @Step("Search information within selected options")
    public BookingSteps SearchInformation(){
        searchbtn.click();
        return this;
    }
    public BookingSteps MainTitle(){
        maintitle.waitUntil(Condition.visible,7000);
        return this;
    }
    @Step("Check if price filter is working correctly ")
    public BookingSteps CheckFilter(){
        List<SelenideElement> beforetest = $$("._3XSqn6");
        List<Double> beforetestlist = new ArrayList<>();
        for (SelenideElement p : beforetest) {
            beforetestlist.add(Double.valueOf(p.getText().replace("$", "")));
        }
        filterbtn.click();
        filteroption.click();
        List<SelenideElement> aftertest = $$("._3XSqn6");
        List<Double> aftertestlist = new ArrayList<>();
        for (SelenideElement p : aftertest) {
            aftertestlist.add(Double.valueOf(p.getText().replace("$", "")));
        }
        Collections.sort(beforetestlist);
        Assert.assertEquals(beforetestlist, aftertestlist);
        return this;
    }
    @Step("Select hotel")
    public BookingSteps SelectHotel(){
        selecthotel.waitUntil(Condition.visible,5000);
        selecthotel.click();
        return this;
    }
    @Step("Switch to another window")
    public BookingSteps SwitchWindow(){
        switchTo().window(1);
        return this;
    }
    @Step("Choose room in a hotel")
    public BookingSteps ChooseRoom() {
        chooseroom.waitUntil(Condition.visible, 3000);
        chooseroom.click();
        return this;
    }
    @Step("Show room information")
    public BookingSteps RoomInformation(){
        roominformation.click();
        return this;
    }
    @Step("Click next button to see photos from the gallery")
    public BookingSteps NextButtonElement(){
        nextbuttonelement.waitUntil(Condition.visible,1000);
        int i;
        for(i=0;i<=5;i++){
            nextbuttonelement.click();
        }
        return this;
    }
    @Step("Close information bar before seing its information")
    public BookingSteps CloseInformationBar(){
        closeinformationbar.click();
        return this;
    }
    @Step("Show price details")
    public BookingSteps PriceDetails(){
        pricedetails.waitUntil(Condition.visible,2000);
        pricedetails.click();
        return this;
    }
    @Step("Close price details bar")
    public BookingSteps ClosePriceDetailsBar(){
        closeinformationbar.waitUntil(Condition.visible,1000);
        closeinformationbar.click();
        return this;
    }
    @Step("Reserve chosen room")
    public BookingSteps ReserveRoom(){
        reserveroom.click();
        return this;
    }
}
