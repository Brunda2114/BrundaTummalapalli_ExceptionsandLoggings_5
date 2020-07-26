package gittasks.ExceptionsandLoggings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InterestTest {

@Test
public void test1() {
sici interest = new sici();
double actual1 = interest.simple(500,2,2);
assertEquals(20.0,actual1,0.001);
double actual2 = interest.compound(500,2,2);
assertEquals(20.200000000000045,actual2,0.001);
}
@Test
public void test2() {
sici interest = new sici();
double actual1 = interest.simple(1500,3,4);
assertEquals(180.0,actual1,0.001);
double actual2 = interest.compound(1500,3,4);
assertEquals(187.29600000000005,actual2,0.001);
}
@Test
public void test3() {
sici interest = new sici();
double actual1 = interest.simple(10000,4,8);
assertEquals(3200.0,actual1,0.001);
double actual2 = interest.compound(10000,4,8);
assertEquals(3604.8896000000022,actual2,0.001);
}
@Test
public void test4() {
sici interest = new sici();
double actual1 = interest.simple(40000,2,3);
assertEquals(2400.0,actual1,0.001);
double actual2 = interest.compound(40000,2,3);
assertEquals(2436.0,actual2,0.001);
}
}