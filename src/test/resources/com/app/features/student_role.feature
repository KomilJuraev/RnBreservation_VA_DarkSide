Feature: student functionality 
#Weekly schedule display verification for students
@SPA-1604 @SPA-1241 
Scenario: Student_Weekly_Schedule_Display 
	Given the student is on the home page 
	When the student enters valid date 
	Then the schedule is displayed 
	
	
#Room Schedule Display Verification for students
@SPA-1607 @SPA-1241 
Scenario: Student_Room_Schedule_Display 
    Given the student is on the home page 
	When the student clicks on the room name 
	Then the schedule is displayed 
	
	
	#"student-team-member" is displayed as a role for student
	@temp
@SPA-1609 @SPA-1241 
Scenario: Student_Role_Display
	Given the student is on the home page 
	When the student clicks on the my self name 
	Then the role < student-team-member> is displayed 
	
	
	#Team Members display verification for Students
@SPA-1610 @SPA-1546 @SPA-1241 
Scenario: Student_Team_Members_Display 
	Given the student is on the home page 
	When the student clicks on the my team name 
	Then the team members are displayed 
	
	
	