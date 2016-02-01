package wednesday;

import java.io.PrintStream;

public class BinarySearchTree<K extends Comparable<K>, V> {
	// The following class implements a binary search tree
	private Node mRoot; // - this is the root of the tree
	private Node mSentinel;// - this is how we will indicate an empty leaf

	public class Node { // this class represents a Node
		private Node mLeft;// this is the left child(leaf) of the Node
		private Node mright;// this is the right child(leaf) of the Noded
		private Node mParent;// this is the parent of the Node
		private K mKey;// this is the key through which the node is
						// identified(keys may be repeated/are not unique)
		private V mValue;// this is the value that the node stores(values may
							// also be repeated/are not unique)

		public Node(K key, V value) {// this is the constructor of a new Node
			mKey = key;// it takes as an arguments a key
			mValue = value;// and a value
			mParent = mSentinel;// and makes a nodw with no parent
			mLeft = mSentinel;// or children
			mright = mSentinel;// that stores the key and the value
		}

		public K getKey() {
			return mKey;// getter method returning the key of a node
		}

		public V getValue() {
			return mValue;// getter method returning the value of a node
		}

		public Node getLeftChild() {
			return mLeft;// getter method returning a node which is the left
							// child of the given node
		}

		public Node getrightChild() {
			return mright;// getter method returning a node which is the right
							// child of the given node
		}

		public Node getParent() {
			return mParent;// getter method returning the parent of a given
							// node
		}

		public void setKey(K key) {
			mKey = key;// setter method for the key of a given node
		}

		public void setValue(V value) {
			mValue = value;// setter method for the value of a given node
		}

		public void setLeftChild(Node left) {
			mLeft = left;// setter method which appropriates a node as the left
							// child of a given node
		}

		public void setrightChild(Node right) {
			mright = right;// setter method which appropriates a node as the
							// right child of a given node
		}

		public void setParent(Node parent) {
			mParent = parent;// setter method which appropriates a node as the
								// parent of a given node
		}

		public String toString() {// returns the key and the value of a given
									// node as a formated string
			if (this.getKey() == null) {
				return "";
			} else {
				return "Key:" + this.getKey() + " Value:" + this.getValue();
			}
		}
	};

	public BinarySearchTree() {
		// the constructor of a binary tree
		mSentinel = new Node(null, null);// first we create the sentinel(or
											// empty) node
		mRoot = mSentinel;// then we appropriate the sentinel node as a root
	}

	public Node getRoot() {
		return mRoot;// getter method for the root of a binary tree
	}

	public boolean isEmpty() {// checks if the tree is empty
		return mSentinel == mRoot;// if the root is equal to the sentinel(empty
									// node) then the tree is empty otherwise it
									// is not
	}

	public Node insertNode(K key, V value) {// inserts a new node
		Node newNode = new Node(key, value);// first we need to create the new
											// node
		Node currentNode = this.getRoot();// then we move to the root ot the
											// tree that has called the method
		Node currentNodeParent = mSentinel;// the parent of the root is of
											// course sentinel
		while (currentNode != mSentinel) {// and while the current node(starting
											// from the root) is not a sentinel
			currentNodeParent = currentNode;// then remember this node as a
											// parent
			if (key.compareTo(currentNode.getKey()) < 0) {// and appropriate its
				currentNode = currentNode.getLeftChild();// left
			} else {// or
				currentNode = currentNode.getrightChild();// right child as the
															// next current node
			}
		}
		// we iterate through the described loop in order to get to the
		// appropriate place(in respect to the given key) where the new node
		// should be put
		newNode.setParent(currentNodeParent);// we make the new node's parent
												// the last non empty node that
												// we've reached
		if (currentNodeParent == mSentinel) {
			mRoot = newNode;// if there is no such node then the tree is empty
							// and our node is actually going to be the root
		} else {
			if (key.compareTo(currentNodeParent.getKey()) < 0) {// otherwise we
																// put our new
																// node
				currentNodeParent.setLeftChild(newNode);// as a left
			} else { // or
				currentNodeParent.setrightChild(newNode);// right child of the
															// last node we've
															// reached
			}
		}
		return newNode;
	}

	private String indent(int spaces) {// this is a simple method that helps the
										// visual representation of trees
		String result = "";
		for (int i = 0; i < spaces; i++) {
			result = result + "  ";// it creates as much spaces as it is told to
		}
		return result;
	}

	private String print(Node root, int depth) {
		if (root == mSentinel) {// this function returns a string that represents
								// the tree(the depth indicates the number of
								// space into the console at which the tree
								// building starts
			return "";// if the tree is empty so is the string
		} else {
			return print(root.getrightChild(), +depth + 1) + indent(depth) + root.toString() + "\n"
					+ print(root.mLeft, depth + 1);// until we reached the
													// sentinel we print the
													// left child ,appropriate
													// indent and then the right
													// child of the tree
		}

	}

	private void transplant(Node u, Node v) {// this method translates a node v
												// at the place of node u
		if (u.getParent() == mSentinel) {// if u is the root
			this.mRoot = v;// simply make v the root
		} else if (u == u.getParent().getLeftChild()) {// if u is a left child
														// then make v u's
														// parent's left child
			u.getParent().setLeftChild(v);

		} else {
			u.getParent().setrightChild(v);// otherwise u is a right child and
											// we should make v u's parent's
											// right child
		}

		if (v != mSentinel) {
			v.setParent(u.getParent());// and of course if v is not empty make
										// u's parent - v's parent
		}
	}

	public void remove(Node nodeBeingRemoved) {// method allowing the removal of
												// a given node
		if (nodeBeingRemoved.getLeftChild() == mSentinel) {
			// if the node that is being remove does not possess a left child
			// then translate the right child of the node that is being removed
			// in the place of the node itself
			transplant(nodeBeingRemoved, nodeBeingRemoved.getrightChild());
		} else if (nodeBeingRemoved.getrightChild() == mSentinel) {
			// act on analogy if the node does not possess a right child
			transplant(nodeBeingRemoved, nodeBeingRemoved.getLeftChild());
		} else {
			// the tricky part
			Node nextNode = getMinimalNode(nodeBeingRemoved.getrightChild());
			// if the node that is being removed has both right and left
			// children then get the minimal(rightmost child of the node as the
			// next node that is going to replace it)
			if (nextNode.getParent() != nodeBeingRemoved) {
				// if the node that we've acquired does not coincide with the
				// node that is being removed
				transplant(nextNode, nextNode.getrightChild());// (1)
				// replace it with its right child
				nextNode.setrightChild(nodeBeingRemoved.getrightChild());
				// and set its right child to be the right child of the node
				// that is under removal
				nextNode.getrightChild().setParent(nextNode);
				// last but not least make the right' child's parent the not
				// that we have transfered (look 1)
			}

			transplant(nodeBeingRemoved, nextNode);
			// in all cases change the positions of the node that is being
			// removed and the node that will replace it
			// and adjust the children accordingly
			nextNode.setLeftChild(nodeBeingRemoved.getLeftChild());
			nextNode.getLeftChild().setParent(nextNode);
		}
	}

	public Node getMinimalNode(Node currentNode) {
		// this method returns the minimal/leftmost(relative to its key) node
		while (currentNode.getLeftChild() != mSentinel) {
			currentNode = currentNode.getLeftChild();
			// simply go left until you reach an empty node
		}
		return currentNode;
		// return the last non-empty node
	}

	public Node getMaximalNode(Node currentNode) {
		// this method returns the maximal/rightmost(relative to its key) node
		while (currentNode.getrightChild() != mSentinel) {
			currentNode = currentNode.getrightChild();
			// simply go right until you reach an empty node
		}
		return currentNode;
		// return the last non-empty node
	}

	public Node search(K key) {
		// find the node with a specific key(it returns the first node that has
		// the given key)
		Node currentNode = this.mRoot;
		// start from the root of the tree that calls the method
		while (currentNode != mSentinel && key.compareTo(currentNode.getKey()) != 0) {
			// if the current node is not empty and its key is not equal to the
			// search key
			if (key.compareTo(currentNode.getKey()) < 0) {
				currentNode = currentNode.getLeftChild();
				// go left if the search key is lower
			} else {
				currentNode = currentNode.getrightChild();
				// go right if the search key is higher
			}
			// break the loop if the search key matches the node key
		}
		if (currentNode == mSentinel) {
			return null;
			// if there is not a match return nu;;
		} else {
			return currentNode;
			// return the first node with the same key as the search key
		}
	}

	public int calculateNodeDepth(Node startNode) {
		// this method calculates the depth of a given node in a tree
		int depthCounter = 0;
		// start from zero
		if (!(startNode == this.mRoot)) {
			while (startNode.getParent() != this.mRoot) {
				startNode = startNode.getParent();
				depthCounter++;
				// count upwards while the node's parent is not root
			}
		} else {
			return 0;
		}
		return depthCounter;
		// return the count
	}

	public int calculateNodeHeigth(Node startNode) {
		// this method calculates the height of a given node in a tree
		if (startNode == mSentinel) {
			return 0;
			// if the start node is empty return 0
		} else {
			return 1 + Math.max(calculateNodeHeigth(startNode.getLeftChild()),
					calculateNodeHeigth(startNode.getrightChild()));
			// otherwise recursively call the same function on the right and
			// left child of the node(until u meet the recursion's end - empty
			// node/0 and get the higher result)
		}
	}

}
