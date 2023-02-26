/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    Map<Integer, Node> nodes = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        if(nodes.containsKey(node.val))
            return nodes.get(node.val);
        Node newNode = new Node(node.val, new ArrayList<Node>());
        nodes.put(node.val, newNode);
        for(Node n : node.neighbors)
            newNode.neighbors.add(cloneGraph(n));
        return newNode;
    }
}