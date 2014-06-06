package in.spa.angular.jpa.test;

import in.spa.angulr.domain.Bookmark;
import in.spa.angulr.repo.BookmarkRepo;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext-test.xml" })
@Transactional
@Ignore
public class BookmarkRepoTest {
	
	@Autowired
	private BookmarkRepo bookmarkRepo;
	
	@Test
	@Transactional
	@Rollback
	public void testInsert(){
		Bookmark bk  = new Bookmark();
		System.out.println("test run");
		
		bk.setUserName("test");
		
		bookmarkRepo.save(bk);
	}
	
	

}
