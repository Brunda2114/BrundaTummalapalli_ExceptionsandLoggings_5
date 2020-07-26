package gittasks.ExceptionsandLoggings;
public class CostReq
{
public double cost(double sd,double ar)
{
	double a=ar;
	if(sd==1)
		a=a*1200;
	else if(sd==2)
		a=a*1500;
	else if(sd==3)
		a=a*1800;
	else if(sd==4)
		a=a*2500;
return a;
}
}