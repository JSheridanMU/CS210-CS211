package haversine;

public class Haversine {
	public static final double earthRadius = 6372.8;
    public static double haversine(double lat1, double lon1, double lat2, double lon2) {
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        lat1 = Math.toRadians(lat1);
        lat2 = Math.toRadians(lat2);
 
        double a = Math.pow(Math.sin(dLat / 2),2) + Math.pow(Math.sin(dLon / 2),2) * Math.cos(lat1) * Math.cos(lat2);
        double c = 2 * Math.asin(Math.sqrt(a));
        return earthRadius * c;
    }
    public static void main(String args[]) {
    	double statueLat = 40.689247;
        double statueLong = -74.044502;
    	double notreDameLat = 48.852966;
        double notreDameLong = 2.349902;
        System.out.println(haversine(statueLat,statueLong,notreDameLat,notreDameLong));
    }
}
