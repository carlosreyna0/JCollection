# JCollection
JCollection is a java library that has different classes for different data structures that act as collections of items.
JCollection currently has 2 main classes <i>(not litterally a main class but you get what I mean)</i>, <b>Array</b> and <b>Dictionary</b>.
<b>Array</b> is an ArrayList, and <b>Dictionary</b> is just like an ArrayList, except it consists of key-value pairs, and 2 items cannot have the same key.
# 
Each main class <i>(just Array for now)</i> is event based, meaning you can add and remove different events to react to when something is added, changed, or removed.
# 
Each main class has a filter() method, which loops through each item, checks if the filter method returns true, then removes that item if it does.
<code>arr.filter((index, item)->index==2);</code>
# 
Each main class has a loop() methods which just loops through each item.
## Side note
ignore the Main class, it was just a little test.
# Note
I won't be working on this project any longer. It works but keep in mind the package names don't follow java naming conventions. Also Dictionary does not have any events.
