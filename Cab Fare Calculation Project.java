*// Cab Fare Calculation Project
package com.company;
import java.util.Scanner;
class Cab {
	int fare;
	public Cab() {
		fare = 40;
	}

	public Cab(int amt) {
		fare = amt;
	}
	void calculateFare() {
		int travel;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the distance travelled by User: ");
		travel = sc.nextInt();

		fare += travel * 10;
	}
	void showFare() {
		System.out.println("Total Fare: " + fare);
	}
}

class RideCab {
	void putOTP(int d) {
		System.out.println("Ride Started...");
		if(d <= 5) {
			Cab ob = new Cab();
			System.out.println("Ride Ended...");
			ob.calculateFare();
			ob.showFare();
		}
		else {
			Cab ob = new Cab(40 + (d - 5) * 10);
			System.out.println("Ride Ended...");
			ob.calculateFare();
			ob.showFare();
		}		
	}
	public static void main(String[] args) {
		int distance;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the distance of the Cab from User: ");
		distance = sc.nextInt();

		RideCab rc = new RideCab();
		rc.putOTP(distance);
	}

}