package adactinLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotel extends LibGlobal {
	
	@FindBy(id="location")
	private WebElement Location;

	
	@FindBy(id="hotels")
	private WebElement Hotels;
	
	@FindBy(id="room_type")
	private WebElement RoomType;
	
	@FindBy(id="room_nos")
	private WebElement RoomNo;
	
	@FindBy(id="datepick_in")
	private WebElement Datepickin;
	
	@FindBy(id="datepick_out")
	private WebElement Datepickout;
	
	@FindBy(id="adult_room")
	private WebElement Adultperroom;
	
	@FindBy(id="child_room")
	private WebElement Childroom;
	
	@FindBy(id="Submit")
	private WebElement btnSearch;

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNo() {
		return RoomNo;
	}

	public WebElement getDatepickin() {
		return Datepickin;
	}

	public WebElement getDatepickout() {
		return Datepickout;
	}

	public WebElement getAdultperroom() {
		return Adultperroom;
	}

	public WebElement getChildroom() {
		return Childroom;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}
	
	
	public void searchHotel(String Location, String Hotels, String RoomType, String RoomNo, String Adultperroom, String Childroom ) {
		
		selectaction(getLocation(), Location);
		
		selectaction(getHotels(), Hotels);
		
		selectaction(getHotels(), RoomType );
		
		selectaction(getRoomNo(), RoomNo);
		
		selectaction(getAdultperroom(), Adultperroom);
		
		selectaction(getChildroom(), Childroom);	

		click(getBtnSearch());
	}
	
	
	
}
