package gittasks.ExceptionsandLoggings;

public class sici {
public double simple(double p,double t,double r)
{
double si;
si=(p*t*r)/100.0;
return si;
}
public double compound(double p,double t,double r)
{
double ci;
ci=p*Math.pow(1.0+r/100.0,t)-p;
return ci;
}
}