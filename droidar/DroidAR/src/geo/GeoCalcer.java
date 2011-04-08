package geo;

import worldData.Visitor;
import android.util.Log;

public class GeoCalcer extends Visitor {

	private double nullLatitude;
	private double nullLongitude;
	private double nullAltitude;

	public void setNullPos(double latitude, double longitude, double altitude) {
		nullLatitude = latitude;
		nullLongitude = longitude;
		nullAltitude = altitude;
	}

	@Override
	public boolean visit(GeoObj geoObj) {
		Log.d("visitor.visit()", "Calcing pos for geoObj");
		geoObj.getMySurroundGroup().myPosition = geoObj.getVirtualPosition(
				nullLatitude, nullLongitude, nullAltitude);
		return true;
	}

}
