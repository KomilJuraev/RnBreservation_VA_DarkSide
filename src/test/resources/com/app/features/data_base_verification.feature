Feature: database matching UI 
#checking if user information matches the database 
@SPA-1730 @SPA-1241 
Scenario: My_Self_DataBase_Check 
	Given user logs in by username "teachervawiltonamiss@gmail.com" and passowrd "wiltonamiss" 
	When the user is on the my self page 
	Then user info should match the db records using "teachervawiltonamiss@gmail.com" 
	
Scenario: MyTeam_DataBaseCheck 
	Given user logs in using "efewtrell8c@craigslist.org" "jamesmay" 
	When the user is on the my team page 
	Then team info should match the db records using "efewtrell8c@craigslist.org" 
	
	#verifying batch information in data base is correct
@SPA-1733 @SPA-1241 
Scenario Outline: Batch_Info_DataBase 
	Given I retrieve the batches information 
	Then following batches should be displayed 
	Examples: 
		| 7	| true |
		| 8	| false|	
