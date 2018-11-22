Feature:valid credential of costco

Background:

Given openBrowser
|firefox|
|chrome| 
And navigate to url
 
 Scenario:go to costco and pick some products
 
 When user go to sadAndMaOver and eleMaOver
 And click on tvs
 Then go to catagory and  click on less than 25
 Then click on addtoCart and  click on continue shopping


Scenario:go to costco and pick some products
 
 When user go to tiresAndAutoMaOver 
 And click on motorOil
 
 Then click on addtoCart and  click on  click on continue shopping
