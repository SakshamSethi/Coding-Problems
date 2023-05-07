//{ Driver Code Starts
//Initial Template for Java


import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Node {
	int data;
	Node left;
	Node right;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class GfG {

	static Node buildTree(String str) {

		if (str.length() == 0 || str.charAt(0) == 'N') {
			return null;
		}

		String ip[] = str.split(" ");
		// Create the root of the tree
		Node root = new Node(Integer.parseInt(ip[0]));
		// Push the root to the queue

		Queue<Node> queue = new LinkedList<>();

		queue.add(root);
		// Starting from the second element

		int i = 1;
		while (queue.size() > 0 && i < ip.length) {

			// Get and remove the front of the queue
			Node currNode = queue.peek();
			queue.remove();

			// Get the current node's value from the string
			String currVal = ip[i];

			// If the left child is not null
			if (!currVal.equals("N")) {

				// Create the left child for the current node
				currNode.left = new Node(Integer.parseInt(currVal));
				// Push it to the queue
				queue.add(currNode.left);
			}

			// For the right child
			i++;
			if (i >= ip.length)
				break;

			currVal = ip[i];

			// If the right child is not null
			if (!currVal.equals("N")) {

				// Create the right child for the current node
				currNode.right = new Node(Integer.parseInt(currVal));

				// Push it to the queue
				queue.add(currNode.right);
			}
			i++;
		}

		return root;
	}

	static void printInorder(Node root) {
		if (root == null)
			return;

		printInorder(root.left);
		System.out.print(root.data + " ");

		printInorder(root.right);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s = br.readLine();
			int target = Integer.parseInt(br.readLine());
			Node root = buildTree(s);

			Solution g = new Solution();
			System.out.println(g.minTime(root, target));
			t--;

		}
	}
}



// } Driver Code Ends


//User function Template for Java

class Solution
{
    /*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    public static Node mark_parent(Node root , Map<Node,Node>pmap,int start)
    {
        Queue<Node>q = new LinkedList<>();
        q.offer(root);
        Node res=null;
        while(!q.isEmpty()){
            
            Node cur = q.poll();
            
            if(cur.data == start)
            {
                res = cur;
            }
            
            if(cur.left!=null)
            {
                pmap.put(cur.left,cur);
                q.offer(cur.left);
            }
            
            if(cur.right!=null)
            {
                pmap.put(cur.right,cur);
                q.offer(cur.right);
            }
        }
        return res;
    }
    
    public static int minTime(Node root, int target) 
    {
        HashMap<Node , Node >pmap = new HashMap<>();
        Node ans = mark_parent(root,pmap,target);
        
        //Now Have to Apply BFS 
        
        HashMap<Node,Boolean> visited = new HashMap<>();
        
        visited.put(ans,true);
        Queue<Node>q = new LinkedList<>();
        q.offer(ans);
        
        int time =0;
        while(!q.isEmpty())
        {
            int flag =0;
            int start = q.size();
            
            for(int i=0;i<start;i++)
            {
                Node cur = q.poll();
                
                if(cur.left!=null && visited.get(cur.left)==null)
                {
                    flag=1;
                    q.offer(cur.left);
                    visited.put(cur.left,true);
                }
                 if(cur.right!=null && visited.get(cur.right)==null)
                {
                    flag=1;
                    q.offer(cur.right);
                    visited.put(cur.right,true);
                }
                 if(pmap.get(cur)!=null && visited.get(pmap.get(cur))==null)
                {
                    flag=1;
                    q.offer(pmap.get(cur));
                    visited.put(pmap.get(cur),true);
                }
                
                
            }
            if(flag==1)
            {
                time++;
            }
            
        }
        
        return time;
        
        
        
    }
}