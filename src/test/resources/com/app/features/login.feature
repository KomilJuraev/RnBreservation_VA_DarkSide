Feature: login functionality with different users 
#login with the wrong email
@SPA-1280 @SPA-1241 
Scenario: Invalid email 
	Given the user is on the login page 
	When the user tries to login  "user2" 
	Then the system should display error message "user with email: user2 doesn`t exist." 
	
	#login with the wrong password
@SPA-1281 @SPA-1241 
Scenario: Invalid password 
	Given the user is on the login page 
	When the user tries to login user name "user1@gmail.com" and password "DavidBlane" 
	Then the system should display error message "invalid password." 
	
	#login successfully with all usernames and passwords
@SPA-1282 @SPA-1546 @SPA-1241 
Scenario Outline: User login 
	Given the user is on the login page 
	When I login using  <email> and password <password> 
	Then users <full name> should be displayed 
	
	Examples: 
		|full name					    |email									|password			|
		|David Blane					|user1@gmail.com 						|davidblane			|
		|James May					    |user2@gmail.com						|jamesmay			|
		|John  Dillinger				|user3@gmail.com						|johndillinger		|
		|Eloisa MacCauley			    |emaccauley0@scientificamerican.com		|eloisamacCauley	|
		|Bess	Lebond				    |blebond1@latimes.com					|besslebond			|
		|Hunt	Durand				    |hdurand2@aboutads.info					|huntdurand    		|
		|Aldridge	Grimsdith		    |agrimsdith3@domainmarket.com			|aldridgegrimsdith	|
		|Shane	Cartmale				|scartmale4@japanpost.jp				|shanecartmale		|
		|Joya	Prowse				    |jprowse5@liveinternet.ru				|joyaprowse			|
		|Byrann	Crowdson				|bcrowdson6@marriott.com				|byranncrowdson		|
		|Cecil	Nacey				    |cnacey7@sun.com						|cecilnacey			|
		|Tabor	Dullingham			    |tdullingham8@umich.edu					|tabordullingham	|
		|Donia	Fisby				    |dfisby9@census.gov						|doniafisby			|
		|Opal	Cave					|ocavea@abc.net.au						|opalcave			|
		|Ola	 Grills					|ogrillsb@samsung.com					|olagrills			|
		|Alica	Sanbroke				|asanbrokec@miibeian.gov.cn				|alicasanbroke		|
		|Skylar	Giblin				    |sgiblind@hhs.gov						|skylargiblin		|
		|Brice	Siddell				    |bsiddelle@is.gd						|bricesiddell       |
		|Morrie	Vondrach				|mvondrachf@goo.ne.jp					|morrievondrach		|
				