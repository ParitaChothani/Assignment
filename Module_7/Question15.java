package Module_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/*
 * W.a. junit program to use parameterized demo with multiple parameter of Facebook login in junit. 
 */

@RunWith(Parameterized.class)
public class Question15 {
String username,password;
AddDemo1 ad;
@Before
public void before() {
	ad=new AddDemo1();
	}
public Question15(String username,String password) {
	this.username=username;
	this.password=password;
}
@Parameterized.Parameters
public static Collection input() {
	return Arrays.asList(new Object[][] {{"test123@gmail.com","123"},{"tes@gmail.com","123"}});
}
@Test
public void test() throws InterruptedException {
	ad.login(username, password);
}
}
