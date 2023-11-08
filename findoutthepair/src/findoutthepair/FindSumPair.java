package findoutthepair;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindSumPair {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the required sum:" );
		int sum = sc.nextInt();
		
		
    	Node root = null;
    	Node n = new Node();
        root = n.insert(root , 40); 
        root = n.insert(root , 20);
        root = n.insert(root , 60);
        root = n.insert(root , 10);
        root = n.insert(root , 30);
        root = n.insert(root , 50);
        root = n.insert(root , 70);
        
        FindSumPair findsumpair = new FindSumPair();
        findsumpair.findPairWithSum( root,  sum);
	
	
	}
	
	public void findPairWithSum(Node root, int sum) {
		Set<Integer> set = new HashSet<>();
		if(!findPairUtil( root ,  sum ,  set)) {
			System.out.println("pair sum does not found");
		}
	}
	
	public boolean findPairUtil(Node root , int sum , Set<Integer> set) {
		if(root == null) {
			return false;
		}if(findPairUtil(root.left , sum , set)) {
			return true;
		}if(set.contains(sum - root.value)) {
			System.out.println("pair sum is: "+"("+root.value+","+(sum - root.value)+")");
			return true;
		}else {
			set.add(root.value);
		}
		return findPairUtil(root.right , sum ,set);
	}

}
