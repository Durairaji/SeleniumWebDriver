package groups;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups= {"redmi"})
	public void redmi() {
		System.out.println("this is redmi");
	}
	@Test(groups= {"moto"})
	public void moto() {
		System.out.println("this is moto");
	}
	@Test(groups= {"iphone"})
	public void iphone() {
		System.out.println("this is iphone");
	}
	@Test(groups= {"micromax"})
	public void micromax() {
		System.out.println("this is micromax");
	}

}
