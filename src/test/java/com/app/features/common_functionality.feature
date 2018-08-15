@temp
Feature: testing common functionality for different users 

Scenario Outline: Min_Max_Room_Reservation 

	Given the <user> is on home page 
	When the <user> goes to hunt 
	Then the <user> should be able to reserve room from 30 minutes to 2 hours 
	
	Examples: 
	
		|user    |
		|teacher |
		|tech-lead|	
		
		#reservation should be given in "from $ time to $time" format
@SPA-1284 @SPA-1546 @SPA-1241 
Scenario Outline: Reservation_Format 

	Given the <user> is on the home page 
	When the <user> goes to hunt 
	Then reservation options should be given in a format:from $ time to $time 
	
	Examples: 
		|user    |
		|teacher |
		|tech-lead|	
		
		#{color:#000000}Reservation window for the day should be from 7am to 10 pm{color}
		@SPA-1287 @SPA-1546 @SPA-1241 
Scenario Outline: Reservation_Window_Display 
		
			Given the <user> is on hunt page 
			When the <user> enters valid date 
			Then reservation window for the day should be from 7am to 10 pm 
			
			Examples: 
				|user    |
				|teacher |
				|tech-lead|	
				
				#{color:#000000}In the hunt for spot page ,date field should be calendar{color}
				@SPA-1288 @SPA-1241 
	Scenario Outline: Hunt_SpotPage_Field_Check 
					Given the <user> is on the hunt page 
					When the <user> goes to date 
					Then the calendar should be displayed 
					
					Examples: 
					
						|user    |
						|teacher |
						|tech-lead|
						
						
						#Verify hunt for spot page is displayed when the teacher clicks on the hunt link at home page.
						@SPA-1295 @SPA-1546 @SPA-1241 
	Scenario: Hunt_For_Spot_Page_Display 
						
							Given the teacher is on the home page 
							When the teacher clicks on the hunt link 
							Then hunt for a spot page should be displayed 
				