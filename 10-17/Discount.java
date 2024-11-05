package Ilagan_DiscountActivity;
import java.util.*;


public class Discount {
	private static int calculateDiscount(boolean isNewCustomer,boolean isLoyaltyCustomer,boolean isCouponHolder ) {
		
		int newCustomerValue = (isNewCustomer == true) ? 10:0;
		int loyaltyCustomerValue =(isLoyaltyCustomer == true) ? 15:0;
		int couponHolderValue = (isCouponHolder == true) ? 20:0;
		
		if (isNewCustomer == true && isLoyaltyCustomer == true) {
			return -1;
		}
		if (isNewCustomer == true && isCouponHolder == true) {
			return couponHolderValue;
		}
		
		
		return newCustomerValue+loyaltyCustomerValue+couponHolderValue;
		
}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean isNewCustomer, isLoyaltyCustomer, isCouponHolder;
		
		char choice;
		
		System.out.println("Are you a new customer? (y/n): ");
		choice = input.nextLine().charAt(0);
        isNewCustomer = choice == 'y' ? true: false;

		System.out.println("Are you a loyalty card holder? (y/n): ");
		choice = input.nextLine().charAt(0);
		isLoyaltyCustomer = choice == 'y' ? true: false;
		
		System.out.println("Do you have a coupon? (y/n): ");
		choice = input.nextLine().charAt(0);
		isCouponHolder = choice == 'y' ? true: false;
		input.close();
		
		int discountValue = calculateDiscount(isNewCustomer, isLoyaltyCustomer, isCouponHolder);
		String totaldiscount = (discountValue == -1) ? "Will not proceed" : Integer.toString(discountValue) + "%";
		
		System.out.println("Total discount: " + totaldiscount);
		
		
}
}



