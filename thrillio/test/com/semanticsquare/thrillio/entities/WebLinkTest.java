package com.semanticsquare.thrillio.entities;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.semanticsquare.thrillio.managers.BookmarkManager;

class WebLinkTest {

	@Test
	void testIsKidFriendlyEligible() {
		// test1: porn in url -- false
		WebLink weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-porn--part-2.html",
				"http://www.javaworld.com");

		boolean isKidFriendlyEligible = weblink.isKidFriendlyEligible();

		assertFalse("For porn in url - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		// test2: porn in title -- false
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming porn, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");

		isKidFriendlyEligible = weblink.isKidFriendlyEligible();

		assertFalse("For porn in title - isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		// test3: adult in host -- false
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.adult.com");

		isKidFriendlyEligible = weblink.isKidFriendlyEligible();

		assertFalse("For adult in host- isKidFriendlyEligible() must return false", isKidFriendlyEligible);

		// test4: adult in url, but not in host part -- true
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming Tiger, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-adult--part-2.html",
				"http://www.javaworld.com");

		isKidFriendlyEligible = weblink.isKidFriendlyEligible();

		assertTrue("For adult in url, but not host part - isKidFriendlyEligible() must return true",
				isKidFriendlyEligible);

		// test5: adult in title only -- true
		weblink = BookmarkManager.getInstance().createWebLink(2000, "Taming adult, Part 2",
				"http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html",
				"http://www.javaworld.com");

		isKidFriendlyEligible = weblink.isKidFriendlyEligible();

		assertTrue("For adult in title - isKidFriendlyEligible() must return true", isKidFriendlyEligible);
	}

}
