# JCollection
JCollection is a java package <i>(no official jar yet)</i> that has different classes that work as collections of data. An example would be the <b>Array</b> class.
# Classes
JCollection so far has three Collections <i>(a collection is a class in JCollection that acts as a collection of data)</i>. They are <b>Array</b>, <b>Dictionary</b>, and <b>SinglyLinkedList</b>. 
# Array
<b>Array</b> acts as a collection of different values, and doesn't have a fixed size. The size is dynamic, and can be changed with methods like <b>add()</b> and <b>remove()</b>.
Each item also has an index, and can be accessed with the <b>get()</b> method, starting from 0 for the first item, and ending at <b>items.length - 1</b> for the last.
# Dictionary
<b>Dictionary</b> acts as a collection of <i>key-value pairs</i>. For example, you could have a <b>Dictionary<String, Integer></b>, and the key would have to be of class String, and the value would have to be of class Integer.
A Dictionary can only hold one of the same key, so having two keys with the exact same value is invalid. 
A Dictionary, just like <b>Array</b>, has indexes for each <i>key-value</i> pair, so index 0 would point to the first key, and <b>keys.items.length - 1</b> for the last.
# SinglyLinkedList
<b>SinglyLinkedList</b>, just like the name suggests, is a collection moddeled off of the singly linked list data structure. It is composed of <b>SinglyNode</b>'s, and doesn't have indexes like the other collections. It has a public <b>SinglyNode</b> member with the name <i>current</i>, and that acts as a pointer to the current <b>SinglyNode</b>. Each <b>SinglyNode<b>, has a <i>value</i> member, and a <i>next</i> member, the latter being a pointer to the next <b>SinglyNode</b>.
# filter()
Each collection except <b>SinglyLinkedList</b> has a <b>filter()</b> method, which loops through all items and filters <i>(removes)</i> them if the condition is met for that item.
For example, <code>arr.filter(x->x==661);</code> will loop through the array, and check if the current item is equal to 661, and if it is, it will get removed.
# loop()
The loop method, in all collections, is a method that loops through the collection and does something for each loop, depending on the collection. for example for array if you
do <code>arr.loop(x->System.out.println(x));</code>, it will loop through all of the items in the <b>Array</b>, and output them to the console.
# Coming soon
This section is on collections that <b>may</b> come in the future. The list is: <b>DoublyLinkedList</b>, and <b>Tree</b>.
