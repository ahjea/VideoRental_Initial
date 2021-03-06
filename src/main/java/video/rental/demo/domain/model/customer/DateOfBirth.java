package video.rental.demo.domain.model.customer;

import video.rental.demo.domain.shared.ValueObject;

public final class DateOfBirth implements ValueObject<DateOfBirth>{
	private String dateOfBirth;
	
	public DateOfBirth(final String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	@Override
	public String toString() {
		return dateOfBirth;
	}
	
	@Override
	public boolean sameValueAs(final DateOfBirth other) {
		// TODO Auto-generated method stub
		return other != null && this.dateOfBirth.equals(other.dateOfBirth);
	}
	
	public DateOfBirth() {}	// for hibernate
}
