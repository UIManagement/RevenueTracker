package bean;

public class RowCounter  {

    private transient int row = 0;

    public int getRow() {
    	return ++row;
    }

}