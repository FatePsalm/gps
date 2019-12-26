package com.solace.gps.Google;

public class GoogleUtil {
    public static void main(String[] args) {
        double distance = GetDistance(104.0658400000,30.6574200000, 104.0613627434,30.57085224060613627434);
        System.out.println(distance);
    }
    private static final  double EARTH_RADIUS = 6378137;//赤道半径
    private static double rad(double d){
        return d * Math.PI / 180.0;
    }
    public static double GetDistance(double lon1,double lat1,double lon2, double lat2) {
        double radLat1 = rad(lat1);
        double radLat2 = rad(lat2);
        double a = radLat1 - radLat2;
        double b = rad(lon1) - rad(lon2);
        double s = 2 *Math.asin(Math.sqrt(Math.pow(Math.sin(a/2),2)+Math.cos(radLat1)*Math.cos(radLat2)*Math.pow(Math.sin(b/2),2)));
        s = s * EARTH_RADIUS;
        return s;//单位米
    }
}
