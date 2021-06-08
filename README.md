# NBA statistics 3PA using Java
  The program works by retrieving data from the NBA official statistics website. 
  It gets the 3-pointers average the player managed for each season data from the table. 
  Using the for loop, the program changes the hyperlink for each year, as it presents a new table of players and their achievements each year.
  I used the GetElementByID method to retrieve the data from the table.
  I used the GetElementsByTag method to retrieve data from rows and fields, as we use the <th> and <td> tags in the HTML table.
  While developing the program, I found that the player position is located on args [0], so I had to use args [11], as this is where the 3PA parameter is located.
  When printing the solution, I used the number from the loop for the year, and the .get method (11) for the 3PA parameter.
  I had to use the remainder in the 2020-21 division to print the season.
  To list the desired player (example Luka Dončič), I wrote "Luka Dončić" in Run Configurations under Program arguments.
  
