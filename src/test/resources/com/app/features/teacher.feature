@temp2
Feature: testing common functionality for teachers

#Verify hunt for spot page is displayed when the teacher clicks on the hunt link at home page.
	@SPA-1295 @SPA-1546 @SPA-1241
	Scenario: Hunt_For_Spot_Page_Display
		Given the teacher is on the home page
		When the teacher clicks on the hunt link
		Then hunt for a spot page should be displayed
			

	# When a teacher logs in with correct credentials and then clicks on "my" drop down menu and selects "self" link teachers' correct full name, role and team should be displayed. 
	@SPA-1483 @SPA-1546 @SPA-1241
	Scenario Outline: Verify_Teachers_Correct_FullName_Role_Team_Displayed
		Given the teacher logs in with "<username>" and "<password>" 
		When the teacher clicks on the my dropdown menu
		And  selects self link
		Then role teacher, team Teachers and name "<fullName>" should be displayed
		
		Examples:
		|username                        |password      |fullName      |
		|teachervawiltonamiss@gmail.com  |wiltonamiss   |Wilton Amiss  |
		|teachervasctoforstall@gmail.com |scottforstall |Scott Forstall|
		|teachervamikemarcus@gmail.com   |mikemarcus    |Mike Marcus   |
		
			

	#When the teacher clicks on the room name on the map , correct room name and capacity should be displayed on the room page.
	@SPA-1491 @SPA-1546 @SPA-1241
	Scenario Outline: Verify_Correct_RoomName_Capacity_Displayed
		Given the teacher is on the home page 
		When the teacher clicks on the "<roomName>" link on the map
		Then correct "<roomName>" and "<capacity>" should be displayed
		
		Examples:
		|roomName    |capacity|
		|kilimanjaro |6       |
		|half dome   |6       |
		|denali      |4       |
		|meru        |4       |	

	#Verify correct room name, date, time and confirm button is displayed on booking confirmation page. 
	# 
	@SPA-1493 @SPA-1241
	Scenario: Verify_Info_On_Booking_Confirmation_Page
		Given the teacher is on the home page
		When the teacher clicks on the hunt link
		And teacher picks date two days after current date and from "2:30pm" to "4:00pm" 
		Then Search button is clickable
			
