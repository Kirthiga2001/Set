package Zoho;

import java.util.*;

public class Task2_Set {
	public static void main(String[] args) {
		//HashSet no duplicates, one null value, unordered collection
		Scanner sc=new Scanner(System.in);
		
		//create HashSet
		Set<String> si=new HashSet<String>();
		System.out.print("Enter the number of elements: ");
		int n1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements(String): ");
		for(int i=0;i<n1;i++) si.add(sc.nextLine());
		
		
		//HashSet1
		Set <Integer> primeno=new HashSet<>();
		System.out.print("Enter the number of elements: ");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n;i++) primeno.add(sc.nextInt());
		
		//HashSet2
		Set <Integer> fpn=new HashSet<>();
		System.out.print("Enter the number of elements: ");
		int n2=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements: ");
		for(int i=0;i<n2;i++) fpn.add(sc.nextInt());
		Set<Integer> tpn=new HashSet<>(primeno); //->using constructors

		while(true) {
			System.out.println("**********MENU**********");
			System.out.println("1-> Combine lists ");
			System.out.println("2-> Add new element ");
			System.out.println("3-> get size ");
			System.out.println("4-> check if empty ");
			System.out.println("5-> remove a element");
			System.out.println("6-> remove a collection  ");
			System.out.println("7-> print");
			System.out.println("8-> clear all ");
			System.out.println("9-> Exit");
			System.out.println("*************************");
			n=sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1:
				tpn.addAll(fpn);
				break;
			case 2:
				System.out.print("Enter the number to add: ");
				int an=sc.nextInt();
				sc.nextLine();
				if (fpn.contains(an)) System.out.println(an+"is already present, Duplicates are not allowed in list");
				fpn.add(an);
				System.out.println(fpn);
				
				break;
			case 3:
				System.out.println(tpn.isEmpty());
				break;
			case 4:
				System.out.println(tpn.size());
				break;
			case 5:
				System.out.print("Enter the index: ");
				int n4=sc.nextInt();
				sc.nextLine();
				if (tpn.size()>n4) {
					tpn.remove(n4);
					System.out.println(tpn);}
				else 
					System.out.println("Index not found");
				break;
			case 6:
				tpn.removeAll(fpn);
				System.out.println(tpn);
				tpn.addAll(fpn);
				
				break;
			case 7:
				System.out.println(primeno);
				System.out.println(fpn);
				System.out.println(tpn);
				break;
			case 8:
				tpn.clear();
				System.out.println(tpn);
				break;
			case 9:
				return;
			default:
				System.out.print("Invalid choice");
			}
			
		}
		}
		
	
	}
