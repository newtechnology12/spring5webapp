package guru.springframework.spring5webapp.boostrap;

import guru.springframework.spring5webapp.model.Author;
import guru.springframework.spring5webapp.model.Book;
import guru.springframework.spring5webapp.model.Publish;
import guru.springframework.spring5webapp.repostory.AuthorRepository;
import guru.springframework.spring5webapp.repostory.BookRepostory;
import guru.springframework.spring5webapp.repostory.PublishRepostrory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Clock;
@Component
public class BoostrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepostory bookRepostory;
    private final PublishRepostrory publishRepostrory;

    public BoostrapData(AuthorRepository authorRepository, BookRepostory bookRepostory, PublishRepostrory publishRepostrory) {
        this.authorRepository = authorRepository;
        this.bookRepostory = bookRepostory;
        this.publishRepostrory = publishRepostrory;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("start in boostrap");

        Publish publish = new Publish();
        publish.setName("albert");
        publish.setCity("kigali");
        publish.setState("rwanda");
        publishRepostrory.save(publish);

        Author albert = new Author("ALBERT","TWAYIGIZE");
        Book ddd = new Book(222L,"JAVA","nn23");
       authorRepository.save(albert);
       bookRepostory.save(ddd);


       Author mabuye = new Author("SENTONGO", "albert");
       Book book = new Book("webtechnology","234NN");

       mabuye.getBooks().add(book);
       book.getAuthors().add(mabuye);

       book.setPublish(publish);
       mabuye.getBooks().add(book);

//       book.setPublish(publish);
//       publish.getBooks().add(book);
        authorRepository.save(mabuye);
        bookRepostory.save(book);
        publishRepostrory.save(publish);



       System.out.println("number of book is : "+ bookRepostory.count());
       System.out.println("number of Author is : "+ authorRepository.count());
        System.out.println("number of publishorby id is : "+ publish.getBooks().size());
       System.out.println("publishor number of book  is : "+ publishRepostrory.count());


    }
}
