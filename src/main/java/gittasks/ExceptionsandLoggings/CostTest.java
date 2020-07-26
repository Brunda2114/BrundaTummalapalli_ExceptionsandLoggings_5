package gittasks.ExceptionsandLoggings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CostTest {
@Test
public void test1() {
CostReq costclass = new CostReq();
double actual = costclass.cost(1,2512);
assertEquals(3014400.0,actual,0.001);
}
@Test
public void test2() {
CostReq costclass = new CostReq();
double actual = costclass.cost(2,2512);
assertEquals(3768000.0,actual,0.001);
}
@Test
public void test3() {
CostReq costclass = new CostReq();
double actual = costclass.cost(3,2512);
assertEquals(4521600.0,actual,0.001);
}
@Test
public void test4() {
CostReq costclass = new CostReq();
double actual = costclass.cost(4,2512);
assertEquals(6280000.0,actual,0.001);
}
}