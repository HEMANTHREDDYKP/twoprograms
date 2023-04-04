package com.ty.man;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter car type");
		String typeOfCar = input.next();
		System.out.println("enter number of services you need for your car");
		int n = input.nextInt();
		List<String> serviceCode = new ArrayList<>();
		while (n != 0) {
			System.out.println("enter service code");
			String s = input.next();
			serviceCode.add(s);
			n--;

		}

		int total = 0;
		if (typeOfCar.equalsIgnoreCase("hatchback")) {

			for (int m = 0; m < serviceCode.size(); m++) {
				if (serviceCode.get(m).equalsIgnoreCase("BS01")) {

					total = total + 2000;
					System.out.println("Basic Servicing -₹2000");
				}
				if (serviceCode.get(m).equalsIgnoreCase("EF01")) {

					total = total + 5000;
					System.out.println("Engine Fixing -₹5000");
				}

				if (serviceCode.get(m).equals("CF01")) {

					total = total + 2000;
					System.out.println("Clutch Fixing -₹2000");
				}
				if (serviceCode.get(m).equalsIgnoreCase("BF01")) {

					total = total + 1000;
					System.out.println("Break Fixing -₹1000");
				}
				if (serviceCode.get(m).equalsIgnoreCase("GF01")) {

					total = total + 3000;
					System.out.println("Gear Fixing -₹3000");
				}
			}

			System.out.println("Total Bill-₹" + total);
			if (total > 10000) {
				System.out.println("Cleaning free as your bill is more than 10000");
			}
		}

		System.out.println("---------------------------------------------------------");
		if (typeOfCar.equalsIgnoreCase("Sedan")) {

			for (int m = 0; m < serviceCode.size(); m++) {
				if (serviceCode.get(m).equalsIgnoreCase("BS01")) {

					total = total + 4000;
					System.out.println("Basic Servicing -₹4000");
				}
				if (serviceCode.get(m).equalsIgnoreCase("EF01")) {

					total = total + 8000;
					System.out.println("Engine Fixing -₹8000");
				}

				if (serviceCode.get(m).equalsIgnoreCase("CF01")) {

					total = total + 4000;
					System.out.println("Clutch Fixing -₹4000");
				}
				if (serviceCode.get(m).equalsIgnoreCase("BF01")) {

					total = total + 1500;
					System.out.println("Break Fixing -₹1500");
				}
				if (serviceCode.get(m).equalsIgnoreCase("GF01")) {

					total = total + 6000;
					System.out.println("Gear Fixing -₹6000");
				}
			}

			System.out.println("Total Bill-₹" + total);
			if (total > 10000) {
				System.out.println("Cleaning free as your bill is more than 10000");
			}
		}

		System.out.println("------------------------------------------------------------");

		if (typeOfCar.equalsIgnoreCase("suv")) {

			for (int m = 0; m < serviceCode.size(); m++) {
				if (serviceCode.get(m).equalsIgnoreCase("BS01")) {

					total = total + 5000;
					System.out.println("Basic Servicing -₹5000");
				}
				if (serviceCode.get(m).equalsIgnoreCase("EF01")) {

					total = total + 10000;
					System.out.println("Engine Fixing -₹10000");
				}

				if (serviceCode.get(m).equalsIgnoreCase("CF01")) {

					total = total + 6000;
					System.out.println("Clutch Fixing -₹6000");
				}
				if (serviceCode.get(m).equalsIgnoreCase("BF01")) {

					total = total + 2500;
					System.out.println("Break Fixing -₹2500");
				}
				if (serviceCode.get(m).equalsIgnoreCase("GF01")) {

					total = total + 8000;
					System.out.println("Gear Fixing -₹8000");
				}
			}

			System.out.println("Total Bill-₹" + total);
			if (total > 10000) {
				System.out.println("Cleaning free as your bill is more than 10000");
			}
		}

	}

}
