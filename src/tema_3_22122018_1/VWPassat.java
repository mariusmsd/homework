package tema_3_22122018_1;

public interface VWPassat {

	/* (non-Javadoc)
	 * @see com.oop_homework21.VW#getAvailableFuel()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.Mercedes#getAvailableFuel()
	 */
	float getAvailableFuel();

	/* (non-Javadoc)
	 * @see com.oop_homework21.VW#setAvailableFuel(float)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.Mercedes#setAvailableFuel(float)
	 */
	void setAvailableFuel(float availableFuel);

	/* (non-Javadoc)
	 * @see com.oop_homework21.VW#getChassisNumber()
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.Mercedes#getChassisNumber()
	 */
	String getChassisNumber();

	/* (non-Javadoc)
	 * @see com.oop_homework21.VW#setChassisNumber(java.lang.String)
	 */
	/* (non-Javadoc)
	 * @see com.oop_homework21.Mercedes#setChassisNumber(java.lang.String)
	 */
	void setChassisNumber(String chassisNumber);

}