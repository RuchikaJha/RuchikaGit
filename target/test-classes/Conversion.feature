#Author: your.email@your.domain.com
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios 
#<> (placeholder)
#""

Feature: Convert between different unit of temperatures
	I want to use this template for my feature file

	Formula: C/5 = (F-32)/9
	C = 5(F-32)/9 = 5(98.6 - 32 =)/9 = 37
	
Scenario: Convert to Celcius from Farenhiet
Given I want to convert 98.6 Farenhiet into Celcius
When I input the value of Farenhiet into text
Then It should be converted to Celcius as 37 degree