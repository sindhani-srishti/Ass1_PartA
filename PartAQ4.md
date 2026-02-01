# Adding new feature Mode Strategy
We would make a ModeStrategy interface and will use Strategy design pattern to change into concrete strategies **Light Mode** and **Dark Mode**. 
In the ModeStrategy interface, use a function confirmMode() to change the mode beforehand.
##The two classes that will implement the interface are 
* LightMode
* DarkMode
  
And both override the confirmMode() method according to them.
To make this feature, we have to add a attribute and a set method in *EReader* class also.
- First, adding a ModeStrategy ms attribute
- and then, setter method setModeStrategy
- and a method to confirm and apply the mode confirmMode().

  Thus, using strategy pattern for adding a new feature ModeStrategy will give a cleaner code. 
