Design a HashSet&nbsp;without using any built-in hash table libraries.

To be specific, your design should include these functions:


	add(value):&nbsp;Insert a value into the HashSet.&nbsp;
	contains(value) : Return whether the value exists in the HashSet or not.
	remove(value): Remove a value in&nbsp;the HashSet. If the value does not exist in the HashSet, do nothing.



Example:


MyHashSet hashSet = new MyHashSet();
hashSet.add(1); &nbsp; &nbsp; &nbsp; &nbsp; 
hashSet.add(2); &nbsp; &nbsp; &nbsp; &nbsp; 
hashSet.contains(1); &nbsp;&nbsp;&nbsp;// returns true
hashSet.contains(3); &nbsp;&nbsp;&nbsp;// returns false (not found)
hashSet.add(2); &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
hashSet.contains(2); &nbsp;&nbsp;&nbsp;// returns true
hashSet.remove(2); &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
hashSet.contains(2); &nbsp;&nbsp;&nbsp;// returns false (already removed)



Note:


	All values will be in the range of [0, 1000000].
	The number of operations will be in the range of&nbsp;[1, 10000].
	Please do not use the built-in HashSet library.

