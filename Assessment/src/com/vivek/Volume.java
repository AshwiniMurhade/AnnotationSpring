package com.vivek;

import java.util.Scanner;

public class Volume {
	public double volume(double R) {
		double v = (4/(double)3)*(22/(double)7)*R*R*R;
		return v;
	}
	public double volume(double R, double H) {
		double v = (22/(double)7)*R*R*H;
		return v;
	}
	public double volume(double L, double B, double H) {
		double v = L*B*H;
		return v;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume v = new Volume();
		double R,H,L,B;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of sphere");
		R = sc.nextDouble();
		System.out.println("Volume of sphere is " +v.volume(R));
		
		System.out.println("Enter radius of cylinder");
		R = sc.nextDouble();
		System.out.println("Enter height of cylider");
		H = sc.nextDouble();
		System.out.println("Volume of cylinder is " +v.volume(R, H));
		
		System.out.println("Enter length of cuboid");
		L = sc.nextDouble();
		System.out.println("Enter breadth of cuboid");
		B = sc.nextDouble();
		System.out.println("Enter height of cuboid");
		H = sc.nextDouble();
		System.out.println("Volume of cuboid is " +v.volume(L, B, H));
		
		sc.close();
	}

}
