@temp
Feature: login functionality with different users 

#login with the wrong email
@SPA-1280 @SPA-1241 
Scenario: Invalid email 
	Given the user is on the login page 
	When the user tries to login  invalid user name "user2" and password "DavidBlane"
	Then the system should display error message "user with email: user2 doesn`t exist." 
	
	#login with the wrong password
@SPA-1281 @SPA-1241 
Scenario: Invalid password 
	Given the user is on the login page 
	When the user tries to login user name "efewtrell8c@craigslist.org" and password "DavidBlane" 
	Then the system should display error message "invalid password." 
	
	#login successfully with all usernames and passwords
@SPA-1282 @SPA-1546 @SPA-1241 
Scenario Outline: User login 
	Given the user is on the login page 
	When I login using  "<email>" and password "<password>"
	Then building "dark-side" should be displayed 
	
	Examples: 
		|email									|password			|
		|gwilloway8t@nih.gov						|morrievondrach		|
		|teachervawiltonamiss@gmail.com			|wiltonamiss			|
		|wfarrell8n@usnews.com					|doniafisby			|
#		|bstouther8k@meetup.com					|byranncrowdson		|
#		|bmurkus8q@psu.edu						|alicasanbroke		|
#		|teachervasctoforstall@gmail.com			|scottforstall		|
#	    |jrowesby8h@google.co.uk					|aldridgegrimsdith	|
#		|bbursnoll8d@acquirethisname.com			|johndillinger		|
#	    |efewtrell8c@craigslist.org				|jamesmay			|
#		|mcossor8l@webmd.com						|cecilnacey			|
#		|hurey8u@go.com							|elenemaynell		|
#		|dronaghan8v@google.ca					|nonnayablsley		|
#		|nanthony8x@ocn.ne.jp					|hernandosmetoun		|
#		|wamiss8p@businesswire.com				|olagrillis   		|
#		|emaynell8f@google.es					|besslebond			|
#		|hsmetoun8i@edublogs.org					|shanecartmale		|
#		|mnewbatt8o@utexas.edu					|opalcave			|
#		|crundall8e@discuz.net					|eloisamaccauley		|
#		|elaye8m@wikipedia.org					|tabordullingham		|
#		|ecrasford8s@dagondesign.com				|bricesiddell       |		
		