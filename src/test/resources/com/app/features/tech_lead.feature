Feature: tech lead functionality 

Scenario: Verify_Days_InSchedul_Are_In_AscendingOrder 
	Given the user is on the home page 
	And user enters login "emaynell8f@google.es" "besslebond" 
	When user clicks the schedule button 
	Then the header of the page is schedule 
	
Scenario: Be_Able_To_Enter_Appointment_Details 
	Given the user is on the home page 
	And the user enters login "emaynell8f@google.es" "besslebond" 
	When the user clicks on hunt button from top right corner 
	Then header of the page hunt for spot is displayed 
	Then select last day of the current week 
	And select 11:00 am for FROM selection box 
	And select 12:00 am for TO selection box 
	Then click search icon 
	Then header of the page free spots is displayed 
	
Scenario Outline: Verify_Team_Leads_full_Name 
	Given the user is on the home page 
	When user logs in using "<username>" and "<password>" 
	And select self from top right corner 
	Then header of the page me is displayed 
	Then correct team lead "<name>" is displayed 
	
	Examples: 
		|username	                |password	        |name               |       
		|emaynell8f@google.es	    |besslebond	        |Bess Lebond        |
		|mcossor8l@webmd.com	    |cecilnacey	        |Cecil Nacey        |
		|wfarrell8n@usnews.com	    |doniafisby	        |Donia Fisby        |
		|bmurkus8q@psu.edu	        |alicasanbroke  	|Alica Sanbroke     |
		|fvaughn8w@state.gov	    |jojorowesby	    |Jojo Rowesby       |
		|ftabrett8z@latimes.com	    |beveriestouther	|Beverie Stouther   |
		|lruffli93@dailymail.co.uk	|menardnewbatt	    |Menard Newbatt     |	
		
@temp 
Scenario: Confirm_appointment 
	Given the user is on the home page 
	And the user enters login "mcossor8l@webmd.com" "cecilnacey" 
	When the user clicks on hunt button from top right corner 
	Then header of the page hunt for spot is displayed 
	Then select last day of the current week 
	And select 11:00 am for FROM selection box 
	And select 12:00 am for TO selection box 
	Then click search icon 
	Then header of the page free spots is displayed 
	Then click book for denali 
	Then click on cofirm 
	Then user is on schedule page 
	
	
	
	
			