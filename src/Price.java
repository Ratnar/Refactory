public abstract class Price {
	abstract int getPriceCode();

	abstract double getCharge(int daysRented);

	int getFrequentRenterPoints(int daysRented) {
		return 1;
	}
}

class ChildrenPrice extends Price{
	double getCharge(int daysRented){
		double thisAmount = 1.5;
		if (daysRented > 3)
			thisAmount += (daysRented - 3) * 1.5;
		return thisAmount;
	}
	
	int getPriceCode(){
		return Movie.CHILDRENS;
	}
}

class NewReleasePrice extends Price{
	int getFrequentPoints(int daysRented){
		return (daysRented > 1) ? 2: 1;
	}
	
	double getCharge(int daysRented){
		return daysRented * 3;
	}
	
	int getPriceCode(){
		return Movie.NEW_RELEASE;
	}
}

class RegularPrice extends Price{
	double getCharge(int daysRented){
		double thisAmount = 2;
		if (daysRented > 2)
			thisAmount += (daysRented - 2) * 1.5;
		return thisAmount;
	}
	
	int getPriceCode(){
		return Movie.REGULAR;
	}
}
