class Solution {
    public double[] convertTemperature(double celsius) 
    {
        double f= (celsius * 1.8) + 32;
        double k= celsius +273.15;

        return new double [] {k,f};
    }
}