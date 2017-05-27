package com.example.demo;

import java.util.List;





import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;







public interface ReadingListRepository extends JpaRepository<Book, Long> {
	

	
	
	List<Book> findByReader(String reader); 
	
	

	List<Book> findByReaderAndTitile(String reader,String title);
	
	List<Book> findByReaderAndTitileAndAuthor(String reader,String title,String author);
	
	
	

	@Query("select b from Book b where b.titile=:name")
	Book findXxx(@Param("name") String name);

}
